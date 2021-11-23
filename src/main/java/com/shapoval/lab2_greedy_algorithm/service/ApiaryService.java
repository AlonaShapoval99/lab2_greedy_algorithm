package com.shapoval.lab2_greedy_algorithm.service;

import com.shapoval.lab2_greedy_algorithm.repository.ApiaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApiaryService {
    @Autowired
    private ApiaryRepository apiaryRepository;

}
