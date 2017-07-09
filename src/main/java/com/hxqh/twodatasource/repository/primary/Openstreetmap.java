package com.hxqh.twodatasource.repository.primary;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the OPENSTREETMAP database table.
 * 
 */
@Entity
@Table(name="tb_Openstreetmap")
public class Openstreetmap implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String openstreetmapid;

	private Object description;

	private String ipadd;

	private Object mapx;

	private Object mapy;

	private Object name;

	private BigDecimal show;

	private String sto;

	private BigDecimal treg;

	private String ts;

	@Column(name="\"TYPE\"")
	private String type;

	public Openstreetmap() {
	}

	public String getOpenstreetmapid() {
		return this.openstreetmapid;
	}

	public void setOpenstreetmapid(String openstreetmapid) {
		this.openstreetmapid = openstreetmapid;
	}

	public Object getDescription() {
		return this.description;
	}

	public void setDescription(Object description) {
		this.description = description;
	}

	public String getIpadd() {
		return this.ipadd;
	}

	public void setIpadd(String ipadd) {
		this.ipadd = ipadd;
	}

	public Object getMapx() {
		return this.mapx;
	}

	public void setMapx(Object mapx) {
		this.mapx = mapx;
	}

	public Object getMapy() {
		return this.mapy;
	}

	public void setMapy(Object mapy) {
		this.mapy = mapy;
	}

	public Object getName() {
		return this.name;
	}

	public void setName(Object name) {
		this.name = name;
	}

	public BigDecimal getShow() {
		return this.show;
	}

	public void setShow(BigDecimal show) {
		this.show = show;
	}

	public String getSto() {
		return this.sto;
	}

	public void setSto(String sto) {
		this.sto = sto;
	}

	public BigDecimal getTreg() {
		return this.treg;
	}

	public void setTreg(BigDecimal treg) {
		this.treg = treg;
	}

	public String getTs() {
		return this.ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}