package com.juliocezar.hexagonalarchitecture.application.core.usecase;

import com.juliocezar.hexagonalarchitecture.application.core.domain.Customer;
import com.juliocezar.hexagonalarchitecture.application.ports.in.FindCustomerByIdInputPort;
import com.juliocezar.hexagonalarchitecture.application.ports.out.FindAddressByZipCodeOutputPort;
import com.juliocezar.hexagonalarchitecture.application.ports.out.FindCustomerByIdOutPutPort;

public class FindCustomerByIdUseCase implements FindCustomerByIdInputPort {

    private final FindCustomerByIdOutPutPort findCustomerByIdOutPutPort;

    public FindCustomerByIdUseCase(FindCustomerByIdOutPutPort findCustomerByIdOutPutPort) {
        this.findCustomerByIdOutPutPort = findCustomerByIdOutPutPort;
    }

    @Override
    public Customer find(String id){
        return findCustomerByIdOutPutPort.find(id).orElseThrow(() -> new  RuntimeException("Customer not found"));
    }
}
