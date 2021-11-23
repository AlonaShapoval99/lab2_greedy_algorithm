package com.shapoval.lab2_greedy_algorithm.service;

import com.shapoval.lab2_greedy_algorithm.repository.GoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsService {
    @Autowired
    private GoodsRepository goodsRepository;

}
