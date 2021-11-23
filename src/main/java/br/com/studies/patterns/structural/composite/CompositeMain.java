package br.com.studies.patterns.structural.composite;

public class CompositeMain {
    public static void main(String[] args) {
        Employee emp1 = new Developer(1, "John", 10000);
        Employee emp2 = new Developer(2, "David", 15000);

        Employee manager = new Manager(3, "Daniel", 25000);
        manager.add(emp1);
        manager.add(emp2);

        Employee emp3 = new Developer(33, "Michael", 20000);
        Manager generalManager = new Manager(55, "Mark", 50000);
        generalManager.add(emp3);
        generalManager.add(manager);
        generalManager.print();

        generalManager.remove(emp3);
        generalManager.print();
    }
}
