package com.hxqh.twodatasource.repository.second;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;


/**
 * The persistent class for the ttwifi_mttr_proactive_last_month database table.
 * 
 */
@Entity
@Table(name="ttwifi_mttr_proactive_last_month")
public class TtwifiMttrProactiveLastMonth implements Serializable {
	private static final long serialVersionUID = 1L;

	private String divre;

	@Column(name="jumlah_tiket_gold")
	private int jumlahTiketGold;

	@Column(name="jumlah_tiket_platinum")
	private int jumlahTiketPlatinum;

	@Column(name="jumlah_tiket_silver")
	private int jumlahTiketSilver;

	@Column(name="pencapaian_gold")
	private int pencapaianGold;

	@Column(name="pencapaian_platinum")
	private int pencapaianPlatinum;

	@Column(name="pencapaian_silver")
	private int pencapaianSilver;

	@Column(name="realisasi_gold")
	private int realisasiGold;

	@Column(name="realisasi_platinum")
	private int realisasiPlatinum;

	@Column(name="realisasi_silver")
	private int realisasiSilver;

	@Column(name="target_gold")
	private int targetGold;

	@Column(name="target_platinum")
	private int targetPlatinum;

	@Column(name="target_silver")
	private int targetSilver;

	private String ym;

	public TtwifiMttrProactiveLastMonth() {
	}

	public String getDivre() {
		return this.divre;
	}

	public void setDivre(String divre) {
		this.divre = divre;
	}

	public int getJumlahTiketGold() {
		return this.jumlahTiketGold;
	}

	public void setJumlahTiketGold(int jumlahTiketGold) {
		this.jumlahTiketGold = jumlahTiketGold;
	}

	public int getJumlahTiketPlatinum() {
		return this.jumlahTiketPlatinum;
	}

	public void setJumlahTiketPlatinum(int jumlahTiketPlatinum) {
		this.jumlahTiketPlatinum = jumlahTiketPlatinum;
	}

	public int getJumlahTiketSilver() {
		return this.jumlahTiketSilver;
	}

	public void setJumlahTiketSilver(int jumlahTiketSilver) {
		this.jumlahTiketSilver = jumlahTiketSilver;
	}

	public int getPencapaianGold() {
		return this.pencapaianGold;
	}

	public void setPencapaianGold(int pencapaianGold) {
		this.pencapaianGold = pencapaianGold;
	}

	public int getPencapaianPlatinum() {
		return this.pencapaianPlatinum;
	}

	public void setPencapaianPlatinum(int pencapaianPlatinum) {
		this.pencapaianPlatinum = pencapaianPlatinum;
	}

	public int getPencapaianSilver() {
		return this.pencapaianSilver;
	}

	public void setPencapaianSilver(int pencapaianSilver) {
		this.pencapaianSilver = pencapaianSilver;
	}

	public int getRealisasiGold() {
		return this.realisasiGold;
	}

	public void setRealisasiGold(int realisasiGold) {
		this.realisasiGold = realisasiGold;
	}

	public int getRealisasiPlatinum() {
		return this.realisasiPlatinum;
	}

	public void setRealisasiPlatinum(int realisasiPlatinum) {
		this.realisasiPlatinum = realisasiPlatinum;
	}

	public int getRealisasiSilver() {
		return this.realisasiSilver;
	}

	public void setRealisasiSilver(int realisasiSilver) {
		this.realisasiSilver = realisasiSilver;
	}

	public int getTargetGold() {
		return this.targetGold;
	}

	public void setTargetGold(int targetGold) {
		this.targetGold = targetGold;
	}

	public int getTargetPlatinum() {
		return this.targetPlatinum;
	}

	public void setTargetPlatinum(int targetPlatinum) {
		this.targetPlatinum = targetPlatinum;
	}

	public int getTargetSilver() {
		return this.targetSilver;
	}

	public void setTargetSilver(int targetSilver) {
		this.targetSilver = targetSilver;
	}

	public String getYm() {
		return this.ym;
	}

	public void setYm(String ym) {
		this.ym = ym;
	}

}