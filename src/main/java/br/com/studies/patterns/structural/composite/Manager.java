package br.com.studies.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee{

    public Manager( int id, String name, int salary) {
        super(id, name, salary);
    }

    List<Employee> employees = new ArrayList<>();

    public Employee getChild(int i) {
        return employees.get(i);
    }

    public void print() {
        System.out.println("-------------");
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("My developers:");
        System.out.println(employees);
        System.out.println("-------------");
    }

    public void remove(Employee employee) {
        employees.remove(employee);
        System.out.println("removed:" + employee.getName());

    }

    public void add(Employee employee) {
        employees.add(employee);
        System.out.println("added:" + employee.getName());
    }
}
