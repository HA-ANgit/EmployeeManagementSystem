public class Managers extends Employees{
    private String role = "Manager";
    Managers (){
        super("William", "Hoover", "Male", "Management", "Head Manager", 940913, 2, 38000);
        System.out.println("Added: " + role);
    }


    //public static int choice(){}
}
