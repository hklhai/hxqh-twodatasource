package com.hxqh.twodatasource.repository.second;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;


/**
 * The persistent class for the T_PERF_ENTERPRISE_4TIOC1_VW_5MINS database table.
 * 
 */
@Entity
@Table(name="v_perf_enterprise_4tioc1")
public class TPerfEnterprise4tioc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private BigDecimal mysqlid;

	@Column(name="e_rsi_timedata")
	private String eRsiTimedata;

	@Column(name="cust_name")
	private String custName;

	@Column(name="custtype")
	private String custtype;

	private double ersibitspersecondin;

	private double ersibitspersecondout;

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


	public TPerfEnterprise4tioc() {
	}

	public BigDecimal getMysqlid() {
		return mysqlid;
	}

	public void setMysqlid(BigDecimal mysqlid) {
		this.mysqlid = mysqlid;
	}

	public String geteRsiTimedata() {
		return eRsiTimedata;
	}

	public void seteRsiTimedata(String eRsiTimedata) {
		this.eRsiTimedata = eRsiTimedata;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCusttype() {
		return custtype;
	}

	public void setCusttype(String custtype) {
		this.custtype = custtype;
	}

	public double getErsibitspersecondin() {
		return ersibitspersecondin;
	}

	public void setErsibitspersecondin(double ersibitspersecondin) {
		this.ersibitspersecondin = ersibitspersecondin;
	}

	public double getErsibitspersecondout() {
		return ersibitspersecondout;
	}

	public void setErsibitspersecondout(double ersibitspersecondout) {
		this.ersibitspersecondout = ersibitspersecondout;
	}

	public double getE_rsi_Utilization() {
		return e_rsi_Utilization;
	}

	public void setE_rsi_Utilization(double e_rsi_Utilization) {
		this.e_rsi_Utilization = e_rsi_Utilization;
	}

	public String getFarEnd() {
		return farEnd;
	}

	public void setFarEnd(String farEnd) {
		this.farEnd = farEnd;
	}

	public String getFunct() {
		return funct;
	}

	public void setFunct(String funct) {
		this.funct = funct;
	}

	public String getGrpCust() {
		return grpCust;
	}

	public void setGrpCust(String grpCust) {
		this.grpCust = grpCust;
	}

	public String getN1sap() {
		return n1sap;
	}

	public void setN1sap(String n1sap) {
		this.n1sap = n1sap;
	}

	public String getNode() {
		return node;
	}

	public void setNode(String node) {
		this.node = node;
	}

	public String getServLay() {
		return servLay;
	}

	public void setServLay(String servLay) {
		this.servLay = servLay;
	}

	public String getSubint() {
		return subint;
	}

	public void setSubint(String subint) {
		this.subint = subint;
	}

	public String getTreg() {
		return treg;
	}

	public void setTreg(String treg) {
		this.treg = treg;
	}
}