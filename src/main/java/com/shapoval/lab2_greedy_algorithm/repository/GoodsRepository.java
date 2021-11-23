package com.shapoval.lab2_greedy_algorithm.repository;

import com.shapoval.lab2_greedy_algorithm.entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodsRepository extends JpaRepository<Goods,Long> {
}
