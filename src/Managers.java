public class Managers extends Employees implements Specifics{

    public Managers(String firstName, String lastName, String gender, String department, String role, int dateOfBirth, int employeeID, int salary, boolean licence, boolean laptop, boolean coFounder) {
        super(firstName, lastName, gender, department, role, dateOfBirth, employeeID, salary, licence, laptop, coFounder);
    }
    @Override
    public double getBonus(int salary){ //Unik bonus för Managers
        return .15 * salary;
    }
    @Override
    public String toString() {
        return super.toString() + " (Yearly Bonus) -> " + getBonus(salary);
    }

    public static boolean licence(boolean manChoice){
        return manChoice;
    }
    public static boolean laptop(boolean manChoice2){
        return manChoice2;
    }

    public void coFounder(){
        System.out.println("Is a co-founder");
    }
}
