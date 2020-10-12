package ar.com.ada.online.second.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Employee daniel = new Employee("Daniel", 95674567, 31);
        Employee david = new Employee("David", 25456755, 25);
        Employee gabriela = new Employee("Gabriela", 25674345, 26);
        Employee sofia = new Employee("Sofia", 54673823, 34);
        Employee hernan = new Employee("Hernan", 22367142, 28);
        Employee victoria = new Employee("Victoria", 19876345, 38);

        ArrayList<Employee> employees = new ArrayList<Employee>();

        employees.add(daniel);
        employees.add(david);
        employees.add(gabriela);
        employees.add(sofia);
        employees.add(hernan);
        employees.add(victoria);

        reportEmployeeData(employees);
        getFromEmployeesLessThanThirty(employees);
    }

    public static void reportEmployeeData(ArrayList<Employee> employees) {

        System.out.println("Empleados: ");

        for (Employee employee : employees) {
            System.out.println(employee.getName() + "  " + employee.getDni() + "  " + employee.getAge());
        }
        System.out.println("\nCantidad de empleados: " + employees.size() + "\n");
    }

    public static List getFromEmployeesLessThanThirty(ArrayList<Employee> employees) {

        ArrayList<Employee> employeesLessThanThirty = new ArrayList<>();

        employeesLessThanThirty.add(employees.get(1));
        employeesLessThanThirty.add(employees.get(2));
        employeesLessThanThirty.add(employees.get(4));

        System.out.println("Empleados menores a los 30 años:  \n" + employeesLessThanThirty.toString() + "\n");

        return employeesLessThanThirty;
}
}
