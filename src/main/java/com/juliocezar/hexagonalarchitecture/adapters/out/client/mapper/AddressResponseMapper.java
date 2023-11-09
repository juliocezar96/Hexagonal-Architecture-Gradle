package com.juliocezar.hexagonalarchitecture.adapters.out.client.mapper;

import com.juliocezar.hexagonalarchitecture.adapters.out.client.response.AddressResponse;
import com.juliocezar.hexagonalarchitecture.application.core.domain.Address;
import org.mapstruct.Mapper;
@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAdress(AddressResponse addressResponse);
}
