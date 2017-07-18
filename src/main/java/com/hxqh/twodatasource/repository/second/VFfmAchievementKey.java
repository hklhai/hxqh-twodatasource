package com.hxqh.twodatasource.repository.second;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by Ocean lin on 2017/7/18.
 */
@Embeddable
public class VFfmAchievementKey implements Serializable {

    private String hari;

    private String jam;

    private String jumlah;

    private String keterangan;


    public String getHari() {
        return this.hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public String getJam() {
        return this.jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public String getJumlah() {
        return this.jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    public String getKeterangan() {
        return this.keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VFfmAchievementKey that = (VFfmAchievementKey) o;

        if (hari != null ? !hari.equals(that.hari) : that.hari != null) return false;
        if (jam != null ? !jam.equals(that.jam) : that.jam != null) return false;
        if (jumlah != null ? !jumlah.equals(that.jumlah) : that.jumlah != null) return false;
        return keterangan != null ? keterangan.equals(that.keterangan) : that.keterangan == null;
    }

    @Override
    public int hashCode() {
        int result = hari != null ? hari.hashCode() : 0;
        result = 31 * result + (jam != null ? jam.hashCode() : 0);
        result = 31 * result + (jumlah != null ? jumlah.hashCode() : 0);
        result = 31 * result + (keterangan != null ? keterangan.hashCode() : 0);
        return result;
    }
}
