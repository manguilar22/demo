package guru.aguilar.demo.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Data
@Entity
public class Country {

    @Id
    @GeneratedValue
    private Long Id;
    private String name;
    private String countryCode;
    private String district;
    private Long population;

    public Country(String name, String countryCode, String district, Long population) {
        this.name = name;
        this.countryCode = countryCode;
        this.district = district;
        this.population = population;
    }
}
