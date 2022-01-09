package com.exercise.springbootinit.entity;

import java.io.Serializable;
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
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "id")
public class Product implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Double price;
	
	@Column(name = "CREATED_AT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;
	
	@ManyToOne
	@JoinColumn(name="CATEGORY_ID", referencedColumnName = "ID" )
	@JsonProperty(access = Access.WRITE_ONLY)
	private Category category;
	
	@ManyToOne
	@JoinColumn(name="BRAND_ID", referencedColumnName = "ID" )
	@JsonProperty(access = Access.WRITE_ONLY)
	private Brand brand;
	
	@ManyToMany
	@JoinTable ( name="ORDERS_PRODUCTS", 
		joinColumns = @JoinColumn(name="PRODUCT_ID", referencedColumnName = "ID"),
		inverseJoinColumns = @JoinColumn(name="ORDER_ID", referencedColumnName = "ID")
	)
	private List<Order> orders;
	
	private static final long serialVersionUID = 3276430852375008650L;
	
}
