/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author sreeram
 */
public class Student {
    Long NUID;
    String firstName;
    String lastName;
    String collegeName;
    
    Contact contact;
    Address address;
    
    public Student(){
    this.firstName="";
    this.lastName="";
    this.collegeName="";
    
    this.address = new Address();
    this.contact = new Contact();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public Long getNUID() {
        return NUID;
    }

    public void setNUID(Long NUID) {
        this.NUID = NUID;
    }
    
    
    public static void main (String args[]){
    Student student = new Student();
    student.setFirstName("Sreeram");
    student.setLastName("C");
    student.setCollegeName("NEU");
    
    Address add = student.getAddress();
    add.setcStreetName("68 day st");
    add.setcAptNo("1");
    add.setcCity("Bos");
    add.setcZipCode(0112);
    
    add.setpStreetName("68 day St");
    add.setpAptNo("1");
    add.setpCity("Bos");
    add.setpZipCode(0112);
    
    Contact con = student.getContact();
    con.setOfficeEmail("abcd@neu.edu");
    con.setOfficePhone(1111111111l);
    con.setPersonalEmail("abcd@gmail.com");
    con.setPersonalPhone(1111111111l);
    }
}
