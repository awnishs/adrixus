package com.adrixus.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adrixus.domain.Customer;

@Repository
@Transactional
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
