package site.sonisori.sonisori;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
public class SonisoriApplication {

	public static void main(String[] args) {
		SpringApplication.run(SonisoriApplication.class, args);
	}

}
