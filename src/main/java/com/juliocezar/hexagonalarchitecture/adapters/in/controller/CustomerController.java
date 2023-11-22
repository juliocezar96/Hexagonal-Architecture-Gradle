package com.juliocezar.hexagonalarchitecture.adapters.in.controller;

import com.juliocezar.hexagonalarchitecture.adapters.in.controller.mapper.CustomerMapper;
import com.juliocezar.hexagonalarchitecture.adapters.in.controller.request.CustomerRequest;
import com.juliocezar.hexagonalarchitecture.adapters.in.controller.response.CustomerResponse;
import com.juliocezar.hexagonalarchitecture.application.core.domain.Customer;
import com.juliocezar.hexagonalarchitecture.application.ports.in.FindCustomerByIdInputPort;
import com.juliocezar.hexagonalarchitecture.application.ports.in.InsertCustomerInputPort;
import com.juliocezar.hexagonalarchitecture.application.ports.in.UpdateCustomerInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    private InsertCustomerInputPort insertCustomerInputPort;

    @Autowired
    private FindCustomerByIdInputPort findCustomerByIdInputPort;

    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private UpdateCustomerInputPort updateCustomerInputPort;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest customerRequest) {

        var customer = customerMapper.toCustomer(customerRequest);
        insertCustomerInputPort.insert(customer, customerRequest.getZipCode());
        return ResponseEntity.ok().build();

    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findById(@PathVariable final String id){
        var customer = findCustomerByIdInputPort.find(id);
        var customerResponse = customerMapper.toCustomerResponse(customer);
        return ResponseEntity.ok().body(customerResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(
            @PathVariable final String id,
            @Valid @RequestBody CustomerRequest customerRequest
    ){
        Customer customer= customerMapper.toCustomer(customerRequest);
        customer.setId(id);
        updateCustomerInputPort.update(customer,customerRequest.getZipCode());
        return ResponseEntity.noContent().build();
    }

}
