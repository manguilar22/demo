package guru.aguilar.demo;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableAutoConfiguration
@EnableWebMvc
@ComponentScan("guru.aguilar.demo.*")
@EnableJpaRepositories
public class Config {

    protected class Random {

        Random(){}
        String iWork(){return "I WORK";}
    }

    @Bean
    public Random random() { return  new Random(); }



}

