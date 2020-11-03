public class Secretaries extends Employees implements Specifics{

    public Secretaries(String firstName, String lastName, String gender, String department, String role, int dateOfBirth, int employeeID, int salary, boolean licence, boolean laptop, boolean coFounder) {
        super(firstName, lastName, gender, department, role, dateOfBirth, employeeID, salary, licence, laptop, coFounder);
    }
    @Override
    public double getBonus(int salary){ //Unik bonus för Secretaries
        return .14 * salary;
    }
    @Override
    public String toString() {
        return super.toString() + " (Yearly Bonus) -> " + getBonus(salary);
    }

    public static boolean licence(boolean SecChoice){
        return SecChoice;
    }

    public static boolean laptop(boolean SecChoice2){
        return SecChoice2;
    }

    public void coFounder(){
        System.out.println("Is a co-founder");
    }
}
