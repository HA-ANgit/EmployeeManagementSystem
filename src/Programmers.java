public class Programmers extends Employees implements Languages{

    public Programmers(String firstName, String lastName, String gender, String department, String role, int dateOfBirth, int employeeID, int salary, boolean licence, boolean laptop, boolean coFounder) {
        super(firstName, lastName, gender, department, role, dateOfBirth, employeeID, salary, licence, laptop, coFounder);
    }
    @Override
    public double getBonus(int salary){ //Unik bonus för programmers
        return .12 * salary;
    }
    @Override
    public String toString() {
        return super.toString() + " (Yearly Bonus) -> " + getBonus(salary);
    }

    public static boolean licence(boolean ProChoice){
        return ProChoice;
    }

    public static boolean laptop(boolean ProChoice2){
        return ProChoice2;
    }

    @Override
    public void language() {
        System.out.println("Languages knowledge for Programmer# JAVA: mandatory \t\t| DART: mandatory \t\t| C++: useful\t\t| JAVASCRIPT: useful");
    }

    @Override
    public void coFounder(){
        System.out.println("Is a co-founder");
    }
    @Override
    public void about() {
        System.out.println("ABOUT: A programmer is an individual that writes/creates computer software or applications by giving the computer specific programming instructions.");
    }
}