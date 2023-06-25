package ru.skypro.lessons.springboot.weblibrary.service;

import org.springframework.stereotype.Service;
import ru.skypro.lessons.springboot.weblibrary.pojo.Employee;
import ru.skypro.lessons.springboot.weblibrary.repository.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.getAllEmployees();
    }

    public int getSalarySum() {
        return employeeRepository.getSalarySum();
    }

    public void findLowPaidEmployee() {
        employeeRepository.findLowPaidEmployee();
    }

    public void findHighPaidEmployee() {
        employeeRepository.findHighPaidEmployee();
    }

    public void allEmployeesMoreThenAvg() {
        employeeRepository.allEmployeesMoreThenAvg();
    }
}
