package com.amigoscode.customer;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;
    public void registerCustomer(CustomerRegisterationRequest customerRegisterationRequest) {

        Customer customer = Customer.builder()
                .firstName(customerRegisterationRequest.firstName())
                .lastName(customerRegisterationRequest.lastName())
                .email(customerRegisterationRequest.email())
                .build();
        //TODO: check if email is vaild
        //TODO: check if email is not taken
        customerRepository.save(customer);

    }
}
