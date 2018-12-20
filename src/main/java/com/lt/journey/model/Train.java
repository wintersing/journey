package com.lt.journey.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "DataSet")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "TrainCode", "FirstStation", "LastStation", "StartStation", "ArriveStation",
		"StartTime", "ArriveTime", })
public class Train {
	@XmlElement(name = "TrainCode")
	private String TrainCode;
	@XmlElement(name = "FirstStation")
	private String FirstStation;
	@XmlElement(name = "LastStation")
	private String LastStation;
	@XmlElement(name = "StartStation")
	private String StartStation;
	@XmlElement(name = "ArriveStation")
	private String ArriveStation;
	@XmlElement(name = "StartTime")
	private String StartTime;
	@XmlElement(name = "ArriveTime")
	private String ArriveTime;

	public String getTrainCode() {
		return TrainCode;
	}

	public void setTrainCode(String trainCode) {
		TrainCode = trainCode;
	}

	public String getFirstStation() {
		return FirstStation;
	}

	public void setFirstStation(String firstStation) {
		FirstStation = firstStation;
	}

	public String getLastStation() {
		return LastStation;
	}

	public void setLastStation(String lastStation) {
		LastStation = lastStation;
	}

	public String getStartStation() {
		return StartStation;
	}

	public void setStartStation(String startStation) {
		StartStation = startStation;
	}

	public String getArriveStation() {
		return ArriveStation;
	}

	public void setArriveStation(String arriveStation) {
		ArriveStation = arriveStation;
	}

	public String getStartTime() {
		return StartTime;
	}

	public void setStartTime(String startTime) {
		StartTime = startTime;
	}

	public String getArriveTime() {
		return ArriveTime;
	}

	public void setArriveTime(String arriveTime) {
		ArriveTime = arriveTime;
	}

	@Override
	public String toString() {
		return "TrainInfo [TrainCode=" + TrainCode + ", FirstStation=" + FirstStation + ", LastStation=" + LastStation
				+ ", StartStation=" + StartStation + ", ArriveStation=" + ArriveStation + ", StartTime=" + StartTime
				+ ", ArriveTime=" + ArriveTime + "]";
	}
}
