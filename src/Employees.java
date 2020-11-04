public class Employees{
    private String firstName;
    private String lastName;
    private String gender;
    private String department;
    private String role;
    private int dateOfBirth;  //Detta önskas skapas med en int array i framtiden []-värden (Y/M/D)
    private int employeeID;
    protected int salary;
    protected boolean licence;
    protected boolean laptop;
    protected boolean coFounder;

    //Constructor som skapar objektet Employees
    public Employees(String firstName, String lastName, String gender, String department, String role, int dateOfBirth, int employeeID, int salary, boolean licence, boolean laptop, boolean coFounder) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.department = department;
        this.role = role;
        this.dateOfBirth = dateOfBirth;
        this.employeeID = employeeID;
        this.salary = salary;
        this.licence = licence;
        this.licence = laptop;
        this.licence = coFounder;
    }
    public double getBonus(int salary){ //Allmän bonus för ospecificerad employees
        return .01 * salary;
    }

    public String toString(){
        return "Name: " + firstName + " " + lastName + "\t\tGender: " + gender + "\tDepartment: " + department + "\tRole: " + role + "\t\tDate of birth: " + dateOfBirth + "\tEmployment ID: " + employeeID + "\tSalary: " + salary;
    }

    //Här startar getter & setter
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String department) {
        this.role = role;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean getLicence() {
        return licence;
    }

    public void setLicence(boolean licence) {
        this.licence = licence;
    }

    public boolean getLaptop() {
        return laptop;
    }

    public void setLaptop(boolean laptop) {
        this.laptop = laptop;
    }

    public boolean getCoFounder() {
        return coFounder;
    }

    public void setCoFounder(boolean coFounder) {
        this.coFounder = coFounder;
    }
}

