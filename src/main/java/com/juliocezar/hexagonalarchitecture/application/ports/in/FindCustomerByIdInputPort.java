package com.juliocezar.hexagonalarchitecture.application.ports.in;

import com.juliocezar.hexagonalarchitecture.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find(String id);
}
