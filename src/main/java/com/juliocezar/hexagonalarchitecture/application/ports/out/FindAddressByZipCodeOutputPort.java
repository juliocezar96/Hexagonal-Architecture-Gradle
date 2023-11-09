package com.juliocezar.hexagonalarchitecture.application.ports.out;

import com.juliocezar.hexagonalarchitecture.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {
    
    Address find(String zipCode);
}
