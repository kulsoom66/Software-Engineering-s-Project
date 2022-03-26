/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manar
 */
public class Person {
    // Attribuite
    private String name;
    private String phoneNum;
    private String emailAddress;
    
    // constructore
    public Person (String name, String phoneNum, String emailAddress)
    {
        this.name = name;
        this.phoneNum = phoneNum;
        this.emailAddress = emailAddress;
    }
    
    // method: edit info
    // edit personal information for person
    public void editlnfo (String name, String phoneNum, String emailAddress)
    {
        this.name = name;
        this.phoneNum = phoneNum;
        this.emailAddress = emailAddress;
    }
    
    // get methods
    public String getName()
    {
        return name;
    
    }
    
    public String getPhoneNum()
    {
        return phoneNum;
    
    }
    
    public String getEmailAddress()
    {
        return emailAddress;
    
    }
    
    // set methods
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setPhoneNum(String phoneNum)
    {
        this.phoneNum = phoneNum;
    }
    
    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }
}
