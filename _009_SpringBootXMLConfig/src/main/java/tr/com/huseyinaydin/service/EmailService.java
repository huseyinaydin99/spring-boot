package tr.com.huseyinaydin.service;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Boot
*
*/

public class EmailService implements MessageService {

	@Override
	public void sendMessage(String message) {
		System.out.println("EmailService: " + message);
	}
}