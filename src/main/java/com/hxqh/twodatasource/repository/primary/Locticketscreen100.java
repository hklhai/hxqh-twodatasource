package com.hxqh.twodatasource.repository.primary;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the TB_IOCTICKETSCREEN100 database table.
 */
@Entity
@Table(name = "TB_IOCTICKETSCREEN100")
@NamedStoredProcedureQueries({@NamedStoredProcedureQuery(name = "analysis_data_mttr_proactive", procedureName = "analysis_data_mttr_proactive")})
public class Locticketscreen100 implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "BULAN_INI_GOLD")
    private BigDecimal bulanIniGold;

    @Column(name = "BULAN_INI_PLATINUM")
    private BigDecimal bulanIniPlatinum;

    @Column(name = "BULAN_INI_REGULAR")
    private BigDecimal bulanIniRegular;

    @Column(name = "BULAN_INI_TOTAL")
    private BigDecimal bulanIniTotal;

    @Column(name = "BULAN_LALU_GOLD")
    private BigDecimal bulanLaluGold;

    @Column(name = "BULAN_LALU_PLATINUM")
    private BigDecimal bulanLaluPlatinum;

    @Column(name = "BULAN_LALU_REGULAR")
    private BigDecimal bulanLaluRegular;

    @Column(name = "BULAN_LALU_TOTAL")
    private BigDecimal bulanLaluTotal;

    private String divre;

    @Column(name = "H_1_GOLD")
    private BigDecimal h1Gold;

    @Column(name = "H_1_PLATINUM")
    private BigDecimal h1Platinum;

    @Column(name = "H_1_REGULAR")
    private BigDecimal h1Regular;

    @Column(name = "H_1_TOTAL")
    private BigDecimal h1Total;

    @Column(name = "H_2_GOLD")
    private BigDecimal h2Gold;

    @Column(name = "H_2_PLATINUM")
    private BigDecimal h2Platinum;

    @Column(name = "H_2_REGULAR")
    private BigDecimal h2Regular;

    @Column(name = "H_2_TOTAL")
    private BigDecimal h2Total;

    @Id
    @SequenceGenerator(name = "TB_IOCTICKETSCREEN100_IOCTICKETSCREEN100ID_GENERATOR", sequenceName = "SEQ_TB_IOCTICKETSCREEN100")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TB_IOCTICKETSCREEN100_IOCTICKETSCREEN100ID_GENERATOR")
    private BigDecimal iocticketscreen100id;

    private Date adddate;

    public Locticketscreen100() {
    }

    public Date getAdddate() {
        return adddate;
    }

    public void setAdddate(Date adddate) {
        this.adddate = adddate;
    }

    public BigDecimal getBulanIniGold() {
        return this.bulanIniGold;
    }

    public void setBulanIniGold(BigDecimal bulanIniGold) {
        this.bulanIniGold = bulanIniGold;
    }

    public BigDecimal getBulanIniPlatinum() {
        return this.bulanIniPlatinum;
    }

    public void setBulanIniPlatinum(BigDecimal bulanIniPlatinum) {
        this.bulanIniPlatinum = bulanIniPlatinum;
    }

    public BigDecimal getBulanIniRegular() {
        return this.bulanIniRegular;
    }

    public void setBulanIniRegular(BigDecimal bulanIniRegular) {
        this.bulanIniRegular = bulanIniRegular;
    }

    public BigDecimal getBulanIniTotal() {
        return this.bulanIniTotal;
    }

    public void setBulanIniTotal(BigDecimal bulanIniTotal) {
        this.bulanIniTotal = bulanIniTotal;
    }

    public BigDecimal getBulanLaluGold() {
        return this.bulanLaluGold;
    }

    public void setBulanLaluGold(BigDecimal bulanLaluGold) {
        this.bulanLaluGold = bulanLaluGold;
    }

    public BigDecimal getBulanLaluPlatinum() {
        return this.bulanLaluPlatinum;
    }

    public void setBulanLaluPlatinum(BigDecimal bulanLaluPlatinum) {
        this.bulanLaluPlatinum = bulanLaluPlatinum;
    }

    public BigDecimal getBulanLaluRegular() {
        return this.bulanLaluRegular;
    }

    public void setBulanLaluRegular(BigDecimal bulanLaluRegular) {
        this.bulanLaluRegular = bulanLaluRegular;
    }

    public BigDecimal getBulanLaluTotal() {
        return this.bulanLaluTotal;
    }

    public void setBulanLaluTotal(BigDecimal bulanLaluTotal) {
        this.bulanLaluTotal = bulanLaluTotal;
    }

    public String getDivre() {
        return this.divre;
    }

    public void setDivre(String divre) {
        this.divre = divre;
    }

    public BigDecimal getH1Gold() {
        return this.h1Gold;
    }

    public void setH1Gold(BigDecimal h1Gold) {
        this.h1Gold = h1Gold;
    }

    public BigDecimal getH1Platinum() {
        return this.h1Platinum;
    }

    public void setH1Platinum(BigDecimal h1Platinum) {
        this.h1Platinum = h1Platinum;
    }

    public BigDecimal getH1Regular() {
        return this.h1Regular;
    }

    public void setH1Regular(BigDecimal h1Regular) {
        this.h1Regular = h1Regular;
    }

    public BigDecimal getH1Total() {
        return this.h1Total;
    }

    public void setH1Total(BigDecimal h1Total) {
        this.h1Total = h1Total;
    }

    public BigDecimal getH2Gold() {
        return this.h2Gold;
    }

    public void setH2Gold(BigDecimal h2Gold) {
        this.h2Gold = h2Gold;
    }

    public BigDecimal getH2Platinum() {
        return this.h2Platinum;
    }

    public void setH2Platinum(BigDecimal h2Platinum) {
        this.h2Platinum = h2Platinum;
    }

    public BigDecimal getH2Regular() {
        return this.h2Regular;
    }

    public void setH2Regular(BigDecimal h2Regular) {
        this.h2Regular = h2Regular;
    }

    public BigDecimal getH2Total() {
        return this.h2Total;
    }

    public void setH2Total(BigDecimal h2Total) {
        this.h2Total = h2Total;
    }

    public BigDecimal getIocticketscreen100id() {
        return this.iocticketscreen100id;
    }

    public void setIocticketscreen100id(BigDecimal iocticketscreen100id) {
        this.iocticketscreen100id = iocticketscreen100id;
    }

}