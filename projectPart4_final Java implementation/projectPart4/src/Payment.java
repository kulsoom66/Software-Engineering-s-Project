/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kulsoom
 */
public class Payment {
    
    //Attributes
    private double totalCost;
    private String paymentMethod;

    public Payment(double totalCost, String paymentMethod) {
        this.totalCost = totalCost;
        this.paymentMethod = paymentMethod;
    }
    
  
    
    public void selectPayment(String cash, String credit){
        
    }
    
    public void cancel(){
        System.out.println("Your order has been cancelled successfuly");
        totalCost = 0;
    }
    
    public void pay(double cost){
        this.totalCost = cost;
        System.out.println("Your total cost is: "+ totalCost);
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    
    
    
}
