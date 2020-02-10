package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {


    @Size(min = 10, max = 500, message = "Skill must be between 10 and 500 characters.")
    @NotBlank
    public String skill;

    public Skill(@Size(min = 10, max = 500, message = "Skill must be between 10 and 500 characters.") @NotBlank String skill) {
        this.skill = skill;
    }

    public Skill() {

    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

}