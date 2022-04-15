package com.SvTech.SpringApi.Services;


import com.SvTech.SpringApi.models.CustomerCustomer;
import com.SvTech.SpringApi.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepo;


    public CustomerCustomer getCustopmerbyID(Integer ID){
        return customerRepo.findById(ID).get();
    }
    @Transactional
    public CustomerCustomer saveCustomer(CustomerCustomer customer){
        return customerRepo.save(customer);
    }
    @Transactional
    public void DeleteCustomer(Integer id){
        customerRepo.deleteById(id);
    }

}
