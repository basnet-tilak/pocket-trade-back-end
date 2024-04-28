package pocket.trade.repository;

import pocket.trade.model.customer.Customer;

import java.util.Optional;

public interface CustomerInterface {
    Optional<Customer> getCustomerByEmail(String email);
}
