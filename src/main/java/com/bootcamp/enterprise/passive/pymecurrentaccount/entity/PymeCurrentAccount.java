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
public class PymeCurrentAccount {
	
	@Id
	private String id;
	private String accountNumber; //"001105020200355481"
    private EnterpriseClient documentRUC;
    private String movementLimit;
    private String creationDate;
    private String movementType;
    private String movementDate;
    private String amount;

}
