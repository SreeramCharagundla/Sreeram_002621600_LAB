/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnel;

/**
 *
 * @author sreeram
 */
public class Person {
    String personId;
    String name;
    String age;
    
    public Person(){
        
    }
    
    public Person(String personId,String name,String age){
         this.personId = personId;
         this.name=name;
         this.age= age;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    
    @Override
    public String toString(){
        return this.personId;
    }
}
