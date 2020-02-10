package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @Size(min = 2, max = 50, message = "Location must be between 2 and 50 characters.")
    @NotBlank
    private String location;
    //no args constructor
    public Employer(){}
    //Parameter constructor
    public Employer(String location) {
        this.location = location;
    }


    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}