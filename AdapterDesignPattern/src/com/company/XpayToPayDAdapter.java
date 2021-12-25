package com.company;

public class XpayToPayDAdapter implements PayD{
    private String custCardNo;
    private String cardOwnerName;
    private String cardExpMonthYear;
    private int cVVNo;
    private double totalAmount;

    private final Xpay xpay;

    public XpayToPayDAdapter(Xpay xpay){
        this.xpay = xpay;
        setCustCardNo(this.xpay.getCreditCardNo());
        setCardOwnerName(this.xpay.getCustomerName());
        setCardExpMonthYear(this.xpay.getCardExpMonth() + "/" + this.xpay.getCardExpYear());
        setCVVNo(this.xpay.getCardCVVNo());
        setTotalAmount(this.xpay.getAmount());
    }

    @Override
    public String getCustCardNo() {
        return custCardNo;
    }

    @Override
    public String getCardOwnerName() {
        return cardOwnerName;
    }

    @Override
    public String getCardExpMontYear() {
        return cardExpMonthYear;
    }

    @Override
    public int getCVVNo() {
        return cVVNo;
    }

    @Override
    public double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public void setCustCardNo(String custCardNo) {
        this.custCardNo = custCardNo;
    }

    @Override
    public void setCardOwnerName(String cardOwnerName) {
        this.cardOwnerName = cardOwnerName;
    }

    @Override
    public void setCardExpMonthYear(String cardExpMonthYear) {
        this.cardExpMonthYear = cardExpMonthYear;
    }

    @Override
    public void setCVVNo(int cVVNo) {
        this.cVVNo = cVVNo;
    }

    @Override
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

}
