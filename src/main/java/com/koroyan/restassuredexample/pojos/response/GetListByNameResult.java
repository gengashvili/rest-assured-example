package com.koroyan.restassuredexample.pojos.response;

import lombok.*;
import org.apache.commons.lang3.builder.*;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "GetListByNameResult")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class GetListByNameResult {

    private List<PersonIdentification> personIdentification;

    @XmlElement(name = "PersonIdentification")
    public List<PersonIdentification> getPersonIdentification() {
        return personIdentification;
    }

    public void setPersonIdentification(List<PersonIdentification> personIdentification) {
        this.personIdentification = personIdentification;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}
