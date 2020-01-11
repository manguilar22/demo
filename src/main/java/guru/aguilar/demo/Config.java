package guru.aguilar.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("guru.aguilar.demo.*")
@EnableAutoConfiguration
//@EnableWebMvc
public class Config {}
