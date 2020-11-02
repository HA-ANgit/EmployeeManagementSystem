public class Secretaries extends Employees {

    public Secretaries(String fname, String lname, String gender, String department, String role, int dateOfBirth, int employeeID, int salary) {
        super(fname, lname, gender, department, role, dateOfBirth, employeeID, salary);
    }
    @Override
    public double getBonus(int salary){ //Unik bonus för Secretaries
        return .14 * salary;
    }
    @Override
    public String toString() {
        return super.toString() + " (Yearly Bonus) -> " + getBonus(salary);
    }
}
