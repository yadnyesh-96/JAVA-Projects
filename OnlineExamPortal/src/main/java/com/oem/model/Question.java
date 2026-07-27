package com.oem.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Question {

	private int queId;
	private int subId;
	private String question;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private String answer;

}
