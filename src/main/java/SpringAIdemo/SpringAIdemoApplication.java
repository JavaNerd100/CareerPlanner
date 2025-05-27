package SpringAIdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;


@SpringBootApplication
@PropertySource("key.properties")
public class SpringAIdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAIdemoApplication.class, args);
	}

}
