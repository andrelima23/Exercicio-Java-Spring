package one.digitalinnovation.andrelima23;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ExercicioSpringDioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExercicioSpringDioApplication.class, args);
	}

}
