package com.patronDto.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.patronDto.app.entity.AddressEntity;
import com.patronDto.app.entity.CustomerEntity;

public interface ICustomerRepository extends JpaRepository<CustomerEntity, Long>{	
}
