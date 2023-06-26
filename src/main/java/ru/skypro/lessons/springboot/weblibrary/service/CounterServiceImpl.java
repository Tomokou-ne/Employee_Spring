package ru.skypro.lessons.springboot.weblibrary.service;

import org.springframework.stereotype.Service;

@Service
public class CounterServiceImpl implements CounterService{
    private int counter;

    public String showCounter() {
        return "Number of requests: " + ++counter;
    }
}
