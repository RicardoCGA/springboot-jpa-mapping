package com.exercise.springbootinit.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class GrettingRequestParam {
	private String givenName;
	private Integer age;
	private String familyName;
	
}
