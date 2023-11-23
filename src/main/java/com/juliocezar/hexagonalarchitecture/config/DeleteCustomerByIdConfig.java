package com.juliocezar.hexagonalarchitecture.config;

import com.juliocezar.hexagonalarchitecture.adapters.out.DeleteCustomerByIdAdapter;
import com.juliocezar.hexagonalarchitecture.application.core.usecase.DeleteCustomerByIdUseCase;
import com.juliocezar.hexagonalarchitecture.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            DeleteCustomerByIdAdapter deleteCustomerByIdAdapter
    ) {
        return new DeleteCustomerByIdUseCase(findCustomerByIdUseCase, deleteCustomerByIdAdapter);

    }
}
