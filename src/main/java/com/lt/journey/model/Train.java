package com.lt.journey.model;

public class Train {
	private Integer trainId;
	private String trainNum;
	private Integer trainType;
	private String trainTypeName;
	private String departStationName;
	private String destStationName;
	private String departDepartTime;
	private String destArriveTime;
	private Integer duration;
	private Price[] prices;
	private Integer durationDay;
	private Integer departStationType;
	private Integer destStationType;
	private Integer saleStatus;
	private Integer departStationId;
	private Integer destStationId;
	private String startSaleTime;
	private Integer canChooseSeat;
	private String memo;
	private Integer departureCityCode;
	private Integer arrivalCityCode;
	private String departureCityName;
	private String arrivalCityName;
	private Integer upOrDown;
	private String trainStartDate;
	private String accessByIdcard;
	private String durationStr;
	private String departStationTypeName;
	private String destStationTypeName;
	private String sellOut;
	public Integer getTrainId() {
		return trainId;
	}
	public void setTrainId(Integer trainId) {
		this.trainId = trainId;
	}
	public String getTrainNum() {
		return trainNum;
	}
	public void setTrainNum(String trainNum) {
		this.trainNum = trainNum;
	}
	public Integer getTrainType() {
		return trainType;
	}
	public void setTrainType(Integer trainType) {
		this.trainType = trainType;
	}
	public String getTrainTypeName() {
		return trainTypeName;
	}
	public void setTrainTypeName(String trainTypeName) {
		this.trainTypeName = trainTypeName;
	}
	public String getDepartStationName() {
		return departStationName;
	}
	public void setDepartStationName(String departStationName) {
		this.departStationName = departStationName;
	}
	public String getDestStationName() {
		return destStationName;
	}
	public void setDestStationName(String destStationName) {
		this.destStationName = destStationName;
	}
	public String getDepartDepartTime() {
		return departDepartTime;
	}
	public void setDepartDepartTime(String departDepartTime) {
		this.departDepartTime = departDepartTime;
	}
	public String getDestArriveTime() {
		return destArriveTime;
	}
	public void setDestArriveTime(String destArriveTime) {
		this.destArriveTime = destArriveTime;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public Price[] getPrices() {
		return prices;
	}
	public void setPrices(Price[] prices) {
		this.prices = prices;
	}
	public Integer getDurationDay() {
		return durationDay;
	}
	public void setDurationDay(Integer durationDay) {
		this.durationDay = durationDay;
	}
	public Integer getDepartStationType() {
		return departStationType;
	}
	public void setDepartStationType(Integer departStationType) {
		this.departStationType = departStationType;
	}
	public Integer getDestStationType() {
		return destStationType;
	}
	public void setDestStationType(Integer destStationType) {
		this.destStationType = destStationType;
	}
	public Integer getSaleStatus() {
		return saleStatus;
	}
	public void setSaleStatus(Integer saleStatus) {
		this.saleStatus = saleStatus;
	}
	public Integer getDepartStationId() {
		return departStationId;
	}
	public void setDepartStationId(Integer departStationId) {
		this.departStationId = departStationId;
	}
	public Integer getDestStationId() {
		return destStationId;
	}
	public void setDestStationId(Integer destStationId) {
		this.destStationId = destStationId;
	}
	public String getStartSaleTime() {
		return startSaleTime;
	}
	public void setStartSaleTime(String startSaleTime) {
		this.startSaleTime = startSaleTime;
	}
	public Integer getCanChooseSeat() {
		return canChooseSeat;
	}
	public void setCanChooseSeat(Integer canChooseSeat) {
		this.canChooseSeat = canChooseSeat;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public Integer getDepartureCityCode() {
		return departureCityCode;
	}
	public void setDepartureCityCode(Integer departureCityCode) {
		this.departureCityCode = departureCityCode;
	}
	public Integer getArrivalCityCode() {
		return arrivalCityCode;
	}
	public void setArrivalCityCode(Integer arrivalCityCode) {
		this.arrivalCityCode = arrivalCityCode;
	}
	public String getDepartureCityName() {
		return departureCityName;
	}
	public void setDepartureCityName(String departureCityName) {
		this.departureCityName = departureCityName;
	}
	public String getArrivalCityName() {
		return arrivalCityName;
	}
	public void setArrivalCityName(String arrivalCityName) {
		this.arrivalCityName = arrivalCityName;
	}
	public Integer getUpOrDown() {
		return upOrDown;
	}
	public void setUpOrDown(Integer upOrDown) {
		this.upOrDown = upOrDown;
	}
	public String getTrainStartDate() {
		return trainStartDate;
	}
	public void setTrainStartDate(String trainStartDate) {
		this.trainStartDate = trainStartDate;
	}
	public String getAccessByIdcard() {
		return accessByIdcard;
	}
	public void setAccessByIdcard(String accessByIdcard) {
		this.accessByIdcard = accessByIdcard;
	}
	public String getDurationStr() {
		return durationStr;
	}
	public void setDurationStr(String durationStr) {
		this.durationStr = durationStr;
	}
	public String getDepartStationTypeName() {
		return departStationTypeName;
	}
	public void setDepartStationTypeName(String departStationTypeName) {
		this.departStationTypeName = departStationTypeName;
	}
	public String getDestStationTypeName() {
		return destStationTypeName;
	}
	public void setDestStationTypeName(String destStationTypeName) {
		this.destStationTypeName = destStationTypeName;
	}
	public String getSellOut() {
		return sellOut;
	}
	public void setSellOut(String sellOut) {
		this.sellOut = sellOut;
	}
	@Override
	public String toString() {
		return "Train [trainId=" + trainId + ", trainNum=" + trainNum + ", trainType=" + trainType + ", trainTypeName="
				+ trainTypeName + ", departStationName=" + departStationName + ", destStationName=" + destStationName
				+ ", departDepartTime=" + departDepartTime + ", destArriveTime=" + destArriveTime + ", duration="
				+ duration + ", prices=" + prices + ", durationDay=" + durationDay + ", departStationType="
				+ departStationType + ", destStationType=" + destStationType + ", saleStatus=" + saleStatus
				+ ", departStationId=" + departStationId + ", destStationId=" + destStationId + ", startSaleTime="
				+ startSaleTime + ", canChooseSeat=" + canChooseSeat + ", memo=" + memo + ", departureCityCode="
				+ departureCityCode + ", arrivalCityCode=" + arrivalCityCode + ", departureCityName="
				+ departureCityName + ", arrivalCityName=" + arrivalCityName + ", upOrDown=" + upOrDown
				+ ", trainStartDate=" + trainStartDate + ", accessByIdcard=" + accessByIdcard + ", durationStr="
				+ durationStr + ", departStationTypeName=" + departStationTypeName + ", destStationTypeName="
				+ destStationTypeName + ", sellOut=" + sellOut + "]";
	}
}
