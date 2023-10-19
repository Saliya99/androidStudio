package com.example.sqlite.employeecrud;

public class Employee {
    private int id;
    private String name;
    private String dep;
    private String salary;

    public Employee() {
        // Default constructor
    }

    public Employee(int id, String name, String dep, String salary) {
        this.id = id;
        this.name = name;
        this.dep = dep;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return dep;
    }

    public void setDepartment(String department) {
        this.dep = department;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

}
