package com.hxqh.twodatasource.repository.primary;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the TB_IOCTICKETSCREEN96 database table.
 * 
 */
@Entity
@Table(name="TB_IOCTICKETSCREEN96")
@NamedStoredProcedureQueries({@NamedStoredProcedureQuery(name = "analysis_data_mttr_targets", procedureName = "analysis_data_mttr_targets")})
public class Locticketscreen96 implements Serializable {
	private static final long serialVersionUID = 1L;

	private String divre;

	private Date adddate;

	@Id
	@SequenceGenerator(name = "TB_IOCTICKETSCREEN96_IOCTICKETSCREEN96ID_GENERATOR", sequenceName = "SEQ_TB_IOCTICKETSCREEN96")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TB_IOCTICKETSCREEN96_IOCTICKETSCREEN96ID_GENERATOR")
	private BigDecimal iocticketscreen96id;

	@Column(name="JUMLAH_TIKET_GOLD")
	private BigDecimal jumlahTiketGold;

	@Column(name="JUMLAH_TIKET_PLATINUM")
	private BigDecimal jumlahTiketPlatinum;

	@Column(name="JUMLAH_TIKET_SILVER")
	private BigDecimal jumlahTiketSilver;

	@Column(name="PENCAPAIAN_GOLD")
	private BigDecimal pencapaianGold;

	@Column(name="PENCAPAIAN_PLATINUM")
	private BigDecimal pencapaianPlatinum;

	@Column(name="PENCAPAIAN_SILVER")
	private BigDecimal pencapaianSilver;

	@Column(name="REALISASI_GOLD")
	private BigDecimal realisasiGold;

	@Column(name="REALISASI_PLATINUM")
	private BigDecimal realisasiPlatinum;

	@Column(name="REALISASI_SILVER")
	private BigDecimal realisasiSilver;

	@Column(name="TARGET_GOLD")
	private BigDecimal targetGold;

	@Column(name="TARGET_PLATINUM")
	private BigDecimal targetPlatinum;

	@Column(name="TARGET_SILVER")
	private BigDecimal targetSilver;

	private String ym;

	public Locticketscreen96() {
	}

	public Date getAdddate() {
		return adddate;
	}

	public void setAdddate(Date adddate) {
		this.adddate = adddate;
	}

	public String getDivre() {
		return this.divre;
	}

	public void setDivre(String divre) {
		this.divre = divre;
	}

	public BigDecimal getIocticketscreen96id() {
		return this.iocticketscreen96id;
	}

	public void setIocticketscreen96id(BigDecimal iocticketscreen96id) {
		this.iocticketscreen96id = iocticketscreen96id;
	}

	public BigDecimal getJumlahTiketGold() {
		return this.jumlahTiketGold;
	}

	public void setJumlahTiketGold(BigDecimal jumlahTiketGold) {
		this.jumlahTiketGold = jumlahTiketGold;
	}

	public BigDecimal getJumlahTiketPlatinum() {
		return this.jumlahTiketPlatinum;
	}

	public void setJumlahTiketPlatinum(BigDecimal jumlahTiketPlatinum) {
		this.jumlahTiketPlatinum = jumlahTiketPlatinum;
	}

	public BigDecimal getJumlahTiketSilver() {
		return this.jumlahTiketSilver;
	}

	public void setJumlahTiketSilver(BigDecimal jumlahTiketSilver) {
		this.jumlahTiketSilver = jumlahTiketSilver;
	}

	public BigDecimal getPencapaianGold() {
		return this.pencapaianGold;
	}

	public void setPencapaianGold(BigDecimal pencapaianGold) {
		this.pencapaianGold = pencapaianGold;
	}

	public BigDecimal getPencapaianPlatinum() {
		return this.pencapaianPlatinum;
	}

	public void setPencapaianPlatinum(BigDecimal pencapaianPlatinum) {
		this.pencapaianPlatinum = pencapaianPlatinum;
	}

	public BigDecimal getPencapaianSilver() {
		return this.pencapaianSilver;
	}

	public void setPencapaianSilver(BigDecimal pencapaianSilver) {
		this.pencapaianSilver = pencapaianSilver;
	}

	public BigDecimal getRealisasiGold() {
		return this.realisasiGold;
	}

	public void setRealisasiGold(BigDecimal realisasiGold) {
		this.realisasiGold = realisasiGold;
	}

	public BigDecimal getRealisasiPlatinum() {
		return this.realisasiPlatinum;
	}

	public void setRealisasiPlatinum(BigDecimal realisasiPlatinum) {
		this.realisasiPlatinum = realisasiPlatinum;
	}

	public BigDecimal getRealisasiSilver() {
		return this.realisasiSilver;
	}

	public void setRealisasiSilver(BigDecimal realisasiSilver) {
		this.realisasiSilver = realisasiSilver;
	}

	public BigDecimal getTargetGold() {
		return this.targetGold;
	}

	public void setTargetGold(BigDecimal targetGold) {
		this.targetGold = targetGold;
	}

	public BigDecimal getTargetPlatinum() {
		return this.targetPlatinum;
	}

	public void setTargetPlatinum(BigDecimal targetPlatinum) {
		this.targetPlatinum = targetPlatinum;
	}

	public BigDecimal getTargetSilver() {
		return this.targetSilver;
	}

	public void setTargetSilver(BigDecimal targetSilver) {
		this.targetSilver = targetSilver;
	}

	public String getYm() {
		return this.ym;
	}

	public void setYm(String ym) {
		this.ym = ym;
	}

}