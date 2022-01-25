package employee.service;

import java.util.List;



import employee.entity.Employee;

public interface EmployeeService {
	List<Employee> getEmployee();

	void addEmployee(Employee emp);

	String deleteEmployee(int id);

	Employee updateEmployee(Employee emp);

	List<Employee> findByName(String name);

	int countEmp(String name);

}
