package com.company;

public class Developer implements Employe{
    private String name;
    private int empId;
    private String position;



    public Developer(String name, int empId, String position) {
        this.name = name;
        this.empId = empId;
        this.position = position;

    }
    @Override
    public void showEmployeeDetails() {
        System.out.println("Developer");
        System.out.println("Ad:"+name+" Id:"+empId+" Position:"+position);

    }
}
