package com.juliocezar.hexagonalarchitecture.adapters.out;

import com.juliocezar.hexagonalarchitecture.adapters.out.repository.entity.CustomerRepository;
import com.juliocezar.hexagonalarchitecture.application.ports.out.DeleteCustomerByIdOutPutPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteCustomerByIdAdapter implements DeleteCustomerByIdOutPutPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void delete(String id) {
        customerRepository.deleteById(id);
    }
}
