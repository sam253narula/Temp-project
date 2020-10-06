package com.springboot.parkinglot.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class VehicleDTO {
	
	@Id
	private Long id;
	private String vehicleNumber;
	private String ownerName;
}
