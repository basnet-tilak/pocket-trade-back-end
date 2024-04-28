package pocket.trade.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pocket.trade.model.customer.Customer;
import pocket.trade.services.CustomerService;
import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/customer")
    public List<Customer> getCustomers(){
        return customerService.getAllCustomer();
    }

    @PostMapping("/customer/registration")
    public void addCustomer(@RequestBody Customer customer){
        customerService.addNewCustomer(customer);
    }

    // Delete the customer by email
    @DeleteMapping("/customer/delete/{email}")
    public void deleteCustomerByEmail(@PathVariable("email") String email){
        customerService.deleteCustomerByEmail(email.trim());
    }

    @PutMapping("/customer/update")
    public void updateCustomer(@RequestBody Customer customer){
        customerService.updateCustomer(customer);
    }
}

