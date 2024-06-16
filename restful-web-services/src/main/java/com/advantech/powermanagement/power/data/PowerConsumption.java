package com.advantech.powermanagement.power.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Time;
import java.sql.Timestamp;

@Entity
@Table(name="power_usage", schema="my_schema")
public class PowerConsumption {

	public PowerConsumption() {

	}
	@Column(name = "Building")
	private String building;

	@Column(name = "\"DataValue\"")
	private Integer dataValue;

	@Column(name = "\"DateTime\"")
	private Timestamp dateTime;

	@Column(name = "\"DayOfWeek\"")
	private Integer dayOfWeek;

	@Column(name = "\"Time\"")
	private Time time;
	@Id
	@Column(name = "\"PowerUsage\"")
	private Double powerUsage;

	@Column(name = "\"OriginalPowerUsage\"")
	private Integer originalPowerUsage;

	@Column(name = "\"Prediction\"")
	private Double prediction;

	@Column(name = "\"OriginPrediction\"")
	private Double originPrediction;

	public PowerConsumption(String building, Integer dataValue,
							Timestamp dateTime, Integer dayOfWeek, Time time,
							Double powerUsage, Integer originalPowerUsage,
							Double prediction, Double originPrediction) {
		this.building = building;
		this.dataValue = dataValue;
		this.dateTime = dateTime;
		this.dayOfWeek = dayOfWeek;
		this.time = time;
		this.powerUsage = powerUsage;
		this.originalPowerUsage = originalPowerUsage;
		this.prediction = prediction;
		this.originPrediction = originPrediction;
	}

	public String getBuilding() {
		return building;
	}

	public Integer getDataValue() {
		return dataValue;
	}

	public Timestamp getDateTime() {
		return dateTime;
	}

	public Integer getDayOfWeek() {
		return dayOfWeek;
	}

	public Time getTime() {
		return time;
	}

	public Double getPowerUsage() {
		return powerUsage;
	}

	public Integer getOriginalPowerUsage() {
		return originalPowerUsage;
	}

	public Double getPrediction() {
		return prediction;
	}

	public Double getOriginPrediction() {
		return originPrediction;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public void setDataValue(Integer dataValue) {
		this.dataValue = dataValue;
	}

	public void setDateTime(Timestamp dateTime) {
		this.dateTime = dateTime;
	}

	public void setDayOfWeek(Integer dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public void setPowerUsage(Double powerUsage) {
		this.powerUsage = powerUsage;
	}

	public void setOriginalPowerUsage(Integer originalPowerUsage) {
		this.originalPowerUsage = originalPowerUsage;
	}

	public void setPrediction(Double prediction) {
		this.prediction = prediction;
	}

	public void setOriginPrediction(Double originPrediction) {
		this.originPrediction = originPrediction;
	}

	@Override
	public String toString() {
		return "PowerConsumption{" +
				"building='" + building + '\'' +
				", dataValue=" + dataValue +
				", dateTime=" + dateTime +
				", dayOfWeek=" + dayOfWeek +
				", time=" + time +
				", powerUsage=" + powerUsage +
				", originalPowerUsage=" + originalPowerUsage +
				", prediction=" + prediction +
				", originPrediction=" + originPrediction +
				'}';
	}
}