package pocket.trade.repository;

import pocket.trade.model.employee.Employee;

import java.util.Optional;

public interface EmployeeInterface {
    Optional<Employee> getEmployeeByEmail(String email);
}
