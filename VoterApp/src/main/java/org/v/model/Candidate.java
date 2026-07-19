package org.v.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Candidate {
	private String name;
	private String district;
	private String state;
	private String email;
	private String password;
	private int age;

}
