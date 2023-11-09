package com.juliocezar.hexagonalarchitecture.adapters.out.repository.entity;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {
}
