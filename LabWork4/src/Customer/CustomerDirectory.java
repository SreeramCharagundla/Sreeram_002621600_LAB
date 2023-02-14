/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;

import java.util.ArrayList;

/**
 *
 * @author sreeram
 */
public class CustomerDirectory {
    
    ArrayList<Customer> customerlist;
    
    public CustomerDirectory(){
        this.customerlist= new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomerlist() {
        return customerlist;
    }

    public void setCustomerlist(ArrayList<Customer> customerlist) {
        this.customerlist = customerlist;
    }
    
    
    public Customer findById(String id){
        for(Customer c: this.customerlist){
            if(c.getPersonId().equals(id)){
                return c;
            }
        }
        return null;
    }
    
    public Customer createCustomer(String id, String name, String age){
        Customer c = new Customer();
        c.setPersonId(id);
        c.setName(name);
        c.setAge(age);
        
        this.customerlist.add(c);
        return c;
    }
    
    
    
}
