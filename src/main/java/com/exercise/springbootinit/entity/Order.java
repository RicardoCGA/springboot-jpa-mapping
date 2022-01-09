package com.exercise.springbootinit.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Orders")
@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "id")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "CREATED_AT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;
	private String description;
	
	@ManyToMany
	@JoinTable ( name="ORDERS_PRODUCTS", 
		joinColumns = @JoinColumn(name="ORDER_ID", referencedColumnName = "ID"),
		inverseJoinColumns = @JoinColumn(name="PRODUCT_ID", referencedColumnName = "ID")
	)
	private List<Product> products;
	
}
