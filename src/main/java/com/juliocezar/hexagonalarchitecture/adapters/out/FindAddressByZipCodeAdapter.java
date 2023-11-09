package com.juliocezar.hexagonalarchitecture.adapters.out;

import com.juliocezar.hexagonalarchitecture.adapters.out.client.FindAddressByZipCodeClient;
import com.juliocezar.hexagonalarchitecture.adapters.out.client.mapper.AddressResponseMapper;
import com.juliocezar.hexagonalarchitecture.application.core.domain.Address;
import com.juliocezar.hexagonalarchitecture.application.ports.out.FindAddressByZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAdress(addressResponse);
    }
}
