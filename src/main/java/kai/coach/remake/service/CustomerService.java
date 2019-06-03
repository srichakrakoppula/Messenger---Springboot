package kai.coach.remake.service;

import kai.coach.remake.dao.CustomerDAO;
import kai.coach.remake.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerDAO customerDao;

    public List<Customer> getAllCustomers(){
        return this.customerDao.findAll();
    }

    public Customer addCustomer(Customer customer){
        return this.customerDao.save(customer);
    }
}

