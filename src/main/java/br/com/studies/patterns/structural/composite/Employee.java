package br.com.studies.patterns.structural.composite;

public abstract class Employee {
    public String name;
    public int id;
    public int salary;

    public Employee(int id, String name, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public void print() {
        throw new UnsupportedOperationException();
    }

    public void add(Employee emp) {
        throw new UnsupportedOperationException();
    }

    public void remove(Employee employee) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        return "name: " + name + " id: " + id;
    }
}
