/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author sreeram
 */
public class Contact {
    Long officePhone;
    String officeEmail;
    
    Long personalPhone;
    String personalEmail;

    public Long getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(Long officePhone) {
        this.officePhone = officePhone;
    }

    public String getOfficeEmail() {
        return officeEmail;
    }

    public void setOfficeEmail(String officeEmail) {
        this.officeEmail = officeEmail;
    }

    public Long getPersonalPhone() {
        return personalPhone;
    }

    public void setPersonalPhone(Long personalPhone) {
        this.personalPhone = personalPhone;
    }

    public String getPersonalEmail() {
        return personalEmail;
    }

    public void setPersonalEmail(String personalEmail) {
        this.personalEmail = personalEmail;
    }
            
}
