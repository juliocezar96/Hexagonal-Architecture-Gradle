package com.juliocezar.hexagonalarchitecture.adapters.out.repository.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "customers")
@Data
public class CustomerEntity {

    @Id
    private String id;
    private String name;
    private AdressEntity adress;
    private String cpf;
    private Boolean isValidCpf;



}
