import java.util.Scanner;

public class TestRun {
    static Scanner sc = new Scanner(System.in);
    static boolean loop = true;

    public static void main(String[] args) {
        do {    //Testar lite olika metoder
            Employees[] employees = new Employees[99];
            int i = 0;
            MenuList.welcome();
            employees[i] = new Employees(lineInputMethod(), "Andersson", "Male", "The Board", "CEO", 930621, 1001, 88600 );
            System.out.println("Name: " + employees[i].getFirstName() + " " + employees[i].getLastName() + "\tGender: " + employees[i].getGender() + "\tDepartment: " + employees[i].getDepartment() + "\tRole: " + employees[i].getRole() + "\t\t\tDate of birth: " + employees[i].getDateOfBirth() + "\tEmployment ID: " + employees[i].getEmployeeID() + "\tSalary: " + employees[i].getSalary() + "\tWorking department: " + employees[i].getClass());
            i++;
            employees[i] = new Managers();
            System.out.println("Name: " + employees[i].getFirstName() + " " + employees[i].getLastName() + "\tGender: " + employees[i].getGender() + "\tDepartment: " + employees[i].getDepartment() + "\tRole: " + employees[i].getRole() + "\t\tDate of birth: " + employees[i].getDateOfBirth() + "\tEmployment ID: " + employees[i].getEmployeeID() + "\tSalary: " + employees[i].getSalary() + "\tWorking department: " + employees[i].getClass());
            i++;
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
