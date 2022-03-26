/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kulsoom
 */
public class Part4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // TODO code application logic here
        Account a = new Account("Ali2020", "1234");
        Customer c = new Customer("Ali", "9262", "ali@gmail.com" , "Muscat",a );
        
        
        boolean confirmRegister = c.registerAsCustomer("Ali", "9262", "Ali2020", "1234");
        if(confirmRegister == true){
            c.requestDelivery("Suwiq", 5,"Glass");
            System.out.println("Your request has been successfully completed");
        }
        else{
            System.out.println("Your request has been rejected because your not registered!");
        }
    }
    
      
    
}
