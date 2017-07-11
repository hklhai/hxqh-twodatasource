package com.hxqh.twodatasource.repository.second;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by Ocean lin on 2017/7/11.
 */
@Embeddable
public class TStoKoordinatKey implements Serializable {

    private String funct;

    private String ipadd;

    private double lat;

    @Column(name = "long")
    private double long_;

    private String manufacture;

    @Column(name = "node_id")
    private String nodeId;

    private String sto;

    private String treg;

    public TStoKoordinatKey() {
    }

    public String getFunct() {
        return this.funct;
    }

    public void setFunct(String funct) {
        this.funct = funct;
    }

    public String getIpadd() {
        return this.ipadd;
    }

    public void setIpadd(String ipadd) {
        this.ipadd = ipadd;
    }

    public double getLat() {
        return this.lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLong_() {
        return this.long_;
    }

    public void setLong_(double long_) {
        this.long_ = long_;
    }

    public String getManufacture() {
        return this.manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getNodeId() {
        return this.nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getSto() {
        return this.sto;
    }

    public void setSto(String sto) {
        this.sto = sto;
    }

    public String getTreg() {
        return this.treg;
    }

    public void setTreg(String treg) {
        this.treg = treg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TStoKoordinatKey that = (TStoKoordinatKey) o;

        if (Double.compare(that.lat, lat) != 0) return false;
        if (Double.compare(that.long_, long_) != 0) return false;
        if (funct != null ? !funct.equals(that.funct) : that.funct != null) return false;
        if (ipadd != null ? !ipadd.equals(that.ipadd) : that.ipadd != null) return false;
        if (manufacture != null ? !manufacture.equals(that.manufacture) : that.manufacture != null) return false;
        if (nodeId != null ? !nodeId.equals(that.nodeId) : that.nodeId != null) return false;
        if (sto != null ? !sto.equals(that.sto) : that.sto != null) return false;
        return treg != null ? treg.equals(that.treg) : that.treg == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = funct != null ? funct.hashCode() : 0;
        result = 31 * result + (ipadd != null ? ipadd.hashCode() : 0);
        temp = Double.doubleToLongBits(lat);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(long_);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (manufacture != null ? manufacture.hashCode() : 0);
        result = 31 * result + (nodeId != null ? nodeId.hashCode() : 0);
        result = 31 * result + (sto != null ? sto.hashCode() : 0);
        result = 31 * result + (treg != null ? treg.hashCode() : 0);
        return result;
    }
}
