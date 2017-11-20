package github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "github" })
public class Github {
	public static void main(String[] args) {
		SpringApplication.run(Github.class, args);
	}
}
