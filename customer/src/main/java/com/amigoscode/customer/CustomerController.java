package com.amigoscode.customer;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/customers")
@Slf4j
public record CustomerController(CustomerService customerService) {


    @PostMapping
    public void RegisterCustomer(@RequestBody CustomerRegisterationRequest customerRegisterationRequest) {
        log.info("Registering customer... {}", customerRegisterationRequest);
        customerService.registerCustomer(customerRegisterationRequest);
    }
}
