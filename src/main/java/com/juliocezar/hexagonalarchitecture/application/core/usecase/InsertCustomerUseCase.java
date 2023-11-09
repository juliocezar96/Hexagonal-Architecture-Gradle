package com.juliocezar.hexagonalarchitecture.application.core.usecase;

import com.juliocezar.hexagonalarchitecture.application.core.domain.Customer;
import com.juliocezar.hexagonalarchitecture.application.ports.out.FindAddressByZipCodeOutputPort;
import com.juliocezar.hexagonalarchitecture.application.ports.out.InsertCustomerOutputPort;

public class InsertCustomerUseCase {

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;
    private final InsertCustomerOutputPort insertCustomerOutputPort;

    public InsertCustomerUseCase(
            InsertCustomerOutputPort insertCustomerOutputPort,
            FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort
    ) {
        this.insertCustomerOutputPort = insertCustomerOutputPort;
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
    }

    public void insert(Customer customer, String zipCode){
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        insertCustomerOutputPort.inser(customer);

    }
}
