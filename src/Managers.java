public class Managers extends Employees{
    private String role = "Manager";

    public Managers(String firstName, String lastName, String gender, String department, String role, int dateOfBirth, int employeeID, int salary) {
        super(firstName, lastName, gender, department, role, dateOfBirth, employeeID, salary);
    }
    @Override
    public double getBonus(int salary){ //Unik bonus för Managers
        return .15 * salary;
    }
    @Override
    public String toString() {
        return super.toString() + " (Yearly Bonus) -> " + getBonus(salary);
    }
}
