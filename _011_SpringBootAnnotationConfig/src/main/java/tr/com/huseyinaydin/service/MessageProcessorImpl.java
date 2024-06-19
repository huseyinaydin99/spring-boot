package tr.com.huseyinaydin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//بسم الله الرحمن الرحيم
/**
 *
 * @author Huseyin_Aydin
 * @since 1994
 * @category Spring Boot
 *
 */

@Service(value = "MessageProcessor")
public class MessageProcessorImpl implements MessageProcessor {

	@Autowired
	// @Inject
	@Qualifier(value = "EmailService")
	MessageService messageService;

	public MessageProcessorImpl() {
		super();
	}

	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}

	@Override
	public void processorMsg(String message) {
		System.out.println("MessageProcessorImpl" + message);
	}

	public MessageProcessorImpl(MessageService messageService) {
		this.messageService = messageService;
	}
}