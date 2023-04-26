package com.una.models.collaborator;

import com.una.models.Person;

public class collaboratorEntity extends Person {
    String speciality;
    boolean active;
    public collaboratorEntity(String name, String id, String lastName, String email,String speciality, boolean active){
        super(name, id, lastName, email);
        this.speciality = speciality;
        this.active = true;
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
