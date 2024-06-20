package monday;

public class Patient {
    private int id;
    private String name;
    private int age;
    private String disease;
    private int priority;

    public Patient(int id, String name, int age, String disease, int priority) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Patient: \nId= " + id + 
                "\n Name= " + name + 
                "\n Age= " + age + 
                "\n Disease= " + disease + 
                "\n Priority= "+ priority + "\n\n";
    }

    
    
}
