package employee.repositary;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import employee.entity.Employee;


public interface Repos extends JpaRepository<Employee, Integer> {

	@Query(value = "select * from employees where name= :name", nativeQuery = true)
	public List<Employee> findAllByName(@Param("name") String name);
	
	//@Query(value = "select * from employees where address=:address ", nativeQuery = true)
	public List<Employee> findByAddress(String address);
	@Query(value = "select count(*) from employees where name= :name", nativeQuery = true)
	public int countByName(@Param("name") String name);
}
