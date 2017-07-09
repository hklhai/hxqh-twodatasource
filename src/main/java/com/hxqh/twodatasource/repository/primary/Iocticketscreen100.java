package com.hxqh.twodatasource.repository.primary;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;


/**
 * The persistent class for the IOCTICKETSCREEN100 database table.
 * 
 */
@Entity
@Table(name="TB_IOCTICKETSCREEN100")
public class Iocticketscreen100 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "TB_IOCTICKETSCREEN100_IOCTICKETSCREEN100ID_GENERATOR", sequenceName = "SEQ_TB_IOCTICKETSCREEN100")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TB_IOCTICKETSCREEN100_IOCTICKETSCREEN100ID_GENERATOR")
	private BigDecimal iocticketscreen100id;

	@Column(name="BULAN_INI_GOLD")
	private String bulanIniGold;

	@Column(name="BULAN_INI_PLATINUM")
	private String bulanIniPlatinum;

	@Column(name="BULAN_INI_REGULAR")
	private String bulanIniRegular;

	@Column(name="BULAN_INI_TOTAL")
	private String bulanIniTotal;

	@Column(name="BULAN_LALU_GOLD")
	private String bulanLaluGold;

	@Column(name="BULAN_LALU_PLATINUM")
	private String bulanLaluPlatinum;

	@Column(name="BULAN_LALU_REGULAR")
	private String bulanLaluRegular;

	@Column(name="BULAN_LALU_TOTAL")
	private String bulanLaluTotal;

	private String divre;

	@Column(name="H_1_GOLD")
	private String h1Gold;

	@Column(name="H_1_PLATINUM")
	private String h1Platinum;

	@Column(name="H_1_REGULAR")
	private String h1Regular;

	@Column(name="H_1_TOTAL")
	private String h1Total;

	@Column(name="H_2_GOLD")
	private String h2Gold;

	@Column(name="H_2_PLATINUM")
	private String h2Platinum;

	@Column(name="H_2_REGULAR")
	private String h2Regular;

	@Column(name="H_2_TOTAL")
	private String h2Total;

	private String ts;

	public Iocticketscreen100() {
	}

	public BigDecimal getIocticketscreen100id() {
		return iocticketscreen100id;
	}

	public void setIocticketscreen100id(BigDecimal iocticketscreen100id) {
		this.iocticketscreen100id = iocticketscreen100id;
	}

	public String getBulanIniGold() {
		return this.bulanIniGold;
	}

	public void setBulanIniGold(String bulanIniGold) {
		this.bulanIniGold = bulanIniGold;
	}

	public String getBulanIniPlatinum() {
		return this.bulanIniPlatinum;
	}

	public void setBulanIniPlatinum(String bulanIniPlatinum) {
		this.bulanIniPlatinum = bulanIniPlatinum;
	}

	public String getBulanIniRegular() {
		return this.bulanIniRegular;
	}

	public void setBulanIniRegular(String bulanIniRegular) {
		this.bulanIniRegular = bulanIniRegular;
	}

	public String getBulanIniTotal() {
		return this.bulanIniTotal;
	}

	public void setBulanIniTotal(String bulanIniTotal) {
		this.bulanIniTotal = bulanIniTotal;
	}

	public String getBulanLaluGold() {
		return this.bulanLaluGold;
	}

	public void setBulanLaluGold(String bulanLaluGold) {
		this.bulanLaluGold = bulanLaluGold;
	}

	public String getBulanLaluPlatinum() {
		return this.bulanLaluPlatinum;
	}

	public void setBulanLaluPlatinum(String bulanLaluPlatinum) {
		this.bulanLaluPlatinum = bulanLaluPlatinum;
	}

	public String getBulanLaluRegular() {
		return this.bulanLaluRegular;
	}

	public void setBulanLaluRegular(String bulanLaluRegular) {
		this.bulanLaluRegular = bulanLaluRegular;
	}

	public String getBulanLaluTotal() {
		return this.bulanLaluTotal;
	}

	public void setBulanLaluTotal(String bulanLaluTotal) {
		this.bulanLaluTotal = bulanLaluTotal;
	}

	public String getDivre() {
		return this.divre;
	}

	public void setDivre(String divre) {
		this.divre = divre;
	}

	public String getH1Gold() {
		return this.h1Gold;
	}

	public void setH1Gold(String h1Gold) {
		this.h1Gold = h1Gold;
	}

	public String getH1Platinum() {
		return this.h1Platinum;
	}

	public void setH1Platinum(String h1Platinum) {
		this.h1Platinum = h1Platinum;
	}

	public String getH1Regular() {
		return this.h1Regular;
	}

	public void setH1Regular(String h1Regular) {
		this.h1Regular = h1Regular;
	}

	public String getH1Total() {
		return this.h1Total;
	}

	public void setH1Total(String h1Total) {
		this.h1Total = h1Total;
	}

	public String getH2Gold() {
		return this.h2Gold;
	}

	public void setH2Gold(String h2Gold) {
		this.h2Gold = h2Gold;
	}

	public String getH2Platinum() {
		return this.h2Platinum;
	}

	public void setH2Platinum(String h2Platinum) {
		this.h2Platinum = h2Platinum;
	}

	public String getH2Regular() {
		return this.h2Regular;
	}

	public void setH2Regular(String h2Regular) {
		this.h2Regular = h2Regular;
	}

	public String getH2Total() {
		return this.h2Total;
	}

	public void setH2Total(String h2Total) {
		this.h2Total = h2Total;
	}

	public String getTs() {
		return this.ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

}