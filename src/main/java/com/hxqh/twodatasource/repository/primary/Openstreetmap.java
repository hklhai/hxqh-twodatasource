package com.hxqh.twodatasource.repository.primary;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the TB_OPENSTREETMAP database table.
 * 
 */
@Entity
@Table(name="TB_IOC_CENTER_MAP")
public class Openstreetmap implements Serializable {
	private static final long serialVersionUID = 1L;

	private String funct;

	private String ipadd;

	private BigDecimal latitude;

	private BigDecimal longitude;

	private String manufacture;

	@Column(name="NODE_ID")
	private String nodeId;

	@Id
	@SequenceGenerator(name = "TB_OPENSTREETMAP_OPENSTREETMAPID_GENERATOR", sequenceName = "SEQ_TB_OPENSTREETMAP")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TB_OPENSTREETMAP_OPENSTREETMAPID_GENERATOR")
	private BigDecimal openstreetmapid;

	private String sto;

	private String treg;

	private Date adddate;

	private Integer show;

	private String status;

	public Openstreetmap() {
	}

	public Date getAdddate() {
		return adddate;
	}

	public void setAdddate(Date adddate) {
		this.adddate = adddate;
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

	public BigDecimal getLatitude() {
		return this.latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	public BigDecimal getLongitude() {
		return this.longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
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

	public BigDecimal getOpenstreetmapid() {
		return this.openstreetmapid;
	}

	public void setOpenstreetmapid(BigDecimal openstreetmapid) {
		this.openstreetmapid = openstreetmapid;
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

	public Integer getShow() {
		return show;
	}

	public void setShow(Integer show) {
		this.show = show;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}