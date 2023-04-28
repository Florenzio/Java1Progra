package com.una.models.collaborator;
import com.una.models.Person;
public class collaboratorEntity extends Person {
    String speciality;
    boolean active;
    String phone;
    public collaboratorEntity(String name, String id, String lastName, String email,String speciality, boolean active, String phone){
        super(name, id, lastName, email);
        this.speciality = speciality;
        this.active = true;
        this.phone = phone;
    }
    public String getSpeciality() {
        return speciality;
    }
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
    public void setPhone(String newPhone) {
        this.phone = newPhone;
    }
    public String getPhone() {
        return phone;
    }
    public String toString() {
            return "collaboratorEntity\n" +
                    "name:" + super.getName()+
                    "\nlastName: " + super.getLastName()+
                    "\nID: " + super.getId()+
                    "\nemail: " + super.getEmail()+
                    "\nspeciality: " + getSpeciality() +
                    "\nactive: " + isActive() + "\n\n";
        }


}
