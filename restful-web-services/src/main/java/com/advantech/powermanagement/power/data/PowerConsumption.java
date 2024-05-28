package com.advantech.powermanagement.power.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name="Tech_All_KWH")
public class PowerConsumption {

	public PowerConsumption() {

	}
	private String building;
	@Id
	private Double datavalue;

	private Integer timestamp;
	private Date datetime;

	public PowerConsumption(String building, Double dataValue, Integer timeStamp, Date datetime) {
		this.building = building;
		this.datavalue = dataValue;
		this.timestamp = timeStamp;
		this.datetime = datetime;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public Double getDatavalue() {
		return datavalue;
	}

	public void setDatavalue(Double datavalue) {
		this.datavalue = datavalue;
	}

	public Integer getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Integer timestamp) {
		this.timestamp = timestamp;
	}

	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

}