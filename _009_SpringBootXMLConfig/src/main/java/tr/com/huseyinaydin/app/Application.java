package tr.com.huseyinaydin.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import tr.com.huseyinaydin.service.MessageProcessor;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Boot
*
*/

@SpringBootApplication
@ImportResource("classpath*:applicationContext.xml")
public class Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
		MessageProcessor userService = applicationContext.getBean(MessageProcessor.class);
		userService.processorMsg("Çalışan servisimsin servisim toz kaldırma!!!!!");	
	}
}