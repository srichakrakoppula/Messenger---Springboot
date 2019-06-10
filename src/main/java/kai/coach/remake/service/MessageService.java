package kai.coach.remake.service;

import kai.coach.remake.dao.MessageDAO;
import kai.coach.remake.entity.Customer;
import kai.coach.remake.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ExecutionException;

@Service
public class MessageService {

    @Autowired
    MessageDAO messageDao;

    public Message getMessage(Integer messageId){
        return this.messageDao.getOne(messageId);
    }

    public Message addMessage(Message message){
        return this.messageDao.save(message);
    }

//    public List<Message> getMessagesByCustomer(Integer customerId){
//        List<Message> messages = null;
//        try {
//            messages = this.messageDao.findMessagesByCustomerRef(customerId).get();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }
//        return messages;
//    }


        public List<Message> getMessagesByCustomer(Integer customerId){
        List<Message> messages = null;
//        System.out.println(customerId.toString());
        messages = this.messageDao.findMessagesByCustomerRef(customerId);
        return messages;
    }
}
