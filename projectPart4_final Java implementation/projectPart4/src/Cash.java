/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kulsoom
 */
public class Cash extends Payment{
    //Constructor
    
    
    public Cash(double totalCost, String paymentMethod){ 
        super(totalCost, paymentMethod);
    }

    public boolean collectCash(boolean confirmation) {
        return confirmation == true;
    }
    
}
