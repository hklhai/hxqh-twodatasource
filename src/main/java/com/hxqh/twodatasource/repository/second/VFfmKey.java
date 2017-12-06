package com.hxqh.twodatasource.repository.second;

import javax.persistence.Embeddable;
import java.io.Serializable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
/**
 * Created by Ocean lin on 2017/7/18.
 */
@Embeddable
public class VFfmKey implements Serializable {

    private String jumlah;

    private String keterangan;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastupdate;

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
