package com.advantech.powermanagement.todo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class PowerConsumption {

	public PowerConsumption() {

	}

	@Id
	@GeneratedValue
	private Integer buildingId;
	private Integer currentPowerConsumption;

	private Integer expectedPowerConsumption;

	public PowerConsumption(Integer buildingId, Integer currentPowerConsumption, Integer expectedPowerConsumption) {
		this.buildingId = buildingId;
		this.currentPowerConsumption = currentPowerConsumption;
		this.expectedPowerConsumption = expectedPowerConsumption;
	}

	public Integer getBuildingId() {
		return buildingId;
	}

	public Integer getCurrentPowerConsumption() {
		return currentPowerConsumption;
	}

	public Integer getExpectedPowerConsumption() {
		return expectedPowerConsumption;
	}

	public void setBuildingId(Integer buildingId) {
		this.buildingId = buildingId;
	}

	public void setCurrentPowerConsumption(Integer currentPowerConsumption) {
		this.currentPowerConsumption = currentPowerConsumption;
	}

	public void setExpectedPowerConsumption(Integer expectedPowerConsumption) {
		this.expectedPowerConsumption = expectedPowerConsumption;
	}

}