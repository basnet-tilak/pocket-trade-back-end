package pocket.trade.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pocket.trade.model.customer.Customer;
import pocket.trade.repository.CustomerRepository;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    public CustomerRepository customerRepository;

    public List<Customer> getAllCustomer(){
        return customerRepository.findAll();
    }
}
