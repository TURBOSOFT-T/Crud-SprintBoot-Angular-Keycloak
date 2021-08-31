package com.ipsas.gi.entities;

import javax.annotation.Generated;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;




@Entity
@Table(value = "products")
public class Product {
	
	private int code;
	private String name;
	private int price;
	
	
	
	
	
	

}
