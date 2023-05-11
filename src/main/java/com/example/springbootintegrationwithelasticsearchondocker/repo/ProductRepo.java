package com.example.springbootintegrationwithelasticsearchondocker.repo;

import com.example.springbootintegrationwithelasticsearchondocker.entity.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProductRepo extends ElasticsearchRepository<Product,Integer> {
}
