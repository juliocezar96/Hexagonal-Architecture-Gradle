package com.juliocezar.hexagonalarchitecture.application.ports.in;

import com.juliocezar.hexagonalarchitecture.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);
}
