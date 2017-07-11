package com.hxqh.twodatasource.repository.second;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


/**
 * The persistent class for the ttwifi_mttr_proactive_last_month database table.
 */
@Entity
@Table(name = "ttwifi_mttr_proactive_last_month")
public class TtwifiMttrProactiveLastMonth implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private TtwifiMttrProactiveKey ttwifiMttrProactiveKey;

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


    public TtwifiMttrProactiveLastMonth() {
    }

    public TtwifiMttrProactiveKey getTtwifiMttrProactiveKey() {
        return ttwifiMttrProactiveKey;
    }

    public void setTtwifiMttrProactiveKey(TtwifiMttrProactiveKey ttwifiMttrProactiveKey) {
        this.ttwifiMttrProactiveKey = ttwifiMttrProactiveKey;
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
}