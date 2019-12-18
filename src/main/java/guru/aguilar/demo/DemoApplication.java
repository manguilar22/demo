package guru.aguilar.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

        AnnotationConfigApplicationContext aca = new AnnotationConfigApplicationContext(Config.class);

        Config.Random r = aca.getBean("random",Config.Random.class);

        System.out.println(r.iWork());


        aca.close();

	}

}
