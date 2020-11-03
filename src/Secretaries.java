public class Secretaries extends Employees implements Languages{

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

    @Override
    public void language() {
        System.out.println("Languages used by Secretary# ENGLISH: mainly \t\t| SWEDISH: secondary");
    }

    @Override
    public void coFounder(){
        System.out.println("Is a co-founder");
    }
    @Override
    public void about() {
        System.out.println("ABOUT: A secretary is a person who is employed to help in an office, and help the people in charge of the office do their job. By definition, the main task of a secretary is to provide different services required by the staff.");
    }
}
