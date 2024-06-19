package tr.com.huseyinaydin.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import tr.com.huseyinaydin.service.EmailService;
import tr.com.huseyinaydin.service.MessageProcessor;
import tr.com.huseyinaydin.service.MessageProcessorImpl;
import tr.com.huseyinaydin.service.MessageService;
import tr.com.huseyinaydin.service.SMSService;
import tr.com.huseyinaydin.service.TwitterService;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Boot
*
*/

@SpringBootApplication
//@ImportResource("classpath*:applicationContext.xml")
@Configuration
public class Application {

	// <bean id="emailService" class="tr.com.huseyinaydin.service.EmailService"/>
	@Bean
	public MessageService emailService() {
		return new EmailService();
	}

	@Bean
	public MessageService smsService() {
		return new SMSService();
	}

	@Bean
	public MessageService twitterService() {
		return new TwitterService();
	}

	@Bean
	public MessageProcessor messageProcessor() {
		return new MessageProcessorImpl();
	}

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
		MessageProcessor userService = applicationContext.getBean(MessageProcessor.class);
		userService.processorMsg("Çalışan servis.!");
	}
}