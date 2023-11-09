package com.juliocezar.hexagonalarchitecture.adapters.out.repository.mapper;

import com.juliocezar.hexagonalarchitecture.adapters.out.repository.entity.CustomerEntity;
import com.juliocezar.hexagonalarchitecture.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

}