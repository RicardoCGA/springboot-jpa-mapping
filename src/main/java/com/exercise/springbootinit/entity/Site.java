package com.exercise.springbootinit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Sites")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Site {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String url;
	
	@OneToOne(optional = false)
	@JoinColumn(name="BRAND_ID", referencedColumnName = "ID")
	@JsonProperty(access = Access.WRITE_ONLY)
	private Brand brand;
	
}
