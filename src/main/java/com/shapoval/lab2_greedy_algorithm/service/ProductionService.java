package com.shapoval.lab2_greedy_algorithm.service;

import com.shapoval.lab2_greedy_algorithm.repository.ApiaryRepository;
import com.shapoval.lab2_greedy_algorithm.repository.GoodsRepository;
import com.shapoval.lab2_greedy_algorithm.repository.ProductionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductionService {
    @Autowired
    private ProductionRepository productionRepository;
    @Autowired
    private ApiaryRepository apiaryRepository;
    @Autowired
    private GoodsRepository goodsRepository;


}
