package com.hxqh.twodatasource.repository.second;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the v_enterprise_proactive database table.
 * 
 */
@Entity
@Table(name="v_enterprise_proactive")
public class VEnterpriseProactive implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	@Column(name="`DIV`")
	private String div;

	@Column(name="far_end")
	private String farEnd;

	@Column(name="grp_cust")
	private String grpCust;

	@Column(name="N1_sap")
	private String n1_sap;

	@Column(name="N2_node")
	private String n2_node;

	private String pe;

	@Column(name="s_alrm")
	private String sAlrm;

	@Column(name="s_nbr")
	private String sNbr;

	@Column(name="s_timedata")
	private String sTimedata;

	private String sap;

	private String serv;

	private String sid;

	private String subinterface;

	private String treg;

	private String vrf;

	public VEnterpriseProactive() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDiv() {
		return this.div;
	}

	public void setDiv(String div) {
		this.div = div;
	}

	public String getFarEnd() {
		return this.farEnd;
	}

	public void setFarEnd(String farEnd) {
		this.farEnd = farEnd;
	}

	public String getGrpCust() {
		return this.grpCust;
	}

	public void setGrpCust(String grpCust) {
		this.grpCust = grpCust;
	}

	public String getN1_sap() {
		return this.n1_sap;
	}

	public void setN1_sap(String n1_sap) {
		this.n1_sap = n1_sap;
	}

	public String getN2_node() {
		return this.n2_node;
	}

	public void setN2_node(String n2_node) {
		this.n2_node = n2_node;
	}

	public String getPe() {
		return this.pe;
	}

	public void setPe(String pe) {
		this.pe = pe;
	}

	public String getSAlrm() {
		return this.sAlrm;
	}

	public void setSAlrm(String sAlrm) {
		this.sAlrm = sAlrm;
	}

	public String getSNbr() {
		return this.sNbr;
	}

	public void setSNbr(String sNbr) {
		this.sNbr = sNbr;
	}

	public String getSTimedata() {
		return this.sTimedata;
	}

	public void setSTimedata(String sTimedata) {
		this.sTimedata = sTimedata;
	}

	public String getSap() {
		return this.sap;
	}

	public void setSap(String sap) {
		this.sap = sap;
	}

	public String getServ() {
		return this.serv;
	}

	public void setServ(String serv) {
		this.serv = serv;
	}

	public String getSid() {
		return this.sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSubinterface() {
		return this.subinterface;
	}

	public void setSubinterface(String subinterface) {
		this.subinterface = subinterface;
	}

	public String getTreg() {
		return this.treg;
	}

	public void setTreg(String treg) {
		this.treg = treg;
	}

	public String getVrf() {
		return this.vrf;
	}

	public void setVrf(String vrf) {
		this.vrf = vrf;
	}

}