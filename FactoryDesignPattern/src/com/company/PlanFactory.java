package com.company;

public class PlanFactory {
    Plan p;
    public Plan getPlan(int type){
        if(type == 1){
            p = new DomesticPlan();
        }
        else if(type == 2){
            p = new ConnericalPlan();
        }
        else if(type == 3){
            p = new InstitutionalPlan();
        }else{
            System.out.println("Yanlış plan seçimi!");

        }
        return p;
    }
}
