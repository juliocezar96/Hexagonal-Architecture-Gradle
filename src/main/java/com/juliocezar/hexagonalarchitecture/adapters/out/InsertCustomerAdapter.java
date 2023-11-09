package com.juliocezar.hexagonalarchitecture.adapters.out;

import com.juliocezar.hexagonalarchitecture.adapters.out.repository.entity.CustomerRepository;
import com.juliocezar.hexagonalarchitecture.adapters.out.repository.mapper.CustomerEntityMapper;
import com.juliocezar.hexagonalarchitecture.application.core.domain.Customer;
import com.juliocezar.hexagonalarchitecture.application.ports.out.InsertCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerAdapter  implements InsertCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}