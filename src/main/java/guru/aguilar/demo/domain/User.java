package guru.aguilar.demo.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long Id;
    private String name;
    private String email;


    public User(){}

    public User(String name, String email){
        this.name = name;
        this.email = email;
    }

}
