/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Customer.CustomerDirectory;
import Restaurant.DeliveryAgentDirectory;
import Services.MasterOrderDirectory;

/**
 *
 * @author sreeram
 */
public class Business {
    private UserAccountDirectory userAccountDirectory;
    private CustomerDirectory customerDirectory;
    private DeliveryAgentDirectory deliveryAgentDirectory;
    private MasterOrderDirectory allOrders;
    
    public Business(){
        this.userAccountDirectory= new UserAccountDirectory();
        this.customerDirectory= new CustomerDirectory();
        this.deliveryAgentDirectory= new DeliveryAgentDirectory();
        this.allOrders= new MasterOrderDirectory();
        
        UserAccount user=this.userAccountDirectory.createUserAccount("admin", "admin", "manager");
    }
    
    public static Business getBusinessInstance(){
        return new Business();
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public DeliveryAgentDirectory getDeliveryAgentDirectory() {
        return deliveryAgentDirectory;
    }

    public void setDeliveryAgentDirectory(DeliveryAgentDirectory deliveryAgentDirectory) {
        this.deliveryAgentDirectory = deliveryAgentDirectory;
    }

    public MasterOrderDirectory getAllOrders() {
        return allOrders;
    }

    public void setAllOrders(MasterOrderDirectory allOrders) {
        this.allOrders = allOrders;
    }
    
    
}
