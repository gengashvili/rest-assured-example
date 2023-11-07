package com.koroyan.restassuredexample.pojos.response;

import groovy.transform.EqualsAndHashCode;
import lombok.*;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "PersonIdentification")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class PersonIdentification {

    private int id;
    private String name, ssn, dob;

    @XmlElement(name = "ID")
    public int getId() {
        return id;
    }

    @XmlElement(name = "Name")
    public String getName() {
        return name;
    }

    @XmlElement(name = "SSN")
    public String getSsn() {
        return ssn;
    }

    @XmlElement(name = "DOB")
    public String getDob() {
        return dob;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

}
