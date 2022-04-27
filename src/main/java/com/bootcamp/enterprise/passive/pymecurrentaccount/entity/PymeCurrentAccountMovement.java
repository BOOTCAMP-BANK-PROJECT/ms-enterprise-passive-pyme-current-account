package com.bootcamp.enterprise.passive.pymecurrentaccount.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class PymeCurrentAccountMovement {
	
	@Id
	private String id;
	private PymeCurrentAccount accountNumber; //"001105020200355481"
    private String movementType;
    private String movementDate;
    private String amount;

}
