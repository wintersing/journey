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
public class Train1 {
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
//	trainTypeDetails：车辆类型信息
//	trainType：车辆类型码
//	number：该类车辆数量
//	trainTypeName：车辆类型码对应信息
//	trainId：车辆 id
//	trainNum：车辆车次号
//	departStationName：出发站
//	destStationName：到达站
//	departDepartTime：发车时间
//	destArriveTime：到达时间
//	duration：历时（以分钟为单位）
//	price：座位价格信息
//	leftNumber：剩余票量（99是表示票量充足）
//	seatStatus：有或为空，票量充足情况下为有，反之为空
//	stuPrice：学生价，但是途牛网好像一直获取为 null
//	resId：座位对应 id
//	detail：座位具体细节
//	seat：座位类型码
//	price：价格
//	promotionPrice：折扣价
//	seatName：座位类型
//	durationDay：历时天数
//	departStationType：???
//	destStationType：???
//	saleStatus：???
//	departStationId：出发车站 id
//	destStationId：到达车站 id
//	startSaleTime：售票时间
//	canChooseSeat：是否可以选择座位，0表示不可以
//	departureCityCode：出发站城市码
//	arrivalCityCode：到达站城市码
//	departureCityName：出发站城市
//	arrivalCityName：到达站城市
//	trainStartDate：???
//	durationStr：耗时
//	sellOut：是否售罄，0表没有售罄
//	filter：过滤信息
//	id：过滤参数名
//	name：名称
//	pros：参数及参数取值
}
