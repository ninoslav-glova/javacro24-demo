package hr.javacro.demo.crag;

import org.springframework.boot.SpringApplication;

public class TestCragApplication {

	public static void main(String[] args) {
		SpringApplication.from(CragApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
