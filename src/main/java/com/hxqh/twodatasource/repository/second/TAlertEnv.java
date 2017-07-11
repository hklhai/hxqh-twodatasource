package com.hxqh.twodatasource.repository.second;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_alert_env database table.
 * 
 */
@Entity
@Table(name="t_alert_env")
public class TAlertEnv implements Serializable {
	private static final long serialVersionUID = 1L;

	private String detekakhir;

	private String dtnya;

	@Column(name="jml_5mnt")
	private int jml5mnt;

	private String msgalrm;

	private String node;

	public TAlertEnv() {
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

	public int getJml5mnt() {
		return this.jml5mnt;
	}

	public void setJml5mnt(int jml5mnt) {
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