package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("Enter a name of data: ");
        System.out.print("Enter a name of employee:  ");
        employee.nome = sc.nextLine();
        System.out.print("Enter a gross Salary of employee:  ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Enter a the tax gross salary: ");
        employee.Tax = sc.nextDouble();
        
        System.out.println(employee);

        System.out.print("Which a percentage to increase salary: ");
        Double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);
        System.out.println(employee);  

        sc.close();
    }
}

