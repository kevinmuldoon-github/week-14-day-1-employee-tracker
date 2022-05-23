package com.codeclan.example.employeetrackingservice;

import com.codeclan.example.employeetrackingservice.models.Employee;
import com.codeclan.example.employeetrackingservice.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeetrackingserviceApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Employee daniel = new Employee("Daniel", 21, "daniel@daniel.com");
		Employee kevin = new Employee("Kevin", 100, "kevin@kevin.com");
		employeeRepository.save(daniel);
		employeeRepository.save(kevin);
	}

}
