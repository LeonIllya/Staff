package org.example.app.entity;

public class Employee {

    private final String name;
    private final String phone;
    private final String position;
    private final int salary;

    public Employee(String name, String phone, String position, int salary) {
        this.name = name;
        this.phone = phone;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary(){
        return salary;
    }
}
