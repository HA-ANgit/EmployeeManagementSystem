import java.util.ArrayList;

public class EmpManage {

    static ArrayList<Employees> employees = new ArrayList<>();
    //Adderar databas med anställda
    public static void addRegister(){
        Employees e1 = new Employees("Hannes", "Andersson  ", "Male", "Management", "CEO\t\t\t\t", 930111, UniqueID.nextID(), 88600, true, true, true);
        Employees e2 = new Managers("Alexander", "Östlund ", "Male", "Management", "Head of Managers\t", 702431, UniqueID.nextID(), 64000, true, true, true);
        Employees e3 = new Secretaries("Salvador", "De Gardie", "Male", "Management", "Head of Secretary\t", 870631, UniqueID.nextID(), 32000, true, true, false);
        Employees e4 = new Programmers("Ane-Li", "Frisk Bonde", "Female", "Development", "Head of Programmers", 900426, UniqueID.nextID(), 57000, false, true, true);
        Employees e5 = new Technicians("Sofie", "Abrahamsson ", "Female", "Development", "Head of Tech\t\t", 890412, UniqueID.nextID(), 45000, false, true, false);
        Employees e6 = new Managers("Ylva von", "Samuelsson", "Female", "Management", "Manager\t\t\t", 920314, UniqueID.nextID(), 32800, false, true, false);
        Employees e7 = new Managers("Peter-Niklas", "Risk  ", "Male", "Management", "Manager\t\t\t", 930009, UniqueID.nextID(), 31900, false, true, false);
        Employees e8 = new Secretaries("Peter", "Oxenstjärna  ", "Male", "Management", "Secretary\t\t\t", 800703, UniqueID.nextID(), 30850, true, false, false);
        Employees e9 = new Programmers("Ola-Tore", "Lavender  ", "Male", "Development", "Programmer\t\t", 881009, UniqueID.nextID(), 37200, true, true, false);
        Employees e10 = new Technicians("Anna-Karin", "Samuelsson", "Female", "Development", "Technician\t\t", 920314, UniqueID.nextID(), 36400, true, true, false);
        Employees e11 = new Technicians("Robert Ludvig", "Stolt", "Male", "Management", "Technician\t\t", 691129, UniqueID.nextID(), 48600, true, false, false);
        Employees e12 = new Managers("Alexandra", "Björk   ", "Female", "Management", "CCO\t\t\t\t", 790221, UniqueID.nextID(), 84000, false, true, false);
        Employees e13 = new Secretaries("Tim", "Pålsson        ", "Male", "Management", "Secretary\t\t\t", 890221, UniqueID.nextID(), 42000,false, true, false);
        Employees e14 = new Technicians("Olga", "Debrawski    ", "Female", "Development", "Technician\t\t", 950406, UniqueID.nextID(), 52300,false, false, true);

        e1.setCoFounder(true);
        e2.setCoFounder(true);
        e4.setCoFounder(true);
        e14.setCoFounder(true);


        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);
        employees.add(e7);
        employees.add(e8);
        employees.add(e9);
        employees.add(e10);
        employees.add(e11);
        employees.add(e12);
        employees.add(e13);
        employees.add(e14);
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
            Managers i = new Managers(firstName, lastName, gender, department, role, dateOfBirth, employeeID, salary, false, false, false);
            System.out.println("Name: " + i.getFirstName() + " " + i.getLastName() + "\tGender: " + i.getGender() + "\tDepartment: " + i.getDepartment() + "\tRole: " + i.getRole() + "\t\t\tDate of birth: " + i.getDateOfBirth() + "\tEmployment ID: " + i.getEmployeeID() + "\tSalary: " + i.getSalary() + "\tDebug class: " + i.getClass());
            i.about();
            employees.add(i);
        } else if (role.equalsIgnoreCase("Secretary")){
            Secretaries i = new Secretaries(firstName, lastName, gender, department, role, dateOfBirth, employeeID, salary,false, false, false);
            System.out.println("Name: " + i.getFirstName() + " " + i.getLastName() + "\tGender: " + i.getGender() + "\tDepartment: " + i.getDepartment() + "\tRole: " + i.getRole() + "\t\t\tDate of birth: " + i.getDateOfBirth() + "\tEmployment ID: " + i.getEmployeeID() + "\tSalary: " + i.getSalary() + "\tDebug class: " + i.getClass());
            i.language();
            i.about();
            employees.add(i);
        } else if (role.equalsIgnoreCase("Technician")){
            Technicians i = new Technicians(firstName, lastName, gender, department, role, dateOfBirth, employeeID, salary,false, false, false);
            System.out.println("Name: " + i.getFirstName() + " " + i.getLastName() + "\tGender: " + i.getGender() + "\tDepartment: " + i.getDepartment() + "\tRole: " + i.getRole() + "\t\t\tDate of birth: " + i.getDateOfBirth() + "\tEmployment ID: " + i.getEmployeeID() + "\tSalary: " + i.getSalary() + "\tDebug class: " + i.getClass());
            i.about();
            employees.add(i);
        } else if (role.equalsIgnoreCase("Programmer")){
            Programmers i = new Programmers(firstName, lastName, gender, department, role, dateOfBirth, employeeID, salary,false, false, false);
            System.out.println("Name: " + i.getFirstName() + " " + i.getLastName() + "\tGender: " + i.getGender() + "\tDepartment: " + i.getDepartment() + "\tRole: " + i.getRole() + "\t\t\tDate of birth: " + i.getDateOfBirth() + "\tEmployment ID: " + i.getEmployeeID() + "\tSalary: " + i.getSalary() + "\tDebug class: " + i.getClass());
            i.language();
            i.about();
            employees.add(i);
        } else {
            Employees i = new Employees(firstName, lastName, gender, department, role, dateOfBirth, employeeID, salary, false, false, false);
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
                System.out.println("Employee: \n" + employees.get(i).toString());
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
    public static void updateEmpName() {
        System.out.println("Enter ID for Employee: ");
        int iD = TestRun.intInputMethod();

        for (int i = employees.size() - 1; i >= 0; i--) {
            if (employees.get(i).getEmployeeID() == iD) {
                System.out.println("Updating name of: \n" + employees.get(i).toString());
                System.out.println("Update First Name: ");
                String newName = TestRun.lineInputMethod();
                employees.get(i).setFirstName(newName);
                System.out.println("Update Last name: ");
                String newLast = TestRun.lineInputMethod();
                employees.get(i).setLastName(newLast);
                System.out.println("Update successful for: \n" + employees.get(i).toString());
            }
        }
        MenuList.menuManage();
    }

    //Metoden för att uppdatera Ålder på en anställd
    public static void updateEmpAge() {
        System.out.println("Enter ID for Employee: ");
        int iD = TestRun.intInputMethod();

        for (int i = employees.size() - 1; i >= 0; i--) {
            if (employees.get(i).getEmployeeID() == iD) {
                do {
                    System.out.println("Updating date of birth of: \n" + employees.get(i).toString());
                    System.out.println("Enter new age(YY/MM/DD): ");
                    int newAge = TestRun.intInputMethod();
                    employees.get(i).setDateOfBirth(newAge);
                } while (Integer.toString(employees.get(i).getDateOfBirth()).length() != 6);
                System.out.println("Employee is now updated as: \n" + employees.get(i).toString());
            }
        }
        MenuList.menuManage();
    }

    //Metoden för att uppdatera avdelning för en anställd
    public static void updateEmpDep() {
        System.out.println("Enter ID for Employee: ");
        int iD = TestRun.intInputMethod();

        for (int i = employees.size() - 1; i >= 0; i--) {
            if (employees.get(i).getEmployeeID() == iD) {
                System.out.println("Update department for: \n" + employees.get(i).toString());
                employees.get(i).setDepartment(MenuList.employeeDepartment());
            }
        }
        MenuList.menuManage();
    }

    //Metoden för att uppdatera lönen för en anställd
    public static void updateEmpSal() {
        System.out.println("Enter ID for Employee: ");
        int iD = TestRun.intInputMethod();

        for (int i = employees.size() - 1; i >= 0; i--) {
            if (employees.get(i).getEmployeeID() == iD) {
                System.out.println("Update salary for: \n" + employees.get(i).toString());
                System.out.println("Enter new salary:");
                employees.get(i).setSalary(TestRun.intInputMethod());
                System.out.println(employees.get(i).getFirstName() + " has gotten a new salary: " + employees.get(i).getSalary());
            }

        }
        MenuList.menuManage();
    }

    //Metoden som söker anställd efter ID
    public static void showEmpId() {
        System.out.println("Search Employee by ID: ");
        int iD = TestRun.intInputMethod();

        for (int i = employees.size() - 1; i >= 0; i--) {
            if (employees.get(i).getEmployeeID() == iD) {
                System.out.println("Result from ID-Search: \n" + employees.get(i).toString());
            }
        }
        MenuList.menuManage();
    }

    //Metoden som söker anställd efter förnamn
    public static void showEmpName() {
        System.out.println("Search Employee by First Name: ");
        String empName = TestRun.lineInputMethod();

        for (int i = employees.size() - 1; i >= 0; i--) {
            if (employees.get(i).getFirstName().equalsIgnoreCase(empName)) {
                System.out.println("Result from Name-Search: \n" + employees.get(i).toString());
            }
        }
        MenuList.menuManage();
    }

    //Metoden som söker anställd efter avdelning
    public static void showEmpDep() {
        System.out.println("Search Employees by Department: ");
        String empDep = MenuList.employeeDepartment();
        System.out.println("Result from " + empDep + "-department Search: ");

        for (int i = employees.size() - 1; i >= 0; i--) {
            if (employees.get(i).getDepartment().equals(empDep)) {
                System.out.println(employees.get(i).toString());
            }
        }
        MenuList.menuManage();
    }

    //Metoden för att visa alla anställda
    public static void showAllEmp(){
        System.out.println("Total number of employees: " + employees.size());
        System.out.println("All employees listed: ");

        for (Employees employees : employees) {
            System.out.println(employees);
        }
        MenuList.menuManage();
    }

    //Metoden som söker upp anställs specifikationer
    public static void showSpecifics(){
        System.out.println("Search Employee-Specifics by ID: ");
        int iD = TestRun.intInputMethod();

        for (int i = employees.size() - 1; i >= 0; i--) {
            if (employees.get(i).getEmployeeID() == iD) {
                System.out.println("Result from ID-Search: \n" + employees.get(i).toString());
                System.out.println("Any specifics is added below: \n");
                System.out.println("Driving Licence: " + employees.get(i).getLicence() + " | Laptop: " + employees.get(i).getLaptop() + " | Extra notes: " + employees.get(i).coFounder);
            }
            if (employees.get(i).getEmployeeID() == 1 || employees.get(i).getEmployeeID() == 2 || employees.get(i).getEmployeeID() == 4 || employees.get(i).getEmployeeID() == 14){
                System.out.println("Note: " + employees.get(i).getFirstName() + " is a Co-Founder.");
            }
        }
        MenuList.menuManage();
    }

    //Metoden som uppdaterar eller adderar specifikationer för anställda
    public static void addSpecifics(){
        System.out.println("Search Employee by ID to add Specifics: ");
        int iD = TestRun.intInputMethod();

        for (int i = employees.size() - 1; i >= 0; i--) {
            if (employees.get(i).getEmployeeID() == iD) {
                System.out.println("Result from ID-Search: \n" + employees.get(i).toString());
                String role = employees.get(i).getClass().descriptorString();
                if (role.equalsIgnoreCase("LManagers;")){
                    employees.get(i).setLicence(Managers.licence(MenuList.askLicence()));
                    employees.get(i).setLaptop(Managers.laptop(MenuList.askLaptop()));
                } else if (role.equalsIgnoreCase("LSecretaries;")){
                    employees.get(i).setLicence(Secretaries.licence(MenuList.askLicence()));
                    employees.get(i).setLaptop(Secretaries.laptop(MenuList.askLaptop()));
                } else if (role.equalsIgnoreCase("LProgrammers;")){
                    employees.get(i).setLicence(Programmers.licence(MenuList.askLicence()));
                    employees.get(i).setLaptop(Programmers.laptop(MenuList.askLaptop()));
                } else if (role.equalsIgnoreCase("LTechnicians;")){
                    employees.get(i).setLicence(Technicians.licence(MenuList.askLicence()));
                    employees.get(i).setLaptop(Technicians.laptop(MenuList.askLaptop()));
                } else {
                    System.out.println(employees.get(i).getFirstName() + " is a protected employee and can't be changed.");
                }
            }
        }
        MenuList.menuManage();
    }
}