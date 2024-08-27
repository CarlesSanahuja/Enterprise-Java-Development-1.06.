import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Crear un arrays de empleados
        Employee[] employees = new Employee[10];

        // Crear 8 objetos Employee
        employees[0] = new Employee("Alice", "alice@example.com", 30, 45000);
        employees[1] = new Employee("Bob", "bob@example.com", 25, 50000);
        employees[2] = new Employee("Charlie", "charlie@example.com", 28, 52000);
        employees[3] = new Employee("David", "david@example.com", 35, 60000);
        employees[4] = new Employee("Eve", "eve@example.com", 22, 48000);
        employees[5] = new Employee("Frank", "frank@example.com", 40, 70000);
        employees[6] = new Employee("Grace", "grace@example.com", 32, 55000);
        employees[7] = new Employee("Heidi", "heidi@example.com", 26, 47000);

        // Crear 2 objetos Intern
        employees[8] = new Intern("Ivan", "ivan@example.com", 21, 18000);
        employees[9] = new Intern("Judy", "judy@example.com", 23, 20000);

        // Escribir empleados en el archivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("employees.txt"))) {
            for (Employee employee : employees) {
                writer.write(employee.toString());
                writer.newLine();
            }
            System.out.println("Empleados escritos en employees.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}