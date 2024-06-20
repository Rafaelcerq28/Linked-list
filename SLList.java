package monday; // Define o pacote onde a classe está localizada

/** 
 * Classe SLList que implementa a interface LinearListInterface para gerenciar uma lista encadeada simples (Single Linked List).
 * @author Eugene
 */
public class SLList<T> implements LinearListInterface<T> {
    // Declaração de variáveis de instância
    private Node<T> head; // Referência para o primeiro nó da lista
    private Node<T> curNode; // Referência para o nó atual utilizado em operações internas
    private Node<T> prevNode; // Referência para o nó anterior ao nó atual utilizado em operações internas
    private int size; // Armazena o tamanho da lista

    // Construtor da classe SLList
    public SLList() {
        head = null; // Inicializa a cabeça da lista como null, indicando que a lista está vazia
        size = 0; // Inicializa o tamanho da lista como 0
        curNode = head; // Define o nó atual como a cabeça da lista
        prevNode = null; // Define o nó anterior como null
    }

    // Método para verificar se a lista está vazia
    @Override
    public boolean isEmpty() {
        return size == 0; // Retorna true se o tamanho da lista for 0
    }

    // Método para obter o tamanho da lista
    @Override
    public int size() {
        return size; // Retorna o tamanho atual da lista
    }

    // Método para obter o elemento em um índice específico
    @Override
    public T get(int index) {
        setCurrent(index); // Define o nó atual para o índice especificado
        return curNode.getElement(); // Retorna o elemento do nó atual
    }

    // Método para remover o elemento em um índice específico
    @Override
    public void remove(int index) {
        if (index == 1) { // Se o índice for 1 (primeiro elemento)
            head = head.getNext(); // Define a cabeça como o próximo nó
        } else {
            setCurrent(index); // Define o nó atual para o índice especificado
            prevNode.setNext(curNode.getNext()); // Define o próximo nó do nó anterior como o próximo nó do nó atual
        }
        size--; // Decrementa o tamanho da lista
    }

    // Método para adicionar um elemento em um índice específico
    @Override
    public void add(T element, int index) {
        if (index == 1) { // Se o índice for 1 (inserção no início)
            Node<T> newNode = new Node<>(element, head); // Cria um novo nó com o elemento e a cabeça atual como próximo nó
            head = newNode; // Define a cabeça como o novo nó
        } else {
            setCurrent(index); // Define o nó atual para o índice especificado
            Node<T> newNode = new Node<>(element, curNode); // Cria um novo nó com o elemento e o nó atual como próximo nó
            prevNode.setNext(newNode); // Define o próximo nó do nó anterior como o novo nó
        }
        size++; // Incrementa o tamanho da lista
    }

    // Método para adicionar um elemento no final da lista
    @Override
    public void add(T element) {
        add(element, size + 1); // Chama o método add com o índice sendo o tamanho atual da lista + 1 (final da lista)
    }

    // Método para imprimir todos os elementos da lista
    @Override
    public void printList() {
        Node<T> currentNode = head; // Inicia a partir da cabeça da lista
        while (currentNode != null) { // Continua até o final da lista
            System.out.println(currentNode.getElement().toString()); // Imprime o elemento do nó atual
            currentNode = currentNode.getNext(); // Move para o próximo nó
        }
    }

    // Método privado para definir o nó atual e o nó anterior com base em um índice
    private void setCurrent(int index) {
        int count; // Contador para rastrear a posição atual
        prevNode = null; // Inicializa o nó anterior como null
        curNode = head; // Começa a partir da cabeça da lista
        for (count = 1; count < index; count++) { // Itera até o índice especificado
            prevNode = curNode; // Atualiza o nó anterior para o nó atual
            curNode = curNode.getNext(); // Move para o próximo nó
        }
    }
}
