package com.hxqh.twodatasource.repository.second;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.TemporalType;
import java.io.Serializable;

/**
 * Created by Ocean lin on 2017/7/11.
 */
@Embeddable
public class TtwifiMttrProactiveKey implements Serializable {

    @Column(name = "pencapaian_silver")
    private int pencapaianSilver;

    @Column(name = "realisasi_gold")
    private int realisasiGold;

    @Column(name = "realisasi_platinum")
    private int realisasiPlatinum;

    @Column(name = "realisasi_silver")
    private int realisasiSilver;

    @Column(name = "target_gold")
    private int targetGold;

    @Column(name = "target_platinum")
    private int targetPlatinum;

    @Column(name = "target_silver")
    private int targetSilver;

    private String ym;

    private String divre;

    @Column(name = "jumlah_tiket_gold")
    private int jumlahTiketGold;

    @Column(name = "jumlah_tiket_platinum")
    private int jumlahTiketPlatinum;

    @Column(name = "jumlah_tiket_silver")
    private int jumlahTiketSilver;

    @Column(name = "pencapaian_gold")
    private int pencapaianGold;

    @Column(name = "pencapaian_platinum")
    private int pencapaianPlatinum;

    @Temporal(TemporalType.DATE)
    @Column(name = "last_update")
    private Date lastupdate;


    public TtwifiMttrProactiveKey() {
    }

    public int getPencapaianSilver() {
        return pencapaianSilver;
    }

    public void setPencapaianSilver(int pencapaianSilver) {
        this.pencapaianSilver = pencapaianSilver;
    }

    public int getRealisasiGold() {
        return realisasiGold;
    }

    public void setRealisasiGold(int realisasiGold) {
        this.realisasiGold = realisasiGold;
    }

    public int getRealisasiPlatinum() {
        return realisasiPlatinum;
    }

    public void setRealisasiPlatinum(int realisasiPlatinum) {
        this.realisasiPlatinum = realisasiPlatinum;
    }

    public int getRealisasiSilver() {
        return realisasiSilver;
    }

    public void setRealisasiSilver(int realisasiSilver) {
        this.realisasiSilver = realisasiSilver;
    }

    public int getTargetGold() {
        return targetGold;
    }

    public void setTargetGold(int targetGold) {
        this.targetGold = targetGold;
    }

    public int getTargetPlatinum() {
        return targetPlatinum;
    }

    public void setTargetPlatinum(int targetPlatinum) {
        this.targetPlatinum = targetPlatinum;
    }

    public int getTargetSilver() {
        return targetSilver;
    }

    public void setTargetSilver(int targetSilver) {
        this.targetSilver = targetSilver;
    }

    public String getYm() {
        return ym;
    }

    public void setYm(String ym) {
        this.ym = ym;
    }

    public String getDivre() {
        return divre;
    }

    public void setDivre(String divre) {
        this.divre = divre;
    }

    public int getJumlahTiketGold() {
        return jumlahTiketGold;
    }

    public void setJumlahTiketGold(int jumlahTiketGold) {
        this.jumlahTiketGold = jumlahTiketGold;
    }

    public int getJumlahTiketPlatinum() {
        return jumlahTiketPlatinum;
    }

    public void setJumlahTiketPlatinum(int jumlahTiketPlatinum) {
        this.jumlahTiketPlatinum = jumlahTiketPlatinum;
    }

    public int getJumlahTiketSilver() {
        return jumlahTiketSilver;
    }

    public void setJumlahTiketSilver(int jumlahTiketSilver) {
        this.jumlahTiketSilver = jumlahTiketSilver;
    }

    public int getPencapaianGold() {
        return pencapaianGold;
    }

    public void setPencapaianGold(int pencapaianGold) {
        this.pencapaianGold = pencapaianGold;
    }

    public int getPencapaianPlatinum() {
        return pencapaianPlatinum;
    }

    public void setPencapaianPlatinum(int pencapaianPlatinum) {
        this.pencapaianPlatinum = pencapaianPlatinum;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TtwifiMttrProactiveKey that = (TtwifiMttrProactiveKey) o;

        if (pencapaianSilver != that.pencapaianSilver) return false;
        if (realisasiGold != that.realisasiGold) return false;
        if (realisasiPlatinum != that.realisasiPlatinum) return false;
        if (realisasiSilver != that.realisasiSilver) return false;
        if (targetGold != that.targetGold) return false;
        if (targetPlatinum != that.targetPlatinum) return false;
        if (targetSilver != that.targetSilver) return false;
        if (lastupdate !=that.lastupdate) return false;
        return ym != null ? ym.equals(that.ym) : that.ym == null;
    }

    @Override
    public int hashCode() {
        int result = pencapaianSilver;
        result = 31 * result + realisasiGold;
        result = 31 * result + realisasiPlatinum;
        result = 31 * result + realisasiSilver;
        result = 31 * result + targetGold;
        result = 31 * result + targetPlatinum;
        result = 31 * result + targetSilver;
        result = 31 * result + (ym != null ? ym.hashCode() : 0);
        return result;
    }
}
