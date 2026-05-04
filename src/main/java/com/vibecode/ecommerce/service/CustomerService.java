package com.vibecode.ecommerce.service;

import com.vibecode.ecommerce.dto.CustomerProfileResponse;
import com.vibecode.ecommerce.dto.CustomerRegistrationRequest;
import com.vibecode.ecommerce.entity.Customer;
import com.vibecode.ecommerce.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<CustomerProfileResponse> getAllCustomers() {
        return customerRepository.findAll().stream().map(this::toResponse).toList();
    }

    public List<CustomerProfileResponse> getPremiumCustomers() {
        return customerRepository.findByPremiumTrue().stream().map(this::toResponse).toList();
    }

    public CustomerProfileResponse registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = new Customer();
        customer.setFullName(request.fullName());
        customer.setEmail(request.email());
        customer.setPremium(request.premium());
        return toResponse(customerRepository.save(customer));
    }

    private CustomerProfileResponse toResponse(Customer customer) {
        return new CustomerProfileResponse(customer.getId(), customer.getFullName(), customer.getEmail(), customer.isPremium());
    }
}
