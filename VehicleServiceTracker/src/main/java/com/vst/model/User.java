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
public class User {

	private Integer userId;
	private Integer roleId;
	
	private String username;
	private String passwordHash;
	
	private String email;
	private String mobileNumber;
	
	private String accountStatus;
	
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	
	
}
