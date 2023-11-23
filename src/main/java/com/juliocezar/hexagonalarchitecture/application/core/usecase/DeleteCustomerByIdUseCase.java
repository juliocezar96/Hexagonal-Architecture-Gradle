package com.juliocezar.hexagonalarchitecture.application.core.usecase;

import com.juliocezar.hexagonalarchitecture.application.ports.in.FindCustomerByIdInputPort;
import com.juliocezar.hexagonalarchitecture.application.ports.out.DeleteCustomerByIdOutPutPort;

public class DeleteCustomerByIdUseCase {

    private final FindCustomerByIdInputPort findCustomerByIdInputPort;

    private final DeleteCustomerByIdOutPutPort deleteCustomerByIdOutPutPort;

    public DeleteCustomerByIdUseCase(
            FindCustomerByIdInputPort findCustomerByIdInputPort,
            DeleteCustomerByIdOutPutPort deleteCustomerByIdOutPutPort
    ){
        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
        this.deleteCustomerByIdOutPutPort = deleteCustomerByIdOutPutPort;
    }

    public void delete(String id){
        findCustomerByIdInputPort.find(id);
        deleteCustomerByIdOutPutPort.delete(id);
    }
}
