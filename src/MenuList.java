public class MenuList {

    public static void welcome(){
        System.out.println("\n\n\t\t####################################################\t\t");
        System.out.println("\t\t##########  ---  ===  FIXON AB  ===  ---  ##########\t\t");
        System.out.println("\t\t####################################################\t\t");
        System.out.println("\t\t==  Welcome to EmployeeManagementSystem (0.1001)  ==\n");
    }

    public static void menuMain(){   //Main-menyn som presenterar alternativ
        System.out.println("\n\t\t#########################");
        System.out.println("\t\t####==  MAIN MENU  ==####");
        System.out.println("\t\t#########################");
        System.out.println("\t\t[1] - Employee Management");
        System.out.println("\t\t[2] - Employee Statistics");
        System.out.println("\t\t[0] - Exit");
        System.out.println("\nChoose: ");
        int choice = TestRun.intInputMethod();     //Denna metod kallas på i Mainmetoden för att bruka Scanner.

        switch (choice) {
            case 1:
                menuManage();
                break;
            case 2:
                menuStats();
                break;
            case 0:
                exit();
                break;
            default:
                System.out.println("Please enter [1] or [2]");
        }
    }

    public static void menuManage() {   //Manage-menyn
        System.out.println("\n\t\t###############################");
        System.out.println("\t\t##==  EMPLOYEE MANAGEMENT  ==##");
        System.out.println("\t\t###############################");
        System.out.println("\t\t[1] - Register new employee");
        System.out.println("\t\t[2] - Fire employee");
        System.out.println("\t\t[3] - Update name of employee");
        System.out.println("\t\t[4] - Update age of employee");
        System.out.println("\t\t[5] - Update department of employee");
        System.out.println("\t\t[6] - Update salary of employee");
        System.out.println("\t\t[7] - Search employee by name");
        System.out.println("\t\t[8] - Search employee by id");
        System.out.println("\t\t[9] - Search employee by department");
        System.out.println("\t\t[10] - Display all employees");
        System.out.println("\t\t[0] - Exit");
        System.out.println("\nChoose: ");
        int choice2 = TestRun.intInputMethod();
        switch (choice2) {
            case 1:
                System.out.println("Registering new employee...");
                newEmployee();
                break;
            case 2:
                menuStats();
                break;
            case 0:
                exit();
                break;
            default:
                System.out.println("Please enter [1] or [2]");
        }
    }

    public static int menuStats(){   //Statistik-menyn
        System.out.println("\n\t\t###############################");
        System.out.println("\t\t##==  EMPLOYEE STATISTICS  ==##");
        System.out.println("\t\t###############################");
        System.out.println("\t\t[1] - Average wage at the company");
        System.out.println("\t\t[2] - Highest salary at the company");
        System.out.println("\t\t[3] - Lowest salary at the company");
        System.out.println("\t\t[4] - Total bonus");
        System.out.println("\t\t[5] - Gender percentage in the company");
        System.out.println("\t\t[6] - Employee percentage of all departments");
        System.out.println("\t\t[0] - Exit");
        System.out.println("\nChoose: ");
        int choice3 = TestRun.intInputMethod();
        return choice3;
    }

    //Frågar användaren vilken avdelning | Fortsätter sedan att fråga om roll i vald avdelning
    public static String employeeDepartment() {
        String department = "";
        int choice;
        do {
            System.out.println("Select Department:\n[1] - Management\n[2] - Development");
            choice = TestRun.intInputMethod();
            if (choice == 1){               //Manager
                System.out.println("Selected: Management ");
                department = "Management";
            } else if (choice == 2){        //Secretaries
                System.out.println("Selected: Development ");
                department = "Development";
            } else {                        //Exception
                System.out.println("Please enter [1] or [2]");
            }
        }   while (choice <1 || choice > 3);
        return department;
    }

    //Frågar användaren vilken management-roll
    public static String employeeManagement() {
        String role = "";
        int choice;
        do {
            System.out.println("Select Title:\n[1] - Manager\n[2] - Secretary");
            choice = TestRun.intInputMethod();
            if (choice == 1){               //Manager
                System.out.println("Selected: Manager ");
                role = "Manager";
            } else if (choice == 2){        //Secretaries
                System.out.println("Selected: Secretary ");
                role = "Secretary";
            } else {                        //Exception
                System.out.println("Please enter [1] or [2]");
            }
        }   while (choice <1 || choice > 3);
        return role;
    }

    //Frågar användaren vilken utvecklings-roll
    public static String employeeDevelopment() {
        String role = "";
        int choice;
        do {
            System.out.println("Select title:\n[1] - Programmer\n[2] - Technician");
            choice = TestRun.intInputMethod();
            if (choice == 1){               //Manager
                System.out.println("Selected: Programmer ");
                role = "Programmer";
            } else if (choice == 2){        //Secretaries
                System.out.println("Selected: Technician ");
                role = "Technician";
            } else {                        //Exception
                System.out.println("Please enter [1] or [2]");
            }
        }   while (choice <1 || choice > 3);
        return role;
    }
//https://www.softwaretestinghelp.com/array-of-objects-in-java/
    public static void newEmployee() {
        String department = employeeDepartment();
        String role = "";
        if (department.equals("Management")){
            role = employeeManagement();
        } else if (department.equals("Development")){
            role = employeeDevelopment();
        }
        int employeeID = UniqueID.nextID();
        System.out.println("First name of new employee?");
        String firstName = TestRun.lineInputMethod();
        System.out.println("Last name of employee?");
        String lastName = TestRun.lineInputMethod();
        System.out.println("What gender is the new employee? (Male/Female)");
        String gender = TestRun.lineInputMethod();
        int dateOfBirth;
        do {
            System.out.println("Date of birth of the new employee? (YY/MM/DD)");
            dateOfBirth = TestRun.intInputMethod();
        } while (Integer.toString(dateOfBirth).length()!=6);
        System.out.println("Salary of new employee?");
        int salary = TestRun.intInputMethod();
        System.out.println("Success! New employee has been added to your database.");
        Employees m3 = new Employees(firstName, lastName, gender, department, role, dateOfBirth, employeeID, salary);
        System.out.println("Name: " + m3.getFirstName() + " " + m3.getLastName() + "\tGender: " + m3.getGender() + "\tDepartment: " + m3.getDepartment() + "\tRole: " + m3.getRole() + "\t\t\tDate of birth: " + m3.getDateOfBirth() + "\tEmployment ID: " + m3.getEmployeeID() + "\tSalary: " + m3.getSalary() + "\tWorking department: " + m3.getClass());
    }

    public static void exit() {
        System.out.println("Thank you for using EMS!");
    }
}