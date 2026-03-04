package com.klef.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Certification 
{
	@Id
	private int id;
	private String category;
	private String company;
	private String title;
	private String level;
	private String examtype;
	private String certificateid;
	private String issueddate;
	private String expirydate;
	private String certificateurl;
	private String status;
	
	private Student student;
	
	
	
	

}
