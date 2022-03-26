/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manar
 */
public class Customer extends Person{
    // Attruibutes
    private String address;
    private Account account;
    private Order order;
    
    // Constructore
    public Customer(String name, String phoneNum, String emailAddress, String address, Account account) 
    {
        super(name, phoneNum, emailAddress);
        this.address = address;
        this.account = account;
    }
    
    // get method
    public String getAddress()
    {
        return address;
    
    }
    
    // set method
    public void setAddress(String address)
    {
        this.address = address;
    }


    public boolean registerAsCustomer(String name, String phoneNum, String userName, String password)
    {
        super.setName(name);
        super.setPhoneNum(phoneNum);
        boolean result = account.login(userName, password);
        
        if( result == true)
            return true;
        return false;
    }
    
    
    public void requestDelivery(String region, int time, String packageType){
            order.selectPackageType(packageType);
            order.selectTime(time);
            order.selectRegion(region); 
    }
}