

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.person.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class Day2Application {

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(Day2Application.class, args);
		Person pas=new Person(1,"Akila",18);
		ObjectMapper obj=new ObjectMapper();
		String str=obj.writeValueAsString(pas);
		System.out.println(str);
	}

}
