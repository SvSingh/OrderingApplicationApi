package com.SvTech.SpringApi.Services;

import com.SvTech.SpringApi.models.CustomerCustomer;
import com.SvTech.SpringApi.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class MyUserDEtailService implements UserDetailsService {

    @Autowired private CustomerRepo customerRepo;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        CustomerCustomer cutomer = customerRepo.findByEmail(email);
    }
}
