/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manar
 */
import java.util.ArrayList;

public class Order {
    // Attruibute
    private String region;
    private int time;
    private String packageType;
    private String orderLocation;
    private ArrayList<Order> order = new ArrayList<Order>();
    private Payment payment;
    // constructor
    public Order(String region, int time, String packageType, String orderLocation, ArrayList<Order> order )
    {
        this.region = region;
        this.time = time;
        this.packageType = packageType;
        this.orderLocation = orderLocation;
        this.order = order;
    }
    
    // get methods

    public String getRegion() 
    {
        return region;
    }

    public int getTime()
    {
        return time;
    }

    public String getPackageType()
    {
        return packageType;
    }

    public String getOrderLocation()
    {
        return orderLocation;
    }

    public ArrayList<Order> getOrder() 
    {
        return order;
    }
    
    // set methods
    public void setRegion(String region) 
    {
        this.region = region;
    }

    public void setTime(int time) 
    {
        this.time = time;
    }

    public void setPackageType(String packageType) 
    {
        this.packageType = packageType;
    }

    public void setOrderLocation(String orderLocation)
    {
        this.orderLocation = orderLocation;
    }

    public void setOrder(ArrayList<Order> order) 
    {
        this.order = order;
    }
    
    public void addOrder(Order o)
    {
        order.add(o);
    }
    
    // set methods
    public void selectRegion(String region) 
    {
        this.region = region;
    }

    public void selectTime(int time) 
    {
        this.time = time;
    }

    public void selectPackageType(String packageType) 
    {
        this.packageType = packageType;
    }

    public int rateService(int stars){
        return stars;
    }
    /**
    public boolean confirmOrder(String region, int time, String packageType, String orderLocation, ArrayList<Order> order){
        if((this.region == region) && (this.time == time)&& (this.packageType == packageType)&&(this.orderLocation == orderLocation) &&(this.order == order))
        {
            return true;
        }
        return false;
    }*/
    
}
