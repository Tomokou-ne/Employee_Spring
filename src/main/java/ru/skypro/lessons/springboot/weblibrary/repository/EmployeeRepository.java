package ru.skypro.lessons.springboot.weblibrary.repository;

import ru.skypro.lessons.springboot.weblibrary.pojo.Employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> getAllEmployees();

    int getSalarySum();

    String findLowPaidEmployee();

    String findHighPaidEmployee();

    List<Employee> allEmployeesMoreThenAvg();
}
