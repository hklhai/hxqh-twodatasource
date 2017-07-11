package com.hxqh.twodatasource.repository.second;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_sto_koordinat database table.
 * 
 */
@Entity
@Table(name="t_sto_koordinat")
public class TStoKoordinat implements Serializable {
	private static final long serialVersionUID = 1L;

	private String funct;

	private String ipadd;

	private double lat;

	@Column(name="long")
	private double long_;

	private String manufacture;

	@Column(name="node_id")
	private String nodeId;

	private String sto;

	private String treg;

	public TStoKoordinat() {
	}

	public String getFunct() {
		return this.funct;
	}

	public void setFunct(String funct) {
		this.funct = funct;
	}

	public String getIpadd() {
		return this.ipadd;
	}

	public void setIpadd(String ipadd) {
		this.ipadd = ipadd;
	}

	public double getLat() {
		return this.lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLong_() {
		return this.long_;
	}

	public void setLong_(double long_) {
		this.long_ = long_;
	}

	public String getManufacture() {
		return this.manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public String getNodeId() {
		return this.nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

	public String getSto() {
		return this.sto;
	}

	public void setSto(String sto) {
		this.sto = sto;
	}

	public String getTreg() {
		return this.treg;
	}

	public void setTreg(String treg) {
		this.treg = treg;
	}

}