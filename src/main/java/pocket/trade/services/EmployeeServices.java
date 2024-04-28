package pocket.trade.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pocket.trade.model.employee.Employee;
import pocket.trade.repository.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeServices {
    @Autowired
    private EmployeeRepository employeeRepository;
    public List<Employee> getAllEmployees(){
        return  employeeRepository.findAll();
    }
}
