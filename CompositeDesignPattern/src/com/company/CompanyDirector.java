package com.company;

import java.util.ArrayList;
import java.util.List;


public class CompanyDirector implements Employe{

    private List<Employe> employeList=new ArrayList<Employe>();

    public void addEmployee(Employe emp)
    {
        employeList.add(emp);
    }

    public void removeEmployee(Employe emp)
    {
        employeList.remove(emp);
    }
    @Override
    public void showEmployeeDetails() {
        for(Employe emp:employeList)
            emp.showEmployeeDetails();
    }

}
