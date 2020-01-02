package guru.aguilar.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("guru.aguilar.demo.*")
@EnableAutoConfiguration
@EnableWebMvc
public class Config {}
