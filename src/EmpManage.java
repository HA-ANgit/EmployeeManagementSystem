import java.lang.reflect.Array;
import java.util.ArrayList;

public class EmpManage {

    static ArrayList<Employees> employees = new ArrayList<>();
    //Adderar databas med anställda
    public static void addRegister(){
        Employees e1 = new Employees("Hannes", "Andersson  ", "Male", "Management", "CEO\t\t\t\t", 930111, 1, 88600);
        Employees e2 = new Managers("Alexander", "Östlund ", "Male", "Management", "Head of Managers\t", 702431, 2, 64000);
        Employees e3 = new Secretaries("Salvador", "De Gardie", "Male", "Management", "Head of Secretary\t", 870631, 3, 32000);
        Employees e4 = new Programmers("Ane-Li", "Frisk Bonde", "Female", "Development", "Head of Programmers", 900426, 4, 57000);
        Employees e5 = new Technicians("Sofie", "Abrahamsson ", "Female", "Development", "Head of Tech\t\t", 890412, 5, 45000);
        Employees e6 = new Managers("Ylva von", "Samuelsson", "Female", "Management", "Manager\t\t\t", 920314, 6, 32800);
        Employees e7 = new Managers("Peter-Niklas", "Risk  ", "Male", "Management", "Manager\t\t\t", 930009, 7, 31900);
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);
        employees.add(e7);
    }
    //Metoden för att addera ny anställd
    public static void newEmployee(){
        String department = MenuList.employeeDepartment();
        String role = "";
        if (department.equals("Management")){
            role = MenuList.employeeManagement();
        } else if (department.equals("Development")){
            role = MenuList.employeeDevelopment();
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
        System.out.println("Success! New " + role + " has been added to your database.");
        if (role.equalsIgnoreCase("Manager")){
            Employees i = new Managers(firstName, lastName, gender, department, role, dateOfBirth, employeeID, salary);
            System.out.println("Name: " + i.getFirstName() + " " + i.getLastName() + "\tGender: " + i.getGender() + "\tDepartment: " + i.getDepartment() + "\tRole: " + i.getRole() + "\t\t\tDate of birth: " + i.getDateOfBirth() + "\tEmployment ID: " + i.getEmployeeID() + "\tSalary: " + i.getSalary() + "\tWorking department: " + i.getClass());
            employees.add(i);
        } else if (role.equalsIgnoreCase("Secretary")){
            Employees i = new Secretaries(firstName, lastName, gender, department, role, dateOfBirth, employeeID, salary);
            System.out.println("Name: " + i.getFirstName() + " " + i.getLastName() + "\tGender: " + i.getGender() + "\tDepartment: " + i.getDepartment() + "\tRole: " + i.getRole() + "\t\t\tDate of birth: " + i.getDateOfBirth() + "\tEmployment ID: " + i.getEmployeeID() + "\tSalary: " + i.getSalary() + "\tWorking department: " + i.getClass());
            employees.add(i);
        } else if (role.equalsIgnoreCase("Technicians")){
            Employees i = new Technicians(firstName, lastName, gender, department, role, dateOfBirth, employeeID, salary);
            System.out.println("Name: " + i.getFirstName() + " " + i.getLastName() + "\tGender: " + i.getGender() + "\tDepartment: " + i.getDepartment() + "\tRole: " + i.getRole() + "\t\t\tDate of birth: " + i.getDateOfBirth() + "\tEmployment ID: " + i.getEmployeeID() + "\tSalary: " + i.getSalary() + "\tWorking department: " + i.getClass());
            employees.add(i);
        } else if (role.equalsIgnoreCase("Programmer")){
            Employees i = new Programmers(firstName, lastName, gender, department, role, dateOfBirth, employeeID, salary);
            System.out.println("Name: " + i.getFirstName() + " " + i.getLastName() + "\tGender: " + i.getGender() + "\tDepartment: " + i.getDepartment() + "\tRole: " + i.getRole() + "\t\t\tDate of birth: " + i.getDateOfBirth() + "\tEmployment ID: " + i.getEmployeeID() + "\tSalary: " + i.getSalary() + "\tWorking department: " + i.getClass());
            employees.add(i);
        } else {
            Employees i = new Employees(firstName, lastName, gender, department, role, dateOfBirth, employeeID, salary);
            System.out.println("Name: " + i.getFirstName() + " " + i.getLastName() + "\tGender: " + i.getGender() + "\tDepartment: " + i.getDepartment() + "\tRole: " + i.getRole() + "\t\t\tDate of birth: " + i.getDateOfBirth() + "\tEmployment ID: " + i.getEmployeeID() + "\tSalary: " + i.getSalary() + "\tWorking department: " + i.getClass());
            employees.add(i);
        }
        MenuList.menuManage();
    }
    //Huvudmenyn för att avskeda
    public static void removeEmployee(){
        System.out.println("\t\t[1] - Remove Employee by ID");
        System.out.println("\t\t[2] - Remove Employee by First Name");
        System.out.println("\t\t[0] - Go back");
        System.out.println("\nChoose: ");
        int choice = TestRun.intInputMethod();
        switch (choice) {
            case 1:
                removeEmployeeId();
                break;
            case 2:
                removeEmployeeName();
                break;
            case 0:
                MenuList.menuManage();
                break;

            default:
                System.out.println("Please enter [1] or [2]");
        }
        MenuList.menuManage();
    }
    //Undermeny för att avskeda anställd efter namn
    public static void removeEmployeeName(){
        System.out.println("Enter name to fire employee: ");
        String name = TestRun.lineInputMethod();

        for (int i = employees.size() -1; i >= 0; i--) {
            if (employees.get(i).getFirstName().equalsIgnoreCase(name)){
                System.out.println("Employee: " + employees.get(i).toString());
                System.out.println("Has been fired!");
                employees.remove(employees.get(i));
            }
        }
    }
    //Undermeny som avskedar anställd efter ID
    public static void removeEmployeeId(){
        System.out.println("Enter ID to fire employee: ");
        int iD = TestRun.intInputMethod();

        for (int i = employees.size() -1 ; i >= 0; i--) {
            if (employees.get(i).getEmployeeID() == iD){
                System.out.println(employees.get(i));
                System.out.println("Has been fired!");
                employees.remove(employees.get(i));
            }
        }
    }
    //Metoden för att uppdatera Namn på en anställd
    public static void updateEmpName(){
        System.out.println("Enter ID for Employee: ");
        int iD = TestRun.intInputMethod();

/*        for (int i = employees.size() -1 ; i >= 0; i--) {
            if (employees.get(i).getEmployeeID() == iD){
                System.out.println(employees.get(i).toString());
                System.out.println("Updating name of: " + employees.get(i).toString());
                System.out.println("Update First Name: ");
                String newName = TestRun.lineInputMethod();
                employees.get(i).setFirstName(newName);
                System.out.println("Update Last Name: ");
                String newLast = TestRun.lineInputMethod();
                employees.get(i).setLastName(newLast);
                System.out.println("Update Successful for: " + employees.get(i).toString());
            }
            MenuList.menuManage();
        }*/

        for (Employees employees : employees) {
            if (employees.getEmployeeID() == iD){
                System.out.println("Updating name of: " + employees.toString());
                System.out.println("Update First Name: ");
                String newName = TestRun.lineInputMethod();
                employees.setFirstName(newName);
                System.out.println("Update Last Name: ");
                String newLast = TestRun.lineInputMethod();
                employees.setLastName(newLast);
                System.out.println("Update Successful for: " + employees.toString());
            }
            MenuList.menuManage();
        }
    }
    //Metoden för att uppdatera Ålder på en anställd
    public static void updateEmpAge(){
        System.out.println("Enter ID for Employee: ");
        int iD = TestRun.intInputMethod();
        for (Employees employees : employees) {
            if (employees.getEmployeeID() == iD){
                do {
                    System.out.println("Enter new age(YY/MM/DD): ");
                    int newAge = TestRun.intInputMethod();
                    employees.setDateOfBirth(newAge);
                } while (Integer.toString(employees.getDateOfBirth()).length()!=6);
                System.out.println("Employee is now updated as: " + employees);
            }else{
                System.out.println("Employee ID not found!");
            }
            MenuList.menuManage();
        }
    }
    //Metoden för att uppdatera avdelning för en anställd
    public static void updateEmpDep(){
        System.out.println("Enter ID for Employee: ");
        int iD = TestRun.intInputMethod();
        for (Employees employees : employees) {

            if (employees.getEmployeeID() == iD) {
                System.out.println("Update department for: " + iD);
                employees.setDepartment(MenuList.employeeDepartment());
            }else{
                System.out.println("Employee ID not found!");
            }
            MenuList.menuManage();
        }
    }
    //Metoden för att uppdatera lönen för en anställd
    public static void updateEmpSal(){
        System.out.println("Enter ID for Employee: ");
        int iD = TestRun.intInputMethod();
        for (Employees employees : employees) {
            if (employees.getEmployeeID() == iD) {
                System.out.println("Update salary for: " + iD);
                System.out.println("Enter:");
                employees.setSalary(TestRun.intInputMethod());
            }else{
                System.out.println("Employee ID not found!");
            }
            MenuList.menuManage();
        }
    }
    //Metoden som söker anställd efter ID
    public static void showEmpId(){
        System.out.println("Search Employee by ID: ");
        int empId = TestRun.intInputMethod();

        for (Employees employees : employees) {
            if (employees.getEmployeeID() == empId) {
                System.out.println("Result from ID-Search: " + empId);
            }else{
                System.out.println("Employee ID not found!");
            }
            MenuList.menuManage();
        }
    }
    //Metoden som söker anställd efter förnamn
    public static void showEmpName(){
        System.out.println("Search Employee by First Name: ");
        String empName = TestRun.lineInputMethod();

        for (Employees employees : employees) {
            if (employees.getFirstName().equals(empName)) {
                System.out.println("Result from Name-Search: " + employees);
            }else{
                System.out.println("Employee not found!");
            }
            MenuList.menuManage();
        }
    }
    //Metoden som söker anställd efter avdelning
    public static void showEmpDep(){
        System.out.println("Search Employees by Department: ");
        String empDep = MenuList.employeeDepartment();
        for (Employees employees : employees) {
            if (employees.getDepartment().equals(empDep)) {
                System.out.println("Result from Department Search: " + employees);
            }else{
                System.out.println("Error! Search not completed!");
            }
            MenuList.menuManage();
        }
    }
    //Metoden för att visa alla anställda
    public static void showAllEmp(){
        System.out.println("Total number of employees: " + employees.size());
        System.out.println("All employees: ");
        for (Employees employees : employees) {
            System.out.println(employees);
        }
        /*Arrays.sort(employees);
        showData(employees());*/
        MenuList.menuManage();
    }
}