package kai.coach.remake.controller;

import kai.coach.remake.dao.MessageDAO;
import kai.coach.remake.entity.Customer;
import kai.coach.remake.entity.Message;
import kai.coach.remake.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/message")
public class MessageController {
    @Autowired
    MessageService messageService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Message getMessage(@PathVariable("id") Integer messageId){
        return this.messageService.getMessage(messageId);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody()
    public Message addMessage(@RequestBody Message message) {
        return this.messageService.addMessage(message);
    }

    @RequestMapping(value = "/customerRef/{id}", method = RequestMethod.GET)
    public List<Message> getMessageByCustomer(@PathVariable("id") Integer customerId){
        return this.messageService.getMessagesByCustomer(customerId);
    }
}
