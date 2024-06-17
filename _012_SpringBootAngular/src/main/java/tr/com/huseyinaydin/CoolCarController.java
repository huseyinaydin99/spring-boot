package tr.com.huseyinaydin;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.stream.Collectors;

//بسم الله الرحمن الرحيم
/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Boot, Angular.
* 
*/

@RestController
class CoolCarController {
    private CarRepository repository;

    public CoolCarController(CarRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/cool-cars")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<Car> coolCars() {
        return repository.findAll().stream()
                .filter(this::isCool)
                .collect(Collectors.toList());
    }

    private boolean isCool(Car car) {
        return !car.getName().equals("Reno") &&
                !car.getName().equals("Serçedes") &&
                !car.getName().equals("Anadol") &&
                !car.getName().equals("Broadway");
    }
}