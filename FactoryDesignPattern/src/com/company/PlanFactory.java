package com.company;

public class PlanFactory {

    public Plan getPlan(int type){
        if(type == 1){
            return new DomesticPlan();
        }
        else if(type == 2){
            return new ConnericalPlan();
        }
        else if(type == 3){
            return new InstitutionalPlan();
        }else{
            System.out.println("Yanlış plan seçimi!");

        }
        return null;
    }
}
