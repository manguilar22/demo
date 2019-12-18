package guru.aguilar.demo.domain;


import com.google.gson.Gson;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
@Data
public class User {

    private String name;
    private String email;

}
