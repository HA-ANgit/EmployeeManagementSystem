public class MenuList {

    public static void welcome(){   //Slutgiltig version av EMS Version 1.6
        System.out.println("\n\n\t\t####################################################\t\t");
        System.out.println("\t\t##########  ---  ===  FIXON AB  ===  ---  ##########\t\t");
        System.out.println("\t\t####################################################\t\t");
        System.out.println("\t\t==  Welcome to EmployeeManagementSystem (1.6001)  ==\n");
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
                menuMain();
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
        System.out.println("\t\t[7] - Update specifics of employee");
        System.out.println("\t\t[8] - Display specifics of employee");
        System.out.println("\t\t[9] - Search employee by name");
        System.out.println("\t\t[10] - Search employee by id");
        System.out.println("\t\t[11] - Display employee by department");
        System.out.println("\t\t[12] - Display all employees");
        System.out.println("\t\t[0] - Go back to Main Menu!");
        System.out.println("\nChoose: ");
        int choice = TestRun.intInputMethod();
        switch (choice) {
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
                EmpManage.addSpecifics();
                break;
            case 8:
                EmpManage.showSpecifics();
                break;
            case 9:
                EmpManage.showEmpName();
                break;
            case 10:
                EmpManage.showEmpId();
                break;
            case 11:
                EmpManage.showEmpDep();
                break;
            case 12:
                EmpManage.showAllEmp();
                break;
            case 0:
                menuMain();
                break;
            default:
                System.out.println("Please enter [1] - [12]");
                menuManage();
        }
    }

    public static void menuStats(){   //Statistik-menyn
        System.out.println("\n\t\t###############################");
        System.out.println("\t\t##==  EMPLOYEE STATISTICS  ==##");
        System.out.println("\t\t###############################");
        System.out.println("\t\t[1] - Average wage at the company");
        System.out.println("\t\t[2] - Highest salary at the company");
        System.out.println("\t\t[3] - Lowest salary at the company");
        System.out.println("\t\t[4] - Total bonus");
        System.out.println("\t\t[5] - Gender percentage in the company");
        System.out.println("\t\t[6] - Employee percentage of all departments");
        System.out.println("\t\t[0] - Go back to Main Menu!");
        System.out.println("\nChoose: ");
        int choice = TestRun.intInputMethod();
        switch (choice) {
            case 1:
                EmpStat.avarageSalary();
                break;
            case 2:
                EmpStat.highestSalary();
                break;
            case 3:
                EmpStat.lowestSalary();
                break;
            case 4:
                EmpStat.totalBonus();
                break;
            case 5:
                EmpStat.genderPercentage();
                break;
            case 6:
                EmpStat.depPercentage();
                break;
            case 0:
                menuMain();
                break;
            default:
                System.out.println("Please enter [1] - [6]");
                menuStats();
        }
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
        }   while (choice <1 || choice > 2);
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

    public static boolean askLicence() {
        boolean licence = false;
        int choice;
        do {
            System.out.println("Possesses a Driving Licence:\n[1] - Yes\n[2] - No");
            choice = TestRun.intInputMethod();
            if (choice == 1){               //Yes
                System.out.println("Selected: Yes ");
                licence = true;
            } else if (choice == 2){        //No
                System.out.println("Selected: No ");
                licence = false;
            } else {                        //Exception
                System.out.println("Please enter [1] - Yes or [2] - No");
            }
        }   while (choice <1 || choice > 2);
        return licence;
    }

    public static boolean askLaptop() {
        boolean laptop = false;
        int choice;
        do {
            System.out.println("Possesses a Company-owned Laptop:\n[1] - Yes\n[2] - No");
            choice = TestRun.intInputMethod();
            if (choice == 1){               //Yes
                System.out.println("Selected: Yes ");
                laptop = true;
            } else if (choice == 2){        //No
                System.out.println("Selected: No ");
                laptop = false;
            } else {                        //Exception
                System.out.println("Please enter [1] - Yes or [2] - No");
            }
        }   while (choice <1 || choice > 2);
        return laptop;
    }

    //Metoden som avslutar
    public static void exit() {
        System.out.println("Thank you for using EMS!");
    }
}