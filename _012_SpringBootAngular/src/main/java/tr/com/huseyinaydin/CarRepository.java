package tr.com.huseyinaydin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

//بسم الله الرحمن الرحيم
/**
* 
* @author Huseyin_Aydin
* @since 1994
* @category Java, Spring Boot, Angular.
* 
*/

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
interface CarRepository extends JpaRepository<Car, Long> {
}