package com.juliocezar.hexagonalarchitecture.config;

import com.juliocezar.hexagonalarchitecture.adapters.out.FindCustomerByIdAdapter;
import com.juliocezar.hexagonalarchitecture.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCase findCustomerByIdUseCase(
        FindCustomerByIdAdapter findCustomerByIdAdapter
    ){

        return new FindCustomerByIdUseCase(findCustomerByIdAdapter);

    }
}
