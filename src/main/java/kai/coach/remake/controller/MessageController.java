package kai.coach.remake.controller;

import kai.coach.remake.dao.MessageDAO;
import kai.coach.remake.entity.Message;
import kai.coach.remake.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/message")
public class MessageController {
    @Autowired
    MessageService messageService;

    public Message getMessage(Integer messageId){
        return this.messageService.getMessage(messageId);
    }

    public List<Message> getMessageByCustomer(Integer customerId){
        return this.messageService.getMessagesByCustomer(customerId);
    }
}
