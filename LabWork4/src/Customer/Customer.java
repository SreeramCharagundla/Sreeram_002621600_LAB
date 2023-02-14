/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;

import Personnel.Person;
import Services.Order;
import java.util.ArrayList;

/**
 *
 * @author sreeram
 */
public class Customer extends Person{
    
    private int ordersTotal;
    
    private ArrayList<Order> customerOrderList;
    
    public Customer(){
        super();
        this.customerOrderList = new ArrayList<Order>();
    }

    public int getOrdersTotal() {
        return ordersTotal;
    }

    public void setOrdersTotal(int ordersTotal) {
        this.ordersTotal = ordersTotal;
    }

    public ArrayList<Order> getCustomerOrderList() {
        return customerOrderList;
    }

    public void setCustomerOrderList(ArrayList<Order> customerOrderList) {
        this.customerOrderList = customerOrderList;
    }
    
    public void addOrder(Order order){
        this.customerOrderList.add(order);
    }
    
    
}
