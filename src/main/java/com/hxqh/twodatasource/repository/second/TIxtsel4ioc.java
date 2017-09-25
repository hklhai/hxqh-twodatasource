package com.hxqh.twodatasource.repository.second;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_ixtsel_4ioc database table.
 */
@Entity
@Table(name = "v_ixtsel_4ioc")
public class TIxtsel4ioc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private Long id;

    private String agg;

    private double bitspersecondin;

    private double bitspersecondout;

    private int wrong;

    private String gate;

    private String iocinterface;

    private String node;

    private int operstatuspollable;

    private String ttc;

    @Temporal(TemporalType.TIMESTAMP)
    private Date timedata;


    public TIxtsel4ioc() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getTtc() {
        return ttc;
    }

    public void setTtc(String ttc) {
        this.ttc = ttc;
    }

    public Date getTimedata() {
        return timedata;
    }

    public void setTimedata(Date timedata) {
        this.timedata = timedata;
    }
}