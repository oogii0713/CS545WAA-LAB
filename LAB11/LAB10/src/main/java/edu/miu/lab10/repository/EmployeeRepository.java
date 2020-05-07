package edu.miu.lab10.repository;

import edu.miu.lab10.domain.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

	@Query("SELECT e FROM Employee e WHERE employeeNumber = :number")
	Employee locateOneEmployeeByHisNumber(@Param("number") int id);

}
