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
        System.out.println("\t\t[0] - Go Back!");
        System.out.println("\nChoose: ");
        int choice2 = TestRun.intInputMethod();
        switch (choice2) {
            case 1:
                System.out.println("Registering new employee...");
                EmpManage.newEmployee();
                break;
            case 2:
                EmpManage.removeEmployee();
                break;
            case 3:
                EmpManage.updateEmpName();
                break;
            case 4:
                EmpManage.updateEmpAge();
                break;
            case 5:
                EmpManage.updateEmpDep();
                break;
            case 6:
                EmpManage.updateEmpSal();
                break;
            case 7:
                EmpManage.showEmpName();
                break;
            case 8:
                EmpManage.showEmpId();
                break;
            case 9:
                EmpManage.showEmpDep();
                break;
            case 10:
                EmpManage.showAllEmp();
                break;
            case 0:
                menuMain();
                break;
            default:
                System.out.println("Please enter [1] - [10]");
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
        int choice = TestRun.intInputMethod();
        return choice;
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
        }   while (choice <1 || choice > 2);
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
        }   while (choice <1 || choice > 2);
        return role;
    }

    public static void exit() {
        System.out.println("Thank you for using EMS!");
    }
}