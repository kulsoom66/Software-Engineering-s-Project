/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kulsoom
 */
public class Credit extends Payment{
    
    //attributes
    private int cardNumber;
    private int pin;
    private int expiredDate;

    public Credit(int cardNumber, int pin, int expiredDate, double totalCost, String paymentMethod) {
        super(totalCost, paymentMethod);
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.expiredDate = expiredDate;
    }
    
    //get methods
    public int getCardNumber(){
        return cardNumber;
    }
    
    public int getPin(){
        return pin;
    }
    
    public int getExpiredDate(){
        return expiredDate;
    }
    
    //set methods
    public void setCardNumber(int Cardnum){
        this.cardNumber = Cardnum;
    }
    
    public void setPin(int pin){
        this.pin = pin;
    }
    
    public void setExpiredDate(int date){
        this.expiredDate = date;
    }
    
    public boolean confirmTransiction(int cardNumber, int pin, int expiredDate, double totalCost, String paymentMethod){
        if((this.cardNumber == cardNumber) && (this.pin==pin)&& (this.expiredDate == expiredDate) && (super.getTotalCost() == totalCost) && (super.getPaymentMethod() == paymentMethod))
        {
            return true;
        }
        else{
            return false;
        }
    }
}
