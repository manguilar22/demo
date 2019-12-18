package guru.aguilar.demo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
//@EnableWebMvc
@ComponentScan("guru.aguilar.demo.*")
public class Config {

    protected class Random {

        Random(){}
        String iWork(){return "I WORK";}
    }

    @Bean
    public Random random() { return  new Random(); }



}

