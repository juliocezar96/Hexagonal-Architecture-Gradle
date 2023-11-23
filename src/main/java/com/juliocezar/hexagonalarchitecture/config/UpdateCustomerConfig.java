package com.juliocezar.hexagonalarchitecture.config;

import com.juliocezar.hexagonalarchitecture.adapters.out.FindAddressByZipCodeAdapter;
import com.juliocezar.hexagonalarchitecture.adapters.out.UpdateCustomersAdapter;
import com.juliocezar.hexagonalarchitecture.application.core.usecase.FindCustomerByIdUseCase;
import com.juliocezar.hexagonalarchitecture.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
        FindCustomerByIdUseCase findCustomerByIdUseCase,
        FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
        UpdateCustomersAdapter updateCustomersAdapter
    ) {
        return new UpdateCustomerUseCase(findCustomerByIdUseCase, findAddressByZipCodeAdapter, updateCustomersAdapter);
    }

}
