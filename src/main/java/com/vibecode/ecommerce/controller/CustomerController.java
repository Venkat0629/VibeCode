package com.vibecode.ecommerce.controller;

import com.vibecode.ecommerce.dto.CustomerProfileResponse;
import com.vibecode.ecommerce.dto.CustomerRegistrationRequest;
import com.vibecode.ecommerce.service.CustomerService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<CustomerProfileResponse> getCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/premium")
    public List<CustomerProfileResponse> getPremiumCustomers() {
        return customerService.getPremiumCustomers();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CustomerProfileResponse registerCustomer(@Valid @RequestBody CustomerRegistrationRequest request) {
        return customerService.registerCustomer(request);
    }
}
