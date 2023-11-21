package com.juliocezar.hexagonalarchitecture.adapters.in.controller.mapper;

import com.juliocezar.hexagonalarchitecture.adapters.in.controller.request.CustomerRequest;
import com.juliocezar.hexagonalarchitecture.adapters.in.controller.response.CustomerResponse;
import com.juliocezar.hexagonalarchitecture.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id",ignore = true)
    @Mapping(target = "address",ignore = true)
    @Mapping(target = "idValidCpf",ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);

    CustomerResponse toCustomerResponse(Customer customer);

}
