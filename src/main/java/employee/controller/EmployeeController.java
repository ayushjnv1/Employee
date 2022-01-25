package employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import employee.entity.Employee;
import employee.service.EmployeeService;
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class EmployeeController {

	@Autowired
	EmployeeService s;
	
	

	
   @GetMapping("/getEmployee")
	public List<Employee> getEmplyee() 
	{
	   List<Employee> l =  s.getEmployee();
	   return l;
	}

   @PostMapping("/addEmployee")
   public String addEmployee(@RequestBody Employee emp) {
	   s.addEmployee(emp);
	   return "Success";
   }
   @DeleteMapping("/employeedelete")
   public String deleteEmployee(@Param("id") int id)
   {
	   return s.deleteEmployee(id);
	    
   }
   
   @PostMapping("/updateEmployee")
   public Employee updateEmployee(@RequestBody Employee emp)
   {
	   return s.updateEmployee(emp);
   }
   @GetMapping("/findbyname")
   public List<Employee> findByName(@Param("name") String name)
   {
	   
	   return s.findByName(name);
   }
   
	
}
