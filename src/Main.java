import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Employee employee1=new Employee("Baikal",15, 500000);
        Employee employee2=new Employee("Samagan",15,200000);
        Employee employee3=new Employee("Kumarbek",15,200000);
        Employee employee4=new Employee("Dilnaz",17,499999);
        Employee employee5=new Employee("Bilal",12,1000);
        Employee[] employees={employee1,employee2,employee3,employee4,employee5};
        Company company=new Company("Tinkoff",employees);
        System.out.println(company.toString());
    }
}