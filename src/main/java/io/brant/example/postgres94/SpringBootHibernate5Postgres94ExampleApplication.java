package io.brant.example.postgres94;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement(proxyTargetClass = true)
public class SpringBootHibernate5Postgres94ExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHibernate5Postgres94ExampleApplication.class, args);
	}
}
