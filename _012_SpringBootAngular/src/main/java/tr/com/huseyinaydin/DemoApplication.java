package tr.com.huseyinaydin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import java.util.stream.Stream;

//بسم الله الرحمن الرحيم
/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Boot, Angular.
* 
*/

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    //Gül gül ölürsün.
    @Bean
    ApplicationRunner init(CarRepository repository) {
        return args -> {
            Stream.of("BMW", "Şahin", "Broadway", "Lamborghini", "Toros",
                      "AMC Gremlin", "Serçedes", "Anadol", "Yugo GV").forEach(name -> {
                Car car = new Car();
                car.setName(name);
                repository.save(car);
            });
            repository.findAll().forEach(System.out::println);
        };
    }
}