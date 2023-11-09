package com.juliocezar.hexagonalarchitecture.adapters.in.controller.request;

import com.juliocezar.hexagonalarchitecture.application.core.domain.Address;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class CustomerRequest {

    @NotBlank
    private String name;
    @NotBlank
    private String cpf;
    @NotBlank
    private String zipCode;

}
