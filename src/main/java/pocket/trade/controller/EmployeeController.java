package pocket.trade.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pocket.trade.model.employee.Employee;
import pocket.trade.services.EmployeeServices;
import java.util.List;

@RestController("/v1")
public class EmployeeController {
    @Autowired
    private EmployeeServices employeeServices;

    @GetMapping("/employee")
    public List<Employee> getEmployees(){
        return employeeServices.getAllEmployees();
    }

    @PostMapping("/employee/registration")
    public void addEmployee(@RequestBody Employee employee){

         // This method check the email in database first if email is not
         //  present in database then only save the new employee

        employeeServices.addNewEmployee(employee, employee.getEmail());
    }
}
