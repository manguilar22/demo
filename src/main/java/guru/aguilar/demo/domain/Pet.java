package guru.aguilar.demo.domain;


import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity             //  @GeneratedValue(strategy=GenerationType.AUTO)
public class Pet {

    @Id
    @GeneratedValue
    private Long Id;
    private String name;
    private String type;


    public Pet(){}

    public Pet(String name,String type){
        this.name = name;
        this.type = type;
    }

}
