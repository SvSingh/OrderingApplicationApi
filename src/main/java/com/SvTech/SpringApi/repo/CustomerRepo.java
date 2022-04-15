package com.SvTech.SpringApi.repo;

import com.SvTech.SpringApi.models.CustomerCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<CustomerCustomer, Integer> {
    public CustomerCustomer findByEmail(String Email);
}
