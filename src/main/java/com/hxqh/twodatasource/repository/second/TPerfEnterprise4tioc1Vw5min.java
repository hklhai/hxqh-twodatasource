package com.hxqh.twodatasource.repository.second;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the T_PERF_ENTERPRISE_4TIOC1_VW_5MINS database table.
 * 
 */
@Entity
@Table(name="T_PERF_ENTERPRISE_4TIOC1_VW_5MINS")
public class TPerfEnterprise4tioc1Vw5min implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="cust_name")
	private String custName;

	private String custType;

	private double e_rsi_BitsPerSecondIn;

	private double e_rsi_BitsPerSecondOut;

	@Column(name="e_rsi_timedata")
	private String eRsiTimedata;

	private double e_rsi_Utilization;

	@Column(name="far_end")
	private String farEnd;

	private String funct;

	@Column(name="grp_cust")
	private String grpCust;

	private String n1sap;

	private String node;

	@Column(name="serv_lay")
	private String servLay;

	private String subint;

	private String treg;

	public TPerfEnterprise4tioc1Vw5min() {
	}

	public String getCustName() {
		return this.custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustType() {
		return this.custType;
	}

	public void setCustType(String custType) {
		this.custType = custType;
	}

	public double getE_rsi_BitsPerSecondIn() {
		return this.e_rsi_BitsPerSecondIn;
	}

	public void setE_rsi_BitsPerSecondIn(double e_rsi_BitsPerSecondIn) {
		this.e_rsi_BitsPerSecondIn = e_rsi_BitsPerSecondIn;
	}

	public double getE_rsi_BitsPerSecondOut() {
		return this.e_rsi_BitsPerSecondOut;
	}

	public void setE_rsi_BitsPerSecondOut(double e_rsi_BitsPerSecondOut) {
		this.e_rsi_BitsPerSecondOut = e_rsi_BitsPerSecondOut;
	}

	public String getERsiTimedata() {
		return this.eRsiTimedata;
	}

	public void setERsiTimedata(String eRsiTimedata) {
		this.eRsiTimedata = eRsiTimedata;
	}

	public double getE_rsi_Utilization() {
		return this.e_rsi_Utilization;
	}

	public void setE_rsi_Utilization(double e_rsi_Utilization) {
		this.e_rsi_Utilization = e_rsi_Utilization;
	}

	public String getFarEnd() {
		return this.farEnd;
	}

	public void setFarEnd(String farEnd) {
		this.farEnd = farEnd;
	}

	public String getFunct() {
		return this.funct;
	}

	public void setFunct(String funct) {
		this.funct = funct;
	}

	public String getGrpCust() {
		return this.grpCust;
	}

	public void setGrpCust(String grpCust) {
		this.grpCust = grpCust;
	}

	public String getN1sap() {
		return this.n1sap;
	}

	public void setN1sap(String n1sap) {
		this.n1sap = n1sap;
	}

	public String getNode() {
		return this.node;
	}

	public void setNode(String node) {
		this.node = node;
	}

	public String getServLay() {
		return this.servLay;
	}

	public void setServLay(String servLay) {
		this.servLay = servLay;
	}

	public String getSubint() {
		return this.subint;
	}

	public void setSubint(String subint) {
		this.subint = subint;
	}

	public String getTreg() {
		return this.treg;
	}

	public void setTreg(String treg) {
		this.treg = treg;
	}

}