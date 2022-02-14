package employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import employee.entity.Employee;

import employee.repositary.*;

@Service
public class EmployeeServiceImp implements EmployeeService {
	@Autowired
	Repos re;

	@Override
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return (List<Employee>) re.findAll();
	}

	@Override
	public void addEmployee(Employee emp) {
		re.save(emp);

	}

	@Override
	public String deleteEmployee(int id) {
		// TODO Auto-generated method stub
		System.out.println(id);
		try {
			re.deleteById(id);
		} catch (Exception e) {
			System.out.println("No data present " + e);
			return "No data such data present";
		}
		return "Deleted";
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		// TODO Auto-generated method stub

		re.save(emp);
		return emp;
		// return o;
	}

	@Override
	public List<Employee> findByName(String name) {
		// TODO Auto-generated method stub
		//countEmp(name);
		System.out.println(name);
		String str=name;
		List<Employee> l =re.findAllByName(str.substring(1,str.length()-1));
//		List<Employee> e = re.findAllByName("Ayush");
		System.out.println("find by default value"+l);
		System.out.println("find by variable value pass "+l);
		return l;
	}

	@Override
	public int countEmp(String name) {
		System.out.println("Count by variable "+re.countByName(name));
		System.out.println("count by default value "+re.countByName("Ayush"));
		return 0;
	}

}
