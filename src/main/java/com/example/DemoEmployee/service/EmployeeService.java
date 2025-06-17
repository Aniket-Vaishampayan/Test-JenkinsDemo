package com.example.DemoEmployee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DemoEmployee.entity.Employee;
import com.example.DemoEmployee.repository.EmployeeRepository;

/**
 * Service class for handling business logic related to Employee operations.
 */

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	 /**
     * Retrieves all employees from the database.
     *
     * @return a list of all Employee entities.
     */
	
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	   /**
     * Retrieves an employee by their ID.
     *
     * @param id the ID of the employee.
     * @return an Optional containing the Employee if found, or empty if not.
     */
	
	public Optional<Employee> getEmployeeById(Long id) {
		return employeeRepository.findById(id);
	}

    /**
     * Creates a new employee and saves it to the database.
     *
     * @param employee the Employee object to be created.
     * @return the saved Employee entity.
     */
	
	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	   /**
     * Updates an existing employee based on the provided ID and new details.
     *
     * @param id the ID of the employee to update.
     * @param employeeDetails the Employee object containing updated information.
     * @return the updated Employee entity.
     * @throws RuntimeException if the employee with the given ID is not found.
     */
	
	public Employee updateEmployee(Long id, Employee employeeDetails) {
		Employee employee = employeeRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Employee not found"));

		employee.setEmpName(employeeDetails.getEmpName());
		employee.setEmail(employeeDetails.getEmail());

		return employeeRepository.save(employee);
	}

	 /**
     * Deletes an employee based on the provided ID.
     *
     * @param id the ID of the employee to delete.
     */
	
	public void deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
	}

}
