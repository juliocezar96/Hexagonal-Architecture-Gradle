package com.juliocezar.hexagonalarchitecture.application.ports.out;

import com.juliocezar.hexagonalarchitecture.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutPutPort {

    Optional<Customer> find(String id);
}
