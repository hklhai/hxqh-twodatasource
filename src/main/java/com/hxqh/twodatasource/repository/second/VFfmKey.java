package com.hxqh.twodatasource.repository.second;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by Ocean lin on 2017/7/18.
 */
@Embeddable
public class VFfmKey implements Serializable {

    private String jumlah;

    private String keterangan;

    public VFfmKey() {
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

        VFfmKey vFfmKey = (VFfmKey) o;

        if (jumlah != null ? !jumlah.equals(vFfmKey.jumlah) : vFfmKey.jumlah != null) return false;
        return keterangan != null ? keterangan.equals(vFfmKey.keterangan) : vFfmKey.keterangan == null;
    }

    @Override
    public int hashCode() {
        int result = jumlah != null ? jumlah.hashCode() : 0;
        result = 31 * result + (keterangan != null ? keterangan.hashCode() : 0);
        return result;
    }
}
