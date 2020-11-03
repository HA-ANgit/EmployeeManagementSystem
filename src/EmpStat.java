import java.util.ArrayList;
import java.util.Collections;

public class EmpStat extends EmpManage{
    static ArrayList<Integer> salary = new ArrayList<>();
    static ArrayList<String> female = new ArrayList<>();
    static ArrayList<String> male = new ArrayList<>();
    //Metoden för att räkna ut meddellön i firman
    public static void avarageSalary() {
        int avarage = 0;
        for (int i = employees.size() - 1; i >= 0; i--) {
            avarage = avarage + employees.get(i).getSalary();
        }
        System.out.println("Avarage salary is: " + avarage / employees.size());
        MenuList.menuStats();
    }

    //Metoden som räknar ut högsta lönen
    public static void highestSalary(){
        for (int i = employees.size() - 1; i >= 0; i--) {
            salary.add(employees.get(i).getSalary());
        }
        System.out.println("Highest salary is: " + Collections.max(salary));
        MenuList.menuStats();
    }

    //Metoden som letar efter lägsta lön
    public static void lowestSalary(){
        for (int i = employees.size() - 1; i >= 0; i--) {
            salary.add(employees.get(i).getSalary());
        }
        System.out.println("Lowest salary is: " + Collections.min(salary));
        MenuList.menuStats();
    }

    //Metoden som räknar ut företagets gemensamma bonus-pot
    public static void totalBonus() {//Funkar nu
        double total = 0;
        for (int i = employees.size() - 1; i >= 0; i--) {
            total = total + (employees.get(i).getBonus(i) * employees.get(i).getSalary());
        }
        System.out.println("Total bonus: " + total);
        MenuList.menuStats();
    }

    //Metoden som kollar % på företagens könsuppdelning
    public static void genderPercentage() {
        male.clear();
        female.clear();
        for (int i = 0; i < employees.size(); i++) {
            if ("male".equals(employees.get(i).getGender().toLowerCase())) {
                male.add(employees.get(i).getGender());
            } else {
                female.add(employees.get(i).getGender());
            }
        }
        double mS = male.size();
        double fS = female.size();
        double eS = employees.size();
        System.out.println("Male percentage: \t" + (mS/eS)*100);
        System.out.println("Female percentage: \t" + (fS/eS)*100);
        MenuList.menuStats();
    }

    //Metoden som kollar % på anställde mellan företagets avdelningar
    public static void depPercentage() {
        male.clear();//Återanvänder en gammal arraylist för gender till ett nytt syfte
        female.clear();
        for (int i = employees.size() - 1; i >= 0; i--) {
            if ("Management".equals(employees.get(i).getDepartment())) {
                male.add(employees.get(i).getDepartment());
            } else {
                female.add(employees.get(i).getDepartment());
            }
        }
        double mS = male.size();//Management.size
        double fS = female.size();//Development.size
        double eS = employees.size();
        System.out.println("Management percentage: \t" + (mS / eS) * 100);
        System.out.println("Development percentage: \t" + (fS / eS) * 100);
        MenuList.menuStats();
    }
}