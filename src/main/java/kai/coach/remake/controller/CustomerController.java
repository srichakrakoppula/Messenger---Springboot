package kai.coach.remake.controller;

import kai.coach.remake.entity.Customer;
import kai.coach.remake.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService custService;

    @RequestMapping(value="/all", method= RequestMethod.GET)
    public List<Customer> getAllCustomers(){
        return custService.getAllCustomers();
    }

    @RequestMapping(value="/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody()
    public Customer addCustomer(@RequestBody Customer customer){
        return this.custService.addCustomer(customer);
    }
}
