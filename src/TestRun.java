import java.util.Scanner;

public class TestRun {
    static Scanner sc = new Scanner(System.in);
    static boolean loop = true;

    public static void main(String[] args) {
        do {    //Testar lite olika metoder
            MenuList.welcome();
            Employees m1 = new Employees("Hannes", "Andersson", "Male", "The Board", "CEO", 930621, 1001, 88600 );
            Managers m2 = new Managers();
            System.out.println("Name: " + m1.getFirstName() + " " + m1.getLastName() + "\tGender: " + m1.getGender() + "\tDepartment: " + m1.getDepartment() + "\tRole: " + m1.getRole() + "\t\t\tDate of birth: " + m1.getDateOfBirth() + "\tEmployment ID: " + m1.getEmployeeID() + "\tSalary: " + m1.getSalary() + "\tWorking department: " + m1.getClass());
            System.out.println("Name: " + m2.getFirstName() + " " + m2.getLastName() + "\tGender: " + m2.getGender() + "\tDepartment: " + m2.getDepartment() + "\tRole: " + m2.getRole() + "\t\tDate of birth: " + m2.getDateOfBirth() + "\tEmployment ID: " + m2.getEmployeeID() + "\tSalary: " + m2.getSalary() + "\tWorking department: " + m2.getClass());
                //Prövar alla menyer
            MenuList.menuMain();
            MenuList.menuManage();
            MenuList.menuStats();

            //Tillfällig loop-avbrytare
            loop = false;
        }while (loop);
  }

    //public static void displayEmployee(choice){}

    //Detta är int-metoden för inmatning i menyerna
    public static int intInputMethod(){
        int userInput;
        try{
            Scanner sc = new Scanner(System.in);
            userInput = sc.nextInt();
            return userInput;
        } catch (Exception allExceptions){
            System.out.println("\t\nError: please insert a valid number from the menu shown");
            return userInput = 0;
        }
    }
    //Detta är String-metoden för inmatning i menyerna
    public static String lineInputMethod(){
        String userInput;
        try{
            Scanner sc = new Scanner(System.in);
            userInput = sc.nextLine();
            return userInput;
        } catch (Exception allExceptions){
            System.out.println("\t\nError: please insert a valid String");
            return userInput = "";
        }
    }
}
