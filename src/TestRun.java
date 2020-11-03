import java.util.Scanner;

public class TestRun { //Slutgiltig version av EMS Version 1.6
    static Scanner sc = new Scanner(System.in);
    static boolean loop = true;

    public static void main(String[] args) {
        do {    //Testar lite olika metoder
            //Employees[] employees = new Employees[99];
            EmpManage.addRegister();
            MenuList.welcome();
            MenuList.menuMain();
            //Prövar div menyer
            //MenuList.menuManage();
            //MenuList.menuStats();
            //Tillfällig loop-avbrytare
            loop = false;
        }while (loop);
  }

    //Detta är int-metoden för inmatning i menyerna
    public static int intInputMethod(){
        int userInput;
        try{
            Scanner sc = new Scanner(System.in);
            userInput = sc.nextInt();
            return userInput;
        } catch (Exception allExceptions){
            System.out.println("\t\nError: please insert a valid number from the menu shown");
            return userInput = 20;
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
