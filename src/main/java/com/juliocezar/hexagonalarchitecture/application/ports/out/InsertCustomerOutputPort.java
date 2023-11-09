package com.juliocezar.hexagonalarchitecture.application.ports.out;

import com.juliocezar.hexagonalarchitecture.application.core.domain.Customer;

public interface InsertCustomerOutputPort {
    
    void insert(Customer customer);
}
