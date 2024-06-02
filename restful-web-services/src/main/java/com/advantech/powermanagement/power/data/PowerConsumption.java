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
	private String building; // 서호관, 하이테크
	@Id
	private Double datavalue; // 10101010 지금까지 사용한 총 전력 사용량

	private Integer timestamp; // 9: 35 9: 25
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