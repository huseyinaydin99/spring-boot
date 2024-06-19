package tr.com.huseyinaydin.service;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring Boot
*
*/

public class MessageProcessorImpl implements MessageProcessor {

	MessageService messageService;
	
	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}

	@Override
	public void processorMsg(String message) {
		System.out.println("MessageProcessorImpl"+ message);
	}

	public MessageProcessorImpl(MessageService messageService) {
		this.messageService = messageService;
	}
}