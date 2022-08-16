package com.jordan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="address")
public class Address {
	@Id 
	@GeneratedValue
	private int addressId;
	private int userId;
	private String street;
	private String unit;
	private String city;
	private String state;
	private String zipcode;
	private String country;
}