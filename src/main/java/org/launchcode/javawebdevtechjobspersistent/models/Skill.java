package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs = new ArrayList<>();


    @Size(min = 10, max = 500, message = "Skill must be between 10 and 500 characters.")
    @NotBlank
    private String description;


    public Skill(@Size(min = 10, max = 500, message = "Skill must be between 10 and 500 characters.") @NotBlank String description) {
        this.description = description;
    }

    public Skill() {

    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }
}