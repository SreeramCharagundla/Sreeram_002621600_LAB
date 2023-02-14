/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author sreeram
 */
public class UserAccountDirectory {
    ArrayList <UserAccount> userAccountList;
    
    public UserAccountDirectory(){
        this.userAccountList= new ArrayList<UserAccount>();

    }
    
    public UserAccount createUserAccount(String username, String password, String role){
        UserAccount user= new UserAccount(username, password, role);
        
        userAccountList.add(user);
        return user;
    }
    
    public UserAccount findById(String id){
        for(UserAccount u: this.userAccountList){
               if(u.getAccountId().equals(id)){
                   return u;
               }
        }
        return null;
    }
    
    public UserAccount getUserAccount(String username, String password, String role){
        for(UserAccount u: this.userAccountList){
            if(u.getUsername().equals(username) && u.getPassword().equals(password) && u.getRole().equals(role)){
                   return u;
               }
        }
        return null;
    }
    
    public Boolean accountExists(String username, String password, String role){
        for(UserAccount u: this.userAccountList){
            if(u.getUsername().equals(username) && u.getPassword().equals(password) && u.getRole().equals(role)){
                   return true;
               }
        }
        return false;

    }
}
