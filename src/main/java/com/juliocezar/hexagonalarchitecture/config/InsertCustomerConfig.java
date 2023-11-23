package com.juliocezar.hexagonalarchitecture.config;

import com.juliocezar.hexagonalarchitecture.adapters.out.FindAddressByZipCodeAdapter;
import com.juliocezar.hexagonalarchitecture.adapters.out.InsertCustomerAdapter;
import com.juliocezar.hexagonalarchitecture.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
        FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
        InsertCustomerAdapter insertCustomerAdapter
    ){

        return new InsertCustomerUseCase(insertCustomerAdapter, findAddressByZipCodeAdapter);

    }
}
