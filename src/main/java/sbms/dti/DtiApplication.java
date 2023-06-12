package sbms.dti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DtiApplication {

	public static void main(String[] args) {
		Hello hello = new Hello();
		hello.setData("helloworld!");
		String data = hello.getData();
		System.out.println("data: "+data);

		SpringApplication.run(DtiApplication.class, args);
	}

}
