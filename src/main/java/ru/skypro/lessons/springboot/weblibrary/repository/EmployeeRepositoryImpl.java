package ru.skypro.lessons.springboot.weblibrary.repository;

import org.springframework.stereotype.Repository;
import ru.skypro.lessons.springboot.weblibrary.pojo.Employee;

import java.util.*;
import java.util.stream.Collectors;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository{

    private final List<Employee> employeeList = List.of(
            new Employee("Pasha", 54_000),
            new Employee("Katya", 70_000),
            new Employee("Dima", 105_000),
            new Employee("Oleg", 80_000)
    );

    @Override
    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    @Override
    public int getSalarySum() {
        return employeeList.stream()
                .mapToInt(Employee::getSalary)
                .sum();
    }

    @Override
    public String findLowPaidEmployee() {
        return employeeList.stream()
                .collect(Collectors.toMap(Employee::getName, Employee::getSalary))
                .entrySet()
                .stream()
                .min(Comparator.comparingInt(Map.Entry::getValue))
                .toString();
    }

    //сотрудник с макс зп
    @Override
    public String findHighPaidEmployee() {
        return employeeList.stream()
                .collect(Collectors.toMap(Employee::getName, Employee::getSalary))
                .entrySet()
                .stream()
                .max(Comparator.comparingInt(Map.Entry::getValue))
                .toString();
    }

    public void allEmployeesMoreThenAvg() {
        ArrayList<Employee> list = new ArrayList<>();
        for (Employee o : employeeList) {
            if (o.getSalary() >= getSalarySum()/ employeeList.size()) {
                list.add(o);
            }
        }
        System.out.println(list);
    }

}
