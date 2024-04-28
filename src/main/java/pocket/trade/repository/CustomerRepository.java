package pocket.trade.repository;

import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import pocket.trade.model.customer.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Id> {
}
