package com.company;



public class Main {

    public static void main(String[] args) {

        //ilk olarak xpay ile ödeme yapıyorduk
        Xpay xpay=new XpayImpl("1111","nail emre avan","08","23",858,10000);
//        xpay.setCreditCardNo("11111111100");
//        xpay.setCustomerName("Ali Sayar");
//        xpay.setCardExpMonth("05");
//        xpay.setCardExpYear("26");
//        xpay.setCVVNo(111);
//        xpay.setAmount(254.5);

        // payd ile ödeme yapmak için XpayToPayDAdapter sınıfına xpay'ı yolladık ve payD'ye dönüştürdük
       PayD payD = new XpayToPayDAdapter(xpay);

       change(payD);

        System.out.println("*************************************");




    }

    public static void change(PayD payD){
        System.out.println(payD.getCustCardNo());
        System.out.println(payD.getCardOwnerName());
        System.out.println(payD.getCardExpMontYear());
        System.out.println(payD.getCVVNo());
        System.out.println(payD.getTotalAmount());
    }



}
