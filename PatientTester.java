package monday;
/** * @author Eugene */
import javax.swing.JOptionPane;
import java.sql.Date;
import java.time.LocalDate;

public class PatientTester {
    public static void main(String[] args) {
        // Create a new singly linked list for Albums
        SLList<Album> albumList = new SLList<>();
        SLList<Patient> patientList = new SLList<>();   
        while (true) {
            // Menu options
            String[] options = {"Add Patient", "Remove Patient", "View Patient", "Print All Patients", "Exit"};
            int choice = JOptionPane.showOptionDialog(null, "Choose an option", "Album Management",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        // private int id;
        // private String name;
        // private String age;
        // private String disease;
        // private String priority;

            switch (choice) {
                case 0:
                    // Add Album
                    String patientIdstr = JOptionPane.showInputDialog("Enter Patient ID:");
                    String patientNameStr = JOptionPane.showInputDialog("Enter Patient Name:");
                    String patientAgeStr = JOptionPane.showInputDialog("Enter Patient age:");
                    String diseaseStr = JOptionPane.showInputDialog("Enter Patient Disease Name:");
                    String priorityStr = JOptionPane.showInputDialog("Enter Patient priority");

                    int patientId = Integer.parseInt(patientIdstr);
                    int patientAge = Integer.parseInt(patientAgeStr);
                    int patientPriority = Integer.parseInt(priorityStr);

                    Patient newPatient = new Patient(patientId, patientNameStr, patientAge, diseaseStr, patientPriority);
                    patientList.add(newPatient);
                    break;

                case 1:
                    // Remove Album
                    String removeIndexStr = JOptionPane.showInputDialog("Enter position to remove:");
                    int removeIndex = Integer.parseInt(removeIndexStr);
                    patientList.remove(removeIndex);
                    break;

                case 2:
                    // View Album
                    String viewIndexStr = JOptionPane.showInputDialog("Enter position to view:");
                    int viewIndex = Integer.parseInt(viewIndexStr);
                    Patient patient = patientList.get(viewIndex);
                    JOptionPane.showMessageDialog(null, patient.toString());
                    break;

                case 3:
                    // Print All Albums
                    StringBuilder allPatients = new StringBuilder();
                    for (int i = 1; i <= patientList.size(); i++) {
                        allPatients.append(patientList.get(i).toString()).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, allPatients.toString());
                    break;

                case 4:
                    // Exit
                    System.exit(0);

                default:
                    break;
            }
        }
    }
}

