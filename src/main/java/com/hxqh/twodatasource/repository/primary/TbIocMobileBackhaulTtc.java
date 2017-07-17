package com.hxqh.twodatasource.repository.primary;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the TB_IOC_MOBILE_BACKHAUL_TTC database table.
 * 拓扑图
 * 
 */
@Entity
@Table(name="TB_IOC_MOB_BACKHAUL_TTC_SOURCE")
 public class TbIocMobileBackhaulTtc implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@SequenceGenerator(name="TB_IOC_MOBILE_BACKHAUL_TTC_TTC_ID_GENERATOR", sequenceName="SEQ_TB_IOC_MOB_TTC_SOURCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_IOC_MOBILE_BACKHAUL_TTC_TTC_ID_GENERATOR")
	@Column(name="TTC_ID")
	private BigDecimal ttcId;
	private String agg;

	private BigDecimal alert;

	private BigDecimal wrong;

	private BigDecimal flap;

	@Column(name="N2_ME")
	private String n2Me;

	private BigDecimal operstatus;

	private String port;

	@Column(name="RAN_TTC")
	private String ranTtc;

	@Column(name="REG_TSEL")
	private String regTsel;

	private String timedata;

	private String treg;

	private Date ts;



	private BigDecimal utilization;

	public TbIocMobileBackhaulTtc() {
	}

	public String getAgg() {
		return this.agg;
	}

	public void setAgg(String agg) {
		this.agg = agg;
	}

	public BigDecimal getAlert() {
		return this.alert;
	}

	public void setAlert(BigDecimal alert) {
		this.alert = alert;
	}

	public BigDecimal getWrong() {
		return wrong;
	}

	public void setWrong(BigDecimal wrong) {
		this.wrong = wrong;
	}

	public BigDecimal getFlap() {
		return this.flap;
	}

	public void setFlap(BigDecimal flap) {
		this.flap = flap;
	}

	public String getN2Me() {
		return this.n2Me;
	}

	public void setN2Me(String n2Me) {
		this.n2Me = n2Me;
	}

	public BigDecimal getOperstatus() {
		return this.operstatus;
	}

	public void setOperstatus(BigDecimal operstatus) {
		this.operstatus = operstatus;
	}

	public String getPort() {
		return this.port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getRanTtc() {
		return this.ranTtc;
	}

	public void setRanTtc(String ranTtc) {
		this.ranTtc = ranTtc;
	}

	public String getRegTsel() {
		return this.regTsel;
	}

	public void setRegTsel(String regTsel) {
		this.regTsel = regTsel;
	}

	public String getTimedata() {
		return this.timedata;
	}

	public void setTimedata(String timedata) {
		this.timedata = timedata;
	}

	public String getTreg() {
		return this.treg;
	}

	public void setTreg(String treg) {
		this.treg = treg;
	}

	public Date getTs() {
		return this.ts;
	}

	public void setTs(Date ts) {
		this.ts = ts;
	}

	public BigDecimal getTtcId() {
		return this.ttcId;
	}

	public void setTtcId(BigDecimal ttcId) {
		this.ttcId = ttcId;
	}

	public BigDecimal getUtilization() {
		return this.utilization;
	}

	public void setUtilization(BigDecimal utilization) {
		this.utilization = utilization;
	}

}