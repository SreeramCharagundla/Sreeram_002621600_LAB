/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurant;

import java.util.ArrayList;

/**
 *
 * @author sreeram
 */
public class DeliveryAgentDirectory {
    
    ArrayList<DeliveryAgent> agentlist;
    
    public  DeliveryAgentDirectory(){
        this.agentlist= new ArrayList<DeliveryAgent>();
    }

    public ArrayList<DeliveryAgent> getAgentlist() {
        return agentlist;
    }

    public void setDeliveryAgentlist(ArrayList<DeliveryAgent> deliveryAgentlist) {
        this.agentlist = deliveryAgentlist;
    }

    
    public DeliveryAgent findById(String id){
        for(DeliveryAgent agent: this.agentlist){
            if(agent.getPersonId().equals(id)){
                return agent;
            }
        }
        return null;
    }
    
    public DeliveryAgent createDeliveryAgent(String id, String name, String age){
        DeliveryAgent agent = new DeliveryAgent();
        agent.setPersonId(id);
        agent.setName(name);
        agent.setAge(age);
        
        this.agentlist.add(agent);
        return agent;
    }
    
}
