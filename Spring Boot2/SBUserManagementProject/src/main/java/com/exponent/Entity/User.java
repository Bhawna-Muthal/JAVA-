package com.exponent.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@Entity
public class User {

	@Id
	private String uid;
	
	private String uName;
	
	private String uAddress;
	
	private String uEmail;
	
	private int uPhoneNo;
	
	@JsonProperty(value = "country") //json not serialize the class 
	private String uCountry;
	
	
}
