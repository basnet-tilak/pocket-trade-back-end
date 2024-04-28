package pocket.trade.repository;

import pocket.trade.model.employee.Employee;

import java.util.Map;
import java.util.Optional;

public interface EmployeeInterface {
    Optional<Employee> getEmployeeByEmail(String email);
    void updateEmployee(Employee employee);
    Map<String, String> loginEmployeeByEmail(String username);
}
