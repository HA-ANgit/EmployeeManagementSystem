public class Programmers extends Employees implements Specifics{

    public Programmers(String firstName, String lastName, String gender, String department, String role, int dateOfBirth, int employeeID, int salary) {
        super(firstName, lastName, gender, department, role, dateOfBirth, employeeID, salary);
    }
    @Override
    public double getBonus(int salary){ //Unik bonus för programmers
        return .12 * salary;
    }
    @Override
    public String toString() {
        return super.toString() + " (Yearly Bonus) -> " + getBonus(salary);
    }
}