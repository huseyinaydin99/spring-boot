package tr.com.huseyinaydin.service;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Boot
*
*/

public class SMSService implements MessageService{

	@Override
	public void sendMessage(String message) {
		System.out.println("SMSService: "+ message);
	}
}