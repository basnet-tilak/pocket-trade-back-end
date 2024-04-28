package pocket.trade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pocket.trade.model.employee.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    public Employee getEmployeeByEmail(String email);
}
