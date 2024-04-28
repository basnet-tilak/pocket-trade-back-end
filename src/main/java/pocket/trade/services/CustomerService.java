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
    public void addNewCustomer(Customer customer){
       boolean isCustomerEmailIsPresent = customerRepository
                                                .findAll().stream()
                                                .anyMatch(customer1 -> customer1.getEmail().equals(customer.getEmail()));
       boolean isCustomerContactIsPresent = customerRepository
                                                .findAll().stream()
                                                .anyMatch(cus -> cus.getContact().equals(customer.getContact()));

       if( isCustomerContactIsPresent || isCustomerEmailIsPresent){
           System.out.println("Email or Contact is already present in database");
       }else{
           customerRepository.save(customer);
       }
    }

    public void deleteCustomerByEmail(String email) {
        for(Customer customer: getAllCustomer()){
            if(customer.getEmail().equals(email)){
                customerRepository.delete(customer);
            }
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

    @Override
    public void updateCustomer(Customer customer) {
        List<Customer> customers = customerRepository.findAll();
        for (Customer c : customers) {
            if (customer.getId().equals(c.getId())) {
                customerRepository.save(customer);
            } else {
                System.out.println(customer.getFirstName() + " Customer not found in the database");
            }
        }
    }
}
