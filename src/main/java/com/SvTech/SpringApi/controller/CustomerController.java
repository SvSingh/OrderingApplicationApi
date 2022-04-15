package com.SvTech.SpringApi.controller;

import com.SvTech.SpringApi.models.CustomerCustomer;
import com.SvTech.SpringApi.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/customer")
public class CustomerController {


    @Autowired
    private CustomerRepo customerRepo;

    @GetMapping("/info")
    public CustomerCustomer getUserDetails(){
        String email = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return customerRepo.findByEmail(email);
    }

    @GetMapping("{id}")
    public Optional<CustomerCustomer> getCustomrdetails(@PathVariable Integer id){
        return customerRepo.findById(id);
    }




}
