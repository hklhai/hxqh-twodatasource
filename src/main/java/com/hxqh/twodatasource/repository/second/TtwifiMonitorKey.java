package com.hxqh.twodatasource.repository.second;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by Ocean lin on 2017/7/11.
 */
@Embeddable
public class TtwifiMonitorKey implements Serializable {

    @Column(name="bulan_ini_gold")
    private int bulanIniGold;

    @Column(name="bulan_ini_platinum")
    private int bulanIniPlatinum;

    @Column(name="bulan_ini_regular")
    private int bulanIniRegular;

    @Column(name="bulan_ini_total")
    private int bulanIniTotal;

    @Column(name="bulan_lalu_gold")
    private int bulanLaluGold;

    @Column(name="bulan_lalu_platinum")
    private int bulanLaluPlatinum;

    @Column(name="bulan_lalu_regular")
    private int bulanLaluRegular;

    @Column(name="bulan_lalu_total")
    private int bulanLaluTotal;

    private String divre;

    @Column(name="h_1_gold")
    private int h1Gold;

    @Column(name="h_1_platinum")
    private int h1Platinum;

    @Column(name="h_1_regular")
    private int h1Regular;

    @Column(name="h_1_total")
    private int h1Total;

    @Column(name="h_2_gold")
    private int h2Gold;

    @Column(name="h_2_platinum")
    private int h2Platinum;

    @Column(name="h_2_regular")
    private int h2Regular;

    @Column(name="h_2_total")
    private int h2Total;

    public TtwifiMonitorKey() {
    }

    public int getBulanIniGold() {
        return this.bulanIniGold;
    }

    public void setBulanIniGold(int bulanIniGold) {
        this.bulanIniGold = bulanIniGold;
    }

    public int getBulanIniPlatinum() {
        return this.bulanIniPlatinum;
    }

    public void setBulanIniPlatinum(int bulanIniPlatinum) {
        this.bulanIniPlatinum = bulanIniPlatinum;
    }

    public int getBulanIniRegular() {
        return this.bulanIniRegular;
    }

    public void setBulanIniRegular(int bulanIniRegular) {
        this.bulanIniRegular = bulanIniRegular;
    }

    public int getBulanIniTotal() {
        return this.bulanIniTotal;
    }

    public void setBulanIniTotal(int bulanIniTotal) {
        this.bulanIniTotal = bulanIniTotal;
    }

    public int getBulanLaluGold() {
        return this.bulanLaluGold;
    }

    public void setBulanLaluGold(int bulanLaluGold) {
        this.bulanLaluGold = bulanLaluGold;
    }

    public int getBulanLaluPlatinum() {
        return this.bulanLaluPlatinum;
    }

    public void setBulanLaluPlatinum(int bulanLaluPlatinum) {
        this.bulanLaluPlatinum = bulanLaluPlatinum;
    }

    public int getBulanLaluRegular() {
        return this.bulanLaluRegular;
    }

    public void setBulanLaluRegular(int bulanLaluRegular) {
        this.bulanLaluRegular = bulanLaluRegular;
    }

    public int getBulanLaluTotal() {
        return this.bulanLaluTotal;
    }

    public void setBulanLaluTotal(int bulanLaluTotal) {
        this.bulanLaluTotal = bulanLaluTotal;
    }

    public String getDivre() {
        return this.divre;
    }

    public void setDivre(String divre) {
        this.divre = divre;
    }

    public int getH1Gold() {
        return this.h1Gold;
    }

    public void setH1Gold(int h1Gold) {
        this.h1Gold = h1Gold;
    }

    public int getH1Platinum() {
        return this.h1Platinum;
    }

    public void setH1Platinum(int h1Platinum) {
        this.h1Platinum = h1Platinum;
    }

    public int getH1Regular() {
        return this.h1Regular;
    }

    public void setH1Regular(int h1Regular) {
        this.h1Regular = h1Regular;
    }

    public int getH1Total() {
        return this.h1Total;
    }

    public void setH1Total(int h1Total) {
        this.h1Total = h1Total;
    }

    public int getH2Gold() {
        return this.h2Gold;
    }

    public void setH2Gold(int h2Gold) {
        this.h2Gold = h2Gold;
    }

    public int getH2Platinum() {
        return this.h2Platinum;
    }

    public void setH2Platinum(int h2Platinum) {
        this.h2Platinum = h2Platinum;
    }

    public int getH2Regular() {
        return this.h2Regular;
    }

    public void setH2Regular(int h2Regular) {
        this.h2Regular = h2Regular;
    }

    public int getH2Total() {
        return this.h2Total;
    }

    public void setH2Total(int h2Total) {
        this.h2Total = h2Total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TtwifiMonitorKey that = (TtwifiMonitorKey) o;

        if (bulanIniGold != that.bulanIniGold) return false;
        if (bulanIniPlatinum != that.bulanIniPlatinum) return false;
        if (bulanIniRegular != that.bulanIniRegular) return false;
        if (bulanIniTotal != that.bulanIniTotal) return false;
        if (bulanLaluGold != that.bulanLaluGold) return false;
        if (bulanLaluPlatinum != that.bulanLaluPlatinum) return false;
        if (bulanLaluRegular != that.bulanLaluRegular) return false;
        if (bulanLaluTotal != that.bulanLaluTotal) return false;
        if (h1Gold != that.h1Gold) return false;
        if (h1Platinum != that.h1Platinum) return false;
        if (h1Regular != that.h1Regular) return false;
        if (h1Total != that.h1Total) return false;
        if (h2Gold != that.h2Gold) return false;
        if (h2Platinum != that.h2Platinum) return false;
        if (h2Regular != that.h2Regular) return false;
        if (h2Total != that.h2Total) return false;
        return divre != null ? divre.equals(that.divre) : that.divre == null;
    }

    @Override
    public int hashCode() {
        int result = bulanIniGold;
        result = 31 * result + bulanIniPlatinum;
        result = 31 * result + bulanIniRegular;
        result = 31 * result + bulanIniTotal;
        result = 31 * result + bulanLaluGold;
        result = 31 * result + bulanLaluPlatinum;
        result = 31 * result + bulanLaluRegular;
        result = 31 * result + bulanLaluTotal;
        result = 31 * result + (divre != null ? divre.hashCode() : 0);
        result = 31 * result + h1Gold;
        result = 31 * result + h1Platinum;
        result = 31 * result + h1Regular;
        result = 31 * result + h1Total;
        result = 31 * result + h2Gold;
        result = 31 * result + h2Platinum;
        result = 31 * result + h2Regular;
        result = 31 * result + h2Total;
        return result;
    }
}
