/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manar
 */
public class Account {
    // Attruibutes
    private String userName;
    private String password;

    // constructor
    public Account(String userName, String password) 
    {
        this.userName = userName;
        this.password = password;
    }

    // get methods
    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    // set methods
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean login(String userName, String password){
        if( (this.userName.equals(userName))&& (this.password.equals(password)))
        {
            return true;
        } 
        return false;
    }
    
    public void logout(){
        this.userName = null;
        this.password = null;
    }
}
