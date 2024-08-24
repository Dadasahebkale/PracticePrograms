package com.getters;

import org.apache.juneau.http.annotation.FormData;
import org.apache.juneau.internal.FluentSetters;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
//@groovy.transform.ToString
@Getter
@FluentSetters
//@groovy.transform.EqualsAndHashCode
@FormData
public class Customer {
	private String name;
	private int age;
	private String city;
	private boolean isActive;
	private String dob;

}
