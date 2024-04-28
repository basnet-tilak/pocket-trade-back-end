package pocket.trade.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pocket.trade.model.customer.Customer;
import pocket.trade.repository.CustomerInterface;
import pocket.trade.repository.CustomerRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements CustomerInterface {
    @Autowired
    public CustomerRepository customerRepository;

    public List<Customer> getAllCustomer(){
        return customerRepository.findAll();
    }

    // Create the customer
    public void addNewCustomer(Customer customer, String email){
        if(getCustomerByEmail(email).isEmpty()){
            customerRepository.save(customer);
        }else{
            System.out.println("This email is already present in database");
        }
    }

    // It will return the Customer if match the by email
    @Override
    public Optional<Customer> getCustomerByEmail(String email) {
       return customerRepository.findAll()
               .stream()
               .findAny()
               .filter(customer -> customer.getEmail().equals(email));
    }
}
