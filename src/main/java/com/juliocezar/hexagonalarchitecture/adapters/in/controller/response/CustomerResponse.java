package com.juliocezar.hexagonalarchitecture.adapters.in.controller.response;

import com.juliocezar.hexagonalarchitecture.application.core.domain.Address;
import lombok.Data;

@Data
public class CustomerResponse {

    private String name;
    private AddressResponse address;
    private String cpf;
    private Boolean isValidCpf;
}
