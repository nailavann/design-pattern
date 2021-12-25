package com.company;

public class XpayImpl implements Xpay{
    private String creditCardNo;
    private String customerName;
    private String cardExpMonth;
    private String cardExpYear;
    private int cardCVVNo;
    private double amount;

    public XpayImpl(String creditCardNo, String customerName, String cardExpMonth, String cardExpYear, int cardCVVNo, double amount) {
        this.creditCardNo = creditCardNo;
        this.customerName = customerName;
        this.cardExpMonth = cardExpMonth;
        this.cardExpYear = cardExpYear;
        this.cardCVVNo = cardCVVNo;
        this.amount = amount;
    }

    public String getCreditCardNo() {
        return creditCardNo;
    }

    @Override
    public String getCustomerName() {
        return customerName;
    }

    @Override
    public String getCardExpMonth() {
        return cardExpMonth;
    }

    @Override
    public String getCardExpYear() {
        return cardExpYear;
    }

    @Override
    public int getCardCVVNo() {
        return cardCVVNo;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public void setCreditCardNo(String creditCardNo) {
        this.creditCardNo = creditCardNo;
    }

    @Override
    public void setCustomerName(String customerName) {

        this.customerName = customerName;
    }

    @Override
    public void setCardExpMonth(String cardExpMonth) {
        this.cardExpMonth = cardExpMonth;
    }

    @Override
    public void setCardExpYear(String cardExpYear) {
        this.cardExpYear = cardExpYear;
    }

    @Override
    public void setCVVNo(int cardCVVNo) {
        this.cardCVVNo = cardCVVNo;
    }

    @Override
    public void setAmount(double amount) {
        this.amount = amount;
    }
}
