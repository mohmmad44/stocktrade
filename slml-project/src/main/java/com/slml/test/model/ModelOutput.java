package com.slml.test.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="model_output")
public class ModelOutput {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id" , nullable = false)
	private Integer id;
	
	@Column(name="date_Str", length=30, nullable = false)
	private String dateStr;
	
	@Column(name="time_stamp",length=30, nullable = false)
	private String timeStamp;
	
	@Column(name="security_name", length=255, nullable = false)
	private String securityName;
	
	@Column(name="ISIN", length=30, nullable = false)
	private String isin;
	
	@Column(name="Yesterday_Actual", length=255, nullable = false)
	private String yesterdayActual;
	
	@Column(name="NGT_PUBLISHED",columnDefinition="decimal" , precision=20, scale=5, nullable = false)
	private BigDecimal ngtPublished;
	
	@Column(name="Model_Now",columnDefinition="decimal" , precision=20, scale=5, nullable = false)
	private BigDecimal modelNow;
	
	@Column(name="Model_EoD",columnDefinition="decimal" , precision=20, scale=5, nullable = false)
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