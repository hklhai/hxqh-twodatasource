package com.hxqh.twodatasource.repository.primary;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;


/**
 * The persistent class for the IOCENTERPRISEEVENT_SOURCE database table.
 * 
 */
@Entity
@Table(name="TB_IOCENTERPRISEEVENT_SOURCE")
public class IocenterpriseeventSource implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "TB_IOCENTERPRISEEVENT_SOURCE_IOCENTERPRISEEVENTSOURCEID_GENERATOR", sequenceName = "SEQ_TB_IOCENTERPRISEEVENT")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TB_IOCENTERPRISEEVENT_SOURCE_IOCENTERPRISEEVENTSOURCEID_GENERATOR")
	private BigDecimal iocenterpriseeventsourceid;

	private String detekakhir;

	private String dtnya;

	private String eventtype;

	@Column(name="JML_5MNT")
	private String jml5mnt;

	private String msgalrm;


	private String node;

	private String ts;

	public IocenterpriseeventSource() {
	}

	public BigDecimal getIocenterpriseeventsourceid() {
		return iocenterpriseeventsourceid;
	}

	public void setIocenterpriseeventsourceid(BigDecimal iocenterpriseeventsourceid) {
		this.iocenterpriseeventsourceid = iocenterpriseeventsourceid;
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

	public String getEventtype() {
		return this.eventtype;
	}

	public void setEventtype(String eventtype) {
		this.eventtype = eventtype;
	}

	public String getJml5mnt() {
		return this.jml5mnt;
	}

	public void setJml5mnt(String jml5mnt) {
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

	public String getTs() {
		return this.ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

}