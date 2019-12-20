package guru.aguilar.demo.domain;


import com.google.gson.Gson;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
@Data
public class User {

    private Long Id;
    private String name;
    private String email;


    public User(){}

    public User(String name, String email){
        this.name = name;
        this.email = email;
    }

}
