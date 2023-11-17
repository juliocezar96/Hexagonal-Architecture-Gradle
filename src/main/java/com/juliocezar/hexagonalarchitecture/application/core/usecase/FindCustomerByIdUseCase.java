package com.juliocezar.hexagonalarchitecture.application.core.usecase;

import com.juliocezar.hexagonalarchitecture.application.core.domain.Customer;
import com.juliocezar.hexagonalarchitecture.application.ports.out.FindAddressByZipCodeOutputPort;
import com.juliocezar.hexagonalarchitecture.application.ports.out.FindCustomerByIdOutPutPort;

public class FindCustomerByIdUseCase {

    private final FindCustomerByIdOutPutPort findCustomerByIdOutPutPort;

    public FindCustomerByIdUseCase(FindCustomerByIdOutPutPort findCustomerByIdOutPutPort) {
        this.findCustomerByIdOutPutPort = findCustomerByIdOutPutPort;
    }

    public Customer find(String id){
        return findCustomerByIdOutPutPort.find(id).orElseThrow(() -> new  RuntimeException("Customer not found"));
    }
}
