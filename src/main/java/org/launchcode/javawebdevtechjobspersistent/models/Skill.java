package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {
    //a field for a longer description of the skill
    @NotNull
    @Size(min=3, max=300)
    private String description;

    public Skill(){

    }
}