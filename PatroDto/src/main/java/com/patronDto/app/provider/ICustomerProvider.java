package com.patronDto.app.provider;

import java.util.List;
import java.util.Optional;

import com.patronDto.app.entity.AddressEntity;
import com.patronDto.app.entity.CustomerEntity;

public interface ICustomerProvider {
	Optional<CustomerEntity> findById(Long id);
	AddressEntity findByCostumer(CustomerEntity customerEntity);
}
