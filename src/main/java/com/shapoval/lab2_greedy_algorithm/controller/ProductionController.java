package com.shapoval.lab2_greedy_algorithm.controller;

import com.shapoval.lab2_greedy_algorithm.models.InputModel;
import com.shapoval.lab2_greedy_algorithm.models.OutputModel;
import com.shapoval.lab2_greedy_algorithm.service.ProductionService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/production")
public class ProductionController {
    @Resource
    ProductionService productionService;

    @CrossOrigin
    @PostMapping("/processData")
    public List<OutputModel> addValue(@RequestBody InputModel inputModel) {

        return new ArrayList<>();
    }

}
