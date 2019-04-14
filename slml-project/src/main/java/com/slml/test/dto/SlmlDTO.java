package com.slml.test.dto;

import java.math.BigDecimal;

import javax.persistence.Column;

public class SlmlDTO {

	private Integer id;

	private String dateStr;

	private String timeStamp;

	private String securityName;

	private String isin;

	private String yesterdayActual;

	private BigDecimal ngtPublished;

	private BigDecimal modelNow;

	private BigDecimal modelEoD;
	
	
	
	
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDateStr() {
		return dateStr;
	}

	public void setDateStr(String dateStr) {
		this.dateStr = dateStr;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getSecurityName() {
		return securityName;
	}

	public void setSecurityName(String securityName) {
		this.securityName = securityName;
	}

	public String getIsin() {
		return isin;
	}

	public void setIsin(String isin) {
		this.isin = isin;
	}

	public String getYesterdayActual() {
		return yesterdayActual;
	}

	public void setYesterdayActual(String yesterdayActual) {
		this.yesterdayActual = yesterdayActual;
	}

	public BigDecimal getNgtPublished() {
		return ngtPublished;
	}

	public void setNgtPublished(BigDecimal ngtPublished) {
		this.ngtPublished = ngtPublished;
	}

	public BigDecimal getModelNow() {
		return modelNow;
	}

	public void setModelNow(BigDecimal modelNow) {
		this.modelNow = modelNow;
	}

	public BigDecimal getModelEoD() {
		return modelEoD;
	}

	public void setModelEoD(BigDecimal modelEoD) {
		this.modelEoD = modelEoD;
	}

	
	
	

}
