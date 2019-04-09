package com.slml.test.model;
import javax.persistence.Entity;
import javax.persistence.Id;




@Entity
public class ModelOutput {
	
	@Id
	private int id;
	private String date_Str;
	private long time_stamp;
	private String security_name;
	private String ISIN;
	private double yesterday_actual;
	private double NGT_PUBLISHED;
	private double Model_Now;
	private double Model_EoD;
	
	
	public ModelOutput() {
		
	}
	
	
	public ModelOutput(int id, String date_Str, long time_stamp, String security_name, String iSIN,
			double yesterday_actual, double nGT_PUBLISHED, double model_Now, double model_EoD) {
		super();
		this.id = id;
		this.date_Str = date_Str;
		this.time_stamp = time_stamp;
		this.security_name = security_name;
		ISIN = iSIN;
		this.yesterday_actual = yesterday_actual;
		NGT_PUBLISHED = nGT_PUBLISHED;
		Model_Now = model_Now;
		Model_EoD = model_EoD;
	}
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDate_Str() {
		return date_Str;
	}
	public void setDate_Str(String date_Str) {
		this.date_Str = date_Str;
	}
	public long getTime_stamp() {
		return time_stamp;
	}
	public void setTime_stamp(long time_stamp) {
		this.time_stamp = time_stamp;
	}
	public String getSecurity_name() {
		return security_name;
	}
	public void setSecurity_name(String security_name) {
		this.security_name = security_name;
	}
	public String getISIN() {
		return ISIN;
	}
	public void setISIN(String iSIN) {
		ISIN = iSIN;
	}
	public double getYesterday_actual() {
		return yesterday_actual;
	}
	public void setYesterday_actual(double yesterday_actual) {
		this.yesterday_actual = yesterday_actual;
	}
	public double getNGT_PUBLISHED() {
		return NGT_PUBLISHED;
	}
	public void setNGT_PUBLISHED(double nGT_PUBLISHED) {
		NGT_PUBLISHED = nGT_PUBLISHED;
	}
	public double getModel_Now() {
		return Model_Now;
	}
	public void setModel_Now(double model_Now) {
		Model_Now = model_Now;
	}
	public double getModel_EoD() {
		return Model_EoD;
	}
	public void setModel_EoD(double model_EoD) {
		Model_EoD = model_EoD;
	}
	
	
	
	
	
	
	
}
