package com.hxqh.twodatasource.repository.primary;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TB_IOCENTERPRISEEVENT database table.
 * 
 */
@Entity
@Table(name="TB_IOCENTERPRISEEVENT")
public class Locenterpriseevent implements Serializable {
	private static final long serialVersionUID = 1L;

	private String detekakhir;

	private String dtnya;

	private BigDecimal iocenterpriseeventid;

	@Column(name="JML_5MNT")
	private BigDecimal jml5mnt;

	private String msgalrm;

	private String node;

	public Locenterpriseevent() {
	}

	public String getDetekakhir() {
		return this.detekakhir;
	}

	public void setDetekakhir(String detekakhir) {
		this.detekakhir = detekakhir;
	}

	public String getDtnya() {
		return this.dtnya;
	}

	public void setDtnya(String dtnya) {
		this.dtnya = dtnya;
	}

	public BigDecimal getIocenterpriseeventid() {
		return this.iocenterpriseeventid;
	}

	public void setIocenterpriseeventid(BigDecimal iocenterpriseeventid) {
		this.iocenterpriseeventid = iocenterpriseeventid;
	}

	public BigDecimal getJml5mnt() {
		return this.jml5mnt;
	}

	public void setJml5mnt(BigDecimal jml5mnt) {
		this.jml5mnt = jml5mnt;
	}

	public String getMsgalrm() {
		return this.msgalrm;
	}

	public void setMsgalrm(String msgalrm) {
		this.msgalrm = msgalrm;
	}

	public String getNode() {
		return this.node;
	}

	public void setNode(String node) {
		this.node = node;
	}

}