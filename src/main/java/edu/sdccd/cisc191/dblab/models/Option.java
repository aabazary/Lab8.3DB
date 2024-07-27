package edu.sdccd.cisc191.dblab.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Option {

    @Id
    private String details;

    public Option() {

    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Option(String details) {
        this.details = details;
    }
}
