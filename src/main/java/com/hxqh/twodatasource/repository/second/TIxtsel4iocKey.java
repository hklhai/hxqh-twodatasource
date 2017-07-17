package com.hxqh.twodatasource.repository.second;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the t_ixtsel_4ioc database table.
 */
@Embeddable
public class TIxtsel4iocKey implements Serializable {
    private static final long serialVersionUID = 1L;

    private String agg;

    private double bitspersecondin;

    private double bitspersecondout;

    private int wrong;

    private String gate;

    private String iocinterface;

    private String node;

    private int operstatuspollable;

    @Temporal(TemporalType.TIMESTAMP)
    private Date timedata;

    private String ttc;

    public TIxtsel4iocKey() {
    }

    public String getAgg() {
        return agg;
    }

    public void setAgg(String agg) {
        this.agg = agg;
    }

    public double getBitspersecondin() {
        return bitspersecondin;
    }

    public void setBitspersecondin(double bitspersecondin) {
        this.bitspersecondin = bitspersecondin;
    }

    public double getBitspersecondout() {
        return bitspersecondout;
    }

    public void setBitspersecondout(double bitspersecondout) {
        this.bitspersecondout = bitspersecondout;
    }

    public int getWrong() {
        return wrong;
    }

    public void setWrong(int wrong) {
        this.wrong = wrong;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    public String getIocinterface() {
        return iocinterface;
    }

    public void setIocinterface(String iocinterface) {
        this.iocinterface = iocinterface;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public int getOperstatuspollable() {
        return operstatuspollable;
    }

    public void setOperstatuspollable(int operstatuspollable) {
        this.operstatuspollable = operstatuspollable;
    }

    public Date getTimedata() {
        return timedata;
    }

    public void setTimedata(Date timedata) {
        this.timedata = timedata;
    }

    public String getTtc() {
        return ttc;
    }

    public void setTtc(String ttc) {
        this.ttc = ttc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TIxtsel4iocKey that = (TIxtsel4iocKey) o;

        if (Double.compare(that.bitspersecondin, bitspersecondin) != 0) return false;
        if (Double.compare(that.bitspersecondout, bitspersecondout) != 0) return false;
        if (wrong != that.wrong) return false;
        if (operstatuspollable != that.operstatuspollable) return false;
        if (agg != null ? !agg.equals(that.agg) : that.agg != null) return false;
        if (gate != null ? !gate.equals(that.gate) : that.gate != null) return false;
        if (iocinterface != null ? !iocinterface.equals(that.iocinterface) : that.iocinterface != null) return false;
        if (node != null ? !node.equals(that.node) : that.node != null) return false;
        if (timedata != null ? !timedata.equals(that.timedata) : that.timedata != null) return false;
        return ttc != null ? ttc.equals(that.ttc) : that.ttc == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = agg != null ? agg.hashCode() : 0;
        temp = Double.doubleToLongBits(bitspersecondin);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(bitspersecondout);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + wrong;
        result = 31 * result + (gate != null ? gate.hashCode() : 0);
        result = 31 * result + (iocinterface != null ? iocinterface.hashCode() : 0);
        result = 31 * result + (node != null ? node.hashCode() : 0);
        result = 31 * result + operstatuspollable;
        result = 31 * result + (timedata != null ? timedata.hashCode() : 0);
        result = 31 * result + (ttc != null ? ttc.hashCode() : 0);
        return result;
    }
}