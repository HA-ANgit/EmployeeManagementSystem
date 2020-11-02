import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class EmpManage {

    static ArrayList<Employees> employees = new ArrayList<>();
    //Adderar databas
    public static void addRegister(){
        Employees e1 = new Employees("Hannes", "Andersson", "Male", "Management", "CEO", 930111, 1001, 88600 );
        Employees e2 = new Managers("Gusten", "Volge", "Male", "Management", "Head of Managers", 702431, 1000, 64000);
        Employees e3 = new Secretaries("Salvador", "De La Gardie", "Male", "Management", "Head of Secretary", 870631, 999, 32000);
        Employees e4 = new Programmers("Ana", "Frisk", "Female", "Development", "Head of Programmers", 900426, 998, 57000);
        Employees e5 = new Technicians("Sofie", "Bonde", "Female", "Development", "Head of Tech", 890412, 997, 45000);
        Employees e6 = new Managers("Ylva", "Samuelsson", "Female", "Management", "Head of Managers", 920314, 1002, 32800);
        Employees e7 = new Managers("Niklas", "Risk", "Male", "Management", "Head of Managers", 930009, 1003, 31900);
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);
        employees.add(e7);
    }
    //Metoden för att addera anställd
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
    //Metoden för att avskeda anställd efter namn
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
    //Metoden som avskedar anställd efter ID
    public static void removeEmployeeId(){
        System.out.println("Enter ID to fire employee: ");
        int iD = TestRun.intInputMethod();

        for (int i = employees.size() -1; i >= 0; i--) {

            if (employees.get(i).getEmployeeID() == iD){
                System.out.println(employees);
                System.out.println("Has been fired!");
                employees.remove(employees.get(i));
            }else {
                System.out.println("Employee ID not found!");
            }
        }
    }
    //Metoden för att uppdatera Namn på en anställd
    public static void updateEmpName(){
        System.out.println("Enter ID for Employee: ");
        int iD = TestRun.intInputMethod();

        for (Employees employees : employees) {
            if (employees.getEmployeeID() == iD){
                System.out.println("Update First Name: ");
                String newName = TestRun.lineInputMethod();
                employees.setFirstName(newName);
                System.out.println("Update Last Name: ");
                String newLast = TestRun.lineInputMethod();
                employees.setLastName(newLast);
                System.out.println("Employee is now updated as: " + "Name: " + employees.getFirstName() + " " + employees.getLastName() + "\tGender: " + employees.getGender() + "\tDepartment: " + employees.getDepartment() + "\tRole: " + employees.getRole() + "\t\t\tDate of birth: " + employees.getDateOfBirth() + "\tEmployment ID: " + employees.getEmployeeID() + "\tSalary: " + employees.getSalary());
            }else{
                System.out.println("Employee ID not found!");

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
        System.out.println("All employees: " + Arrays.toString(employees.toArray()));
        /*Arrays.sort(employees);
        showData(employees());*/
        MenuList.menuManage();
    }

    public static void showData(){
        System.out.println(Arrays.toString(employees.toArray()));
        System.out.println();
    }
}