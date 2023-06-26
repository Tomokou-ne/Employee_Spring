package ru.skypro.lessons.springboot.weblibrary.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.lessons.springboot.weblibrary.pojo.Employee;
import ru.skypro.lessons.springboot.weblibrary.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> showCounter() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/salary/sum")
    public int getSalarySum() {
        return employeeService.getSalarySum();
    }

    @GetMapping("/salary/min")
    public String findLowPaidEmployee() {
        return employeeService.findLowPaidEmployee();
    }

    @GetMapping("/salary/max")
    public String findHighPaidEmployee() {
        return employeeService.findHighPaidEmployee();
    }

    @GetMapping("/high-salary")
    public void allEmployeesMoreThenAvg() {
        employeeService.allEmployeesMoreThenAvg();
    }
}
