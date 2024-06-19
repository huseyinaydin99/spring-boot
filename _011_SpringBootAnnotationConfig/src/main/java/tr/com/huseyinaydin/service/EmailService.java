package tr.com.huseyinaydin.service;

import org.springframework.stereotype.Service;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Boot
*
*/

@Service(value="EmailService")
public class EmailService implements MessageService {

	@Override
	public void sendMessage(String message) {
		System.out.println("EmailService: " + message);
	}
}