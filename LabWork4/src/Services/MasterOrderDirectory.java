/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Customer.Customer;
import Restaurant.DeliveryAgent;
import java.util.ArrayList;

/**
 *
 * @author sreeram
 */
public class MasterOrderDirectory {
    
    ArrayList<Order> orderList;
    
    public MasterOrderDirectory(){
        this.orderList= new ArrayList<Order>();
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
    
    public Order createOrder(Customer customer, DeliveryAgent del){
        Order o = new Order(customer, del);
        this.orderList.add(o);
        return o;
    }
    
    public Order requestorder(Customer customer){
        Order o = new Order();
        o.setCustomer(customer);
        
        this.orderList.add(o);
        return o;
    }
    
    public Order assignOrder(Order o, DeliveryAgent del){
        o.setAgent(del);
        return o;
    }
    
}
