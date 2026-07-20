package com.vst.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Customer {
	
	private Integer customerId;
	private Integer userId;
	private String firstName;
	private String lastName;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private String pincode;
	private String gender;
	private byte[] profileImage;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	
}
