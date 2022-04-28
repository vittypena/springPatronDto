package com.patronDto.app.provider;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.patronDto.app.dao.IAddressRepository;
import com.patronDto.app.dao.ICustomerRepository;
import com.patronDto.app.entity.AddressEntity;
import com.patronDto.app.entity.CustomerEntity;

@Service
public class CustomerProviderImpl implements ICustomerProvider {

	@Autowired
	private ICustomerRepository customerRepository;
	
	@Autowired
	private IAddressRepository addressRepository;

	@Override
	public Optional<CustomerEntity> findById(Long id) {
		return customerRepository.findById(id);
	}

	@Override
	public AddressEntity findByCostumer(CustomerEntity customerEntity) {
		return addressRepository.findByCustomer(customerEntity);
	}

	
	
	
}
