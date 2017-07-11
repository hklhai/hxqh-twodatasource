package com.hxqh.twodatasource.repository.second;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the T_PORTDOWN_4IOC database table.
 * 
 */
@Entity
@Table(name="T_PORTDOWN_4IOC")
public class TPortdown4ioc implements Serializable {
	private static final long serialVersionUID = 1L;

	private String agg;

	private String descp;

	@Column(name="interface")
	private String interface_;

	private String nbr;

	@Column(name="node_ip")
	private String nodeIp;

	private String operstatus;

	private String ruas;

	@Temporal(TemporalType.TIMESTAMP)
	private Date timedata;

	private String timemesin;

	public TPortdown4ioc() {
	}

	public String getAgg() {
		return this.agg;
	}

	public void setAgg(String agg) {
		this.agg = agg;
	}

	public String getDescp() {
		return this.descp;
	}

	public void setDescp(String descp) {
		this.descp = descp;
	}

	public String getInterface_() {
		return this.interface_;
	}

	public void setInterface_(String interface_) {
		this.interface_ = interface_;
	}

	public String getNbr() {
		return this.nbr;
	}

	public void setNbr(String nbr) {
		this.nbr = nbr;
	}

	public String getNodeIp() {
		return this.nodeIp;
	}

	public void setNodeIp(String nodeIp) {
		this.nodeIp = nodeIp;
	}

	public String getOperstatus() {
		return this.operstatus;
	}

	public void setOperstatus(String operstatus) {
		this.operstatus = operstatus;
	}

	public String getRuas() {
		return this.ruas;
	}

	public void setRuas(String ruas) {
		this.ruas = ruas;
	}

	public Date getTimedata() {
		return this.timedata;
	}

	public void setTimedata(Date timedata) {
		this.timedata = timedata;
	}

	public String getTimemesin() {
		return this.timemesin;
	}

	public void setTimemesin(String timemesin) {
		this.timemesin = timemesin;
	}

}