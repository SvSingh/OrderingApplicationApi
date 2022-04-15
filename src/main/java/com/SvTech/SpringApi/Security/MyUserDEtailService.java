package com.SvTech.SpringApi.Security;

import com.SvTech.SpringApi.models.CustomerCustomer;
import com.SvTech.SpringApi.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class MyUserDEtailService implements UserDetailsService {

    @Autowired private CustomerRepo customerRepo;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        CustomerCustomer cutomer = customerRepo.findByEmail(email);
        if(cutomer == null){
            throw new UsernameNotFoundException("Could not fount user with email = " + email);
        }
        return new org.springframework.security.core.userdetails.User(email, cutomer.getPassword(), Collections.singletonList(new SimpleGrantedAuthority("ROLE_USER")));

    }
}
