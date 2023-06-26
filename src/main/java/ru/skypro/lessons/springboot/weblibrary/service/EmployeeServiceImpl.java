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

    public String findLowPaidEmployee() {
        return employeeRepository.findLowPaidEmployee();
    }

    public String findHighPaidEmployee() {
        return employeeRepository.findHighPaidEmployee();
    }

    public List<Employee> allEmployeesMoreThenAvg() {
        return employeeRepository.allEmployeesMoreThenAvg();
    }
}
