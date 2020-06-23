package com.people10.customer.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.people10.customer.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
