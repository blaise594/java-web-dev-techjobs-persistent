package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//fields inherited from AbstractEntity
@Entity
public class Employer extends AbstractEntity {
    // Employer should have a string field for location with validation
    @NotNull
    @Size(min=2, max = 100)
    private String location;


    public Employer(){

    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
