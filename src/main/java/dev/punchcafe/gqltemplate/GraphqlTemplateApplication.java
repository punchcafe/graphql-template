package dev.punchcafe.gqltemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class GraphqlTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlTemplateApplication.class, args);
	}

}
