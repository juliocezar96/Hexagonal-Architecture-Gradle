package com.juliocezar.hexagonalarchitecture.application.core.usecase;

import com.juliocezar.hexagonalarchitecture.application.core.domain.Customer;
import com.juliocezar.hexagonalarchitecture.application.ports.in.FindCustomerByIdInputPort;
import com.juliocezar.hexagonalarchitecture.application.ports.in.UpdateCustomerInputPort;
import com.juliocezar.hexagonalarchitecture.application.ports.out.FindAddressByZipCodeOutputPort;
import com.juliocezar.hexagonalarchitecture.application.ports.out.UpdateCustomerOutPutPort;

public class UpdateCustomerUseCase implements UpdateCustomerInputPort {

    private final FindCustomerByIdInputPort findCustomerByIdInputPort;

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;

    private final UpdateCustomerOutPutPort updateCustomerOutPutPort;
    public UpdateCustomerUseCase(
            FindCustomerByIdInputPort findCustomerByIdInputPort,
            FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
            UpdateCustomerOutPutPort updateCustomerOutPutPort
    ){
        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.updateCustomerOutPutPort = updateCustomerOutPutPort;
    }

    @Override
    public void update(Customer customer, String zipCode){
        findCustomerByIdInputPort.find(customer.getId());
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        updateCustomerOutPutPort.update(customer);

    }
}
