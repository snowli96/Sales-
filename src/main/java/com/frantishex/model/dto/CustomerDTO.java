package com.frantishex.model.dto;

import javax.validation.constraints.NotNull;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.frantishex.model.Customer;

public class CustomerDTO {

	@Autowired
	private ModelMapper modelMapper = new ModelMapper();

	@NotNull
	private Long merchantId;

	@NotNull
	private String name;

	@NotNull
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(Long merchantId) {
		this.merchantId = merchantId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Customer convertToCustomer() {
		Customer customer = modelMapper.map(this, Customer.class);

		return customer;
	}

}
