package com.company;

public interface PayD {
    public String getCustCardNo();
    public String getCardOwnerName();
    public String getCardExpMontYear();
    public int getCVVNo();
    public double getTotalAmount();

    public void setCustCardNo(String custCardNo);
    public void setCardOwnerName(String cardOwnerName);
    public void setCardExpMonthYear(String cardExpMonthYear);
    public void setCVVNo(int cVVNo);
    public void setTotalAmount(double totalAmount);
}
