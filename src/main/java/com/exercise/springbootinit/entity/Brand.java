package com.exercise.springbootinit.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "brands")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Brand implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	@OneToMany(mappedBy = "brand")
	List<Product> products;
	
	@OneToOne(mappedBy = "brand")
	Site site;
	
	
	private static final long serialVersionUID = -2955464093443167628L;
	
}
