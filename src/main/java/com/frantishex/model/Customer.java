package com.frantishex.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Customer {

	public static final BigDecimal ZERO = new BigDecimal(0);
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	@JsonIgnore
	private BigDecimal discount;

	@JsonIgnore
	private String Tier;

	@JsonIgnore
	private BigDecimal turnover;

	public BigDecimal getTurnover() {
		return turnover;
	}

	public void setTurnover(BigDecimal turnover) {
		this.turnover = turnover;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getDiscount() {
		return discount;
	}

	@JsonIgnore
	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	public String getTier() {
		return Tier;
	}

	@JsonIgnore
	public void setTier(String tier) {
		Tier = tier;
	}

}