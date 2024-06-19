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

@Service(value = "TwitterService")
public class TwitterService implements MessageService {

	@Override
	public void sendMessage(String message) {
		System.out.println("TwitterService: " + message);
	}
}