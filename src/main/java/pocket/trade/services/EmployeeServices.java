package pocket.trade.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pocket.trade.model.employee.Employee;
import pocket.trade.repository.EmployeeInterface;
import pocket.trade.repository.EmployeeRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
        if(employee.isPresent()){
            employeeRepository.delete(employee.get());
        }else{
            System.out.println(email+ "This is not present in database");
        }
    }

    @Override
    public Optional<Employee> getEmployeeByEmail(String email) {
        return employeeRepository.findAll()
                .stream()
                .findAny()
                .filter(employee -> employee.getEmail().equals(email));
    }
    @Override
    public void updateEmployee(Employee employee) {
        List<Employee> employees = employeeRepository.findAll();
        for(Employee c: employees) {
            if (employee.getId().equals(c.getId())) {
                employeeRepository.save(employee);
            }else {
                System.out.println(employee.getFirstName() + " Employee is not found in the database");
            }
        }
    }

    @Override
    public Map<String, String> loginEmployeeByEmail(String email) {
        Map<String, String> loginEmployeeByEmail = new HashMap<>();
        Optional<Employee> employees = getEmployeeByEmail(email);
        if(employees.isPresent()){
            String username = employees.get().getEmail();
            String password = employees.get().getPassword();
            loginEmployeeByEmail.put(username,password);
        }else{
            System.out.println("Employee is not found with email: "+ email);
        }
        return loginEmployeeByEmail;
    }
}
