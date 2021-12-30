package com.company;

public class Manager implements Employe{

    private String name;
    private int empId;
    private String position;

    public Manager(String name, int empId, String position) {
        this.name = name;
        this.empId = empId;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("Manager");
        System.out.println("Ad:" + name + " Id:" + empId + " Position:" + position);
    }
}
