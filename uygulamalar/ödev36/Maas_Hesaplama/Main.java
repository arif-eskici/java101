package ödev36.Maas_Hesaplama;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Kemal", 2000, 45, 1985);
        employee1.toString();
        System.out.println("====================================");

        Employee employee2 = new Employee("Arif", 5000, 40, 2015);
        employee2.toString();
        System.out.println("====================================");

        Employee employee3 = new Employee("Ahmet", 10000, 50, 2000);
        employee3.toString();
    }
}
