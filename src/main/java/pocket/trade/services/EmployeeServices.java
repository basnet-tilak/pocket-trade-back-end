package pocket.trade.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pocket.trade.model.employee.Employee;
import pocket.trade.repository.EmployeeInterface;
import pocket.trade.repository.EmployeeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServices implements EmployeeInterface {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees(){
        return  employeeRepository.findAll();
    }

    // Create the customer
    public void addNewEmployee(Employee employee, String email){
        if(getEmployeeByEmail(email).isEmpty()){
            employeeRepository.save(employee);
        }else{
            System.out.println("This email is already present in database");
        }
    }

    public void deleteEmployee(String email) {
       Optional<Employee> employee =  getEmployeeByEmail(email);
        employee.ifPresent(value -> employeeRepository.delete(value));
    }
    @Override
    public Optional<Employee> getEmployeeByEmail(String email) {
        return employeeRepository.findAll()
                .stream()
                .findAny()
                .filter(customer -> customer.getEmail().equals(email));
    }
}
