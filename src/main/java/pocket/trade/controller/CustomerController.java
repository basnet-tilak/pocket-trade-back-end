package pocket.trade.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pocket.trade.model.customer.Customer;
import pocket.trade.services.CustomerService;

import java.util.List;

@RestController("/v2")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/customer")
    public List<Customer> getCustomers(){
        return customerService.getAllCustomer();
    }
}
