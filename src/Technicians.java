public class Technicians extends Employees implements Specifics {

    public Technicians(String firstName, String lastName, String gender, String department, String role, int dateOfBirth, int employeeID, int salary, boolean licence, boolean laptop, boolean coFounder) {
        super(firstName, lastName, gender, department, role, dateOfBirth, employeeID, salary, licence, laptop, coFounder);
    }
    @Override
    public double getBonus(int salary){ //Unik bonus för Tech
        return .09 * salary;
    }
    @Override
    public String toString() {
        return super.toString() + " (Yearly Bonus) -> " + getBonus(salary);
    }

    public static boolean licence(boolean TechChoice){
        return TechChoice;
    }

    public static boolean laptop(boolean TechChoice2){
        return TechChoice2;
    }
    @Override
    public void coFounder(){
        System.out.println("Is a co-founder");
    }

    @Override
    public void about() {
        System.out.println("ABOUT: The definition of a technician is a person whose job or training involves a specific technical process, or is someone skilled or trained in a specific art or craft.");
    }
}