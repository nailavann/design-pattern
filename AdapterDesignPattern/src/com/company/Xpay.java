package com.company;

public interface Xpay {
    public String getCreditCardNo();
    public String getCustomerName();
    public String getCardExpMonth();
    public String getCardExpYear();
    public int getCardCVVNo();
    public double getAmount();

    public void setCreditCardNo(String creditCardNo);
    public void setCustomerName(String customerName);
    public void setCardExpMonth(String cardExpMonth);
    public void setCardExpYear(String cardExpYear);
    public void setCVVNo(int cardCVVNo);
    public void setAmount(double amount);
}
