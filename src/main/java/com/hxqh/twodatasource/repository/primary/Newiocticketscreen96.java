package com.hxqh.twodatasource.repository.primary;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the NEWIOCTICKETSCREEN96 database table.
 * 
 */
@Entity
@Table(name="tb_Newiocticketscreen96")
public class Newiocticketscreen96 implements Serializable {
	private static final long serialVersionUID = 1L;

	private String kategori;

	private BigDecimal mttr;

	private String permss;

	private String seliver;

	private String slgtarget;

	private BigDecimal ticket;

	private String treg;

	public Newiocticketscreen96() {
	}

	public String getKategori() {
		return this.kategori;
	}

	public void setKategori(String kategori) {
		this.kategori = kategori;
	}

	public BigDecimal getMttr() {
		return this.mttr;
	}

	public void setMttr(BigDecimal mttr) {
		this.mttr = mttr;
	}

	public String getPermss() {
		return this.permss;
	}

	public void setPermss(String permss) {
		this.permss = permss;
	}

	public String getSeliver() {
		return this.seliver;
	}

	public void setSeliver(String seliver) {
		this.seliver = seliver;
	}

	public String getSlgtarget() {
		return this.slgtarget;
	}

	public void setSlgtarget(String slgtarget) {
		this.slgtarget = slgtarget;
	}

	public BigDecimal getTicket() {
		return this.ticket;
	}

	public void setTicket(BigDecimal ticket) {
		this.ticket = ticket;
	}

	public String getTreg() {
		return this.treg;
	}

	public void setTreg(String treg) {
		this.treg = treg;
	}

}