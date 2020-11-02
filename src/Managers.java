public class Managers extends Employees{
    private String role = "Manager";

    public Managers(String firstName, String lastName, String gender, String department, String role, int dateOfBirth, int employeeID, int salary) {
        super(firstName, lastName, gender, department, role, dateOfBirth, employeeID, salary);
    }
}
