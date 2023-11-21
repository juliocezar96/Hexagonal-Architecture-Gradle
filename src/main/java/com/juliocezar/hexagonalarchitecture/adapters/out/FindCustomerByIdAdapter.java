package com.juliocezar.hexagonalarchitecture.adapters.out;

import com.juliocezar.hexagonalarchitecture.adapters.out.repository.entity.CustomerRepository;
import com.juliocezar.hexagonalarchitecture.adapters.out.repository.mapper.CustomerEntityMapper;
import com.juliocezar.hexagonalarchitecture.application.core.domain.Customer;
import com.juliocezar.hexagonalarchitecture.application.ports.out.FindCustomerByIdOutPutPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindCustomerByIdAdapter implements FindCustomerByIdOutPutPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> find(String id){
        var customerEntity = customerRepository.findById(id);
        return customerEntity.map(entity -> customerEntityMapper.toCustomer(entity));
    }


}
