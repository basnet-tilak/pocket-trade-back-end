package pocket.trade.repository;

import pocket.trade.model.employee.Employee;

public interface EmployeeInterface {
    public Employee getEmployeeByEmail(String email);
}
