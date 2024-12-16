package in.bhargav;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Doctorconsultation2Application {

	public static void main(String[] args) {
		SpringApplication.run(Doctorconsultation2Application.class, args);
	}

}
