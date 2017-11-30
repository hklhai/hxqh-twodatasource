package com.hxqh.twodatasource.repository.primary;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the TB_ENTERPRISE_PROACTIVE database table.
 * 
 */
@Entity
@Table(name="TB_ENTERPRISE_PROACTIVE")
public class TbEnterpriseProactive implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "TB_ENTERPRISE_PROACTIVE_PROACTIVEID_GENERATOR", sequenceName = "SEQ_ENTERPRISE_PROACTIVE")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TB_ENTERPRISE_PROACTIVE_PROACTIVEID_GENERATOR")
	private long proactiveid;

	@Temporal(TemporalType.DATE)
	private Date addtime;

	private String div;

	@Column(name="FAR_END")
	private String farEnd;

	@Column(name="GRP_CUST")
	private String grpCust;

	private Long mid;

	@Column(name="N1_SAP")
	private String n1Sap;

	@Column(name="N2_NODE")
	private String n2Node;

	private String pe;

	@Column(name="S_ALRM")
	private String sAlrm;

	@Column(name="S_NBR")
	private String sNbr;

	@Column(name="S_TIMEDATA")
	private String sTimedata;

	private String sap;

	private String serv;

	private String sid;

	private String subinterface;

	private String treg;

	private String vrf;

	public TbEnterpriseProactive() {
	}

	public long getProactiveid() {
		return this.proactiveid;
	}

	public void setProactiveid(long proactiveid) {
		this.proactiveid = proactiveid;
	}

	public Date getAddtime() {
		return this.addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
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

	public Long getMid() {
		return this.mid;
	}

	public void setMid(Long mid) {
		this.mid = mid;
	}

	public String getN1Sap() {
		return this.n1Sap;
	}

	public void setN1Sap(String n1Sap) {
		this.n1Sap = n1Sap;
	}

	public String getN2Node() {
		return this.n2Node;
	}

	public void setN2Node(String n2Node) {
		this.n2Node = n2Node;
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