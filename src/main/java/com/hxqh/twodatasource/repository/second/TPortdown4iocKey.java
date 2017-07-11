package com.hxqh.twodatasource.repository.second;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Ocean lin on 2017/7/11.
 */
@Embeddable
public class TPortdown4iocKey implements Serializable {
    private String agg;

    private String descp;

    @Column(name="interface")
    private String interface_;

    private String nbr;

    @Column(name="node_ip")
    private String nodeIp;

    private String operstatus;

    private String ruas;

    @Temporal(TemporalType.TIMESTAMP)
    private Date timedata;

    private String timemesin;

    public TPortdown4iocKey() {
    }

    public String getAgg() {
        return this.agg;
    }

    public void setAgg(String agg) {
        this.agg = agg;
    }

    public String getDescp() {
        return this.descp;
    }

    public void setDescp(String descp) {
        this.descp = descp;
    }

    public String getInterface_() {
        return this.interface_;
    }

    public void setInterface_(String interface_) {
        this.interface_ = interface_;
    }

    public String getNbr() {
        return this.nbr;
    }

    public void setNbr(String nbr) {
        this.nbr = nbr;
    }

    public String getNodeIp() {
        return this.nodeIp;
    }

    public void setNodeIp(String nodeIp) {
        this.nodeIp = nodeIp;
    }

    public String getOperstatus() {
        return this.operstatus;
    }

    public void setOperstatus(String operstatus) {
        this.operstatus = operstatus;
    }

    public String getRuas() {
        return this.ruas;
    }

    public void setRuas(String ruas) {
        this.ruas = ruas;
    }

    public Date getTimedata() {
        return this.timedata;
    }

    public void setTimedata(Date timedata) {
        this.timedata = timedata;
    }

    public String getTimemesin() {
        return this.timemesin;
    }

    public void setTimemesin(String timemesin) {
        this.timemesin = timemesin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TPortdown4iocKey that = (TPortdown4iocKey) o;

        if (agg != null ? !agg.equals(that.agg) : that.agg != null) return false;
        if (descp != null ? !descp.equals(that.descp) : that.descp != null) return false;
        if (interface_ != null ? !interface_.equals(that.interface_) : that.interface_ != null) return false;
        if (nbr != null ? !nbr.equals(that.nbr) : that.nbr != null) return false;
        if (nodeIp != null ? !nodeIp.equals(that.nodeIp) : that.nodeIp != null) return false;
        if (operstatus != null ? !operstatus.equals(that.operstatus) : that.operstatus != null) return false;
        if (ruas != null ? !ruas.equals(that.ruas) : that.ruas != null) return false;
        if (timedata != null ? !timedata.equals(that.timedata) : that.timedata != null) return false;
        return timemesin != null ? timemesin.equals(that.timemesin) : that.timemesin == null;
    }

    @Override
    public int hashCode() {
        int result = agg != null ? agg.hashCode() : 0;
        result = 31 * result + (descp != null ? descp.hashCode() : 0);
        result = 31 * result + (interface_ != null ? interface_.hashCode() : 0);
        result = 31 * result + (nbr != null ? nbr.hashCode() : 0);
        result = 31 * result + (nodeIp != null ? nodeIp.hashCode() : 0);
        result = 31 * result + (operstatus != null ? operstatus.hashCode() : 0);
        result = 31 * result + (ruas != null ? ruas.hashCode() : 0);
        result = 31 * result + (timedata != null ? timedata.hashCode() : 0);
        result = 31 * result + (timemesin != null ? timemesin.hashCode() : 0);
        return result;
    }
}
