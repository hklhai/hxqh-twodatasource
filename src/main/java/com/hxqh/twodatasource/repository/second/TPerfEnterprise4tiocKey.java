package com.hxqh.twodatasource.repository.second;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by Ocean lin on 2017/7/11.
 */
@Embeddable
public class TPerfEnterprise4tiocKey implements Serializable {


    @Column(name="cust_name")
    private String custName;

    private String custType;

    private double e_rsi_BitsPerSecondIn;

    private double e_rsi_BitsPerSecondOut;

    @Column(name="e_rsi_timedata")
    private String eRsiTimedata;

    private double e_rsi_Utilization;

    @Column(name="far_end")
    private String farEnd;

    private String funct;

    @Column(name="grp_cust")
    private String grpCust;

    private String n1sap;

    private String node;

    @Column(name="serv_lay")
    private String servLay;

    private String subint;

    private String treg;

    public TPerfEnterprise4tiocKey() {
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustType() {
        return custType;
    }

    public void setCustType(String custType) {
        this.custType = custType;
    }

    public double getE_rsi_BitsPerSecondIn() {
        return e_rsi_BitsPerSecondIn;
    }

    public void setE_rsi_BitsPerSecondIn(double e_rsi_BitsPerSecondIn) {
        this.e_rsi_BitsPerSecondIn = e_rsi_BitsPerSecondIn;
    }

    public double getE_rsi_BitsPerSecondOut() {
        return e_rsi_BitsPerSecondOut;
    }

    public void setE_rsi_BitsPerSecondOut(double e_rsi_BitsPerSecondOut) {
        this.e_rsi_BitsPerSecondOut = e_rsi_BitsPerSecondOut;
    }

    public String geteRsiTimedata() {
        return eRsiTimedata;
    }

    public void seteRsiTimedata(String eRsiTimedata) {
        this.eRsiTimedata = eRsiTimedata;
    }

    public double getE_rsi_Utilization() {
        return e_rsi_Utilization;
    }

    public void setE_rsi_Utilization(double e_rsi_Utilization) {
        this.e_rsi_Utilization = e_rsi_Utilization;
    }

    public String getFarEnd() {
        return farEnd;
    }

    public void setFarEnd(String farEnd) {
        this.farEnd = farEnd;
    }

    public String getFunct() {
        return funct;
    }

    public void setFunct(String funct) {
        this.funct = funct;
    }

    public String getGrpCust() {
        return grpCust;
    }

    public void setGrpCust(String grpCust) {
        this.grpCust = grpCust;
    }

    public String getN1sap() {
        return n1sap;
    }

    public void setN1sap(String n1sap) {
        this.n1sap = n1sap;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public String getServLay() {
        return servLay;
    }

    public void setServLay(String servLay) {
        this.servLay = servLay;
    }

    public String getSubint() {
        return subint;
    }

    public void setSubint(String subint) {
        this.subint = subint;
    }

    public String getTreg() {
        return treg;
    }

    public void setTreg(String treg) {
        this.treg = treg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TPerfEnterprise4tiocKey that = (TPerfEnterprise4tiocKey) o;

        if (Double.compare(that.e_rsi_BitsPerSecondIn, e_rsi_BitsPerSecondIn) != 0) return false;
        if (Double.compare(that.e_rsi_BitsPerSecondOut, e_rsi_BitsPerSecondOut) != 0) return false;
        if (Double.compare(that.e_rsi_Utilization, e_rsi_Utilization) != 0) return false;
        if (custName != null ? !custName.equals(that.custName) : that.custName != null) return false;
        if (custType != null ? !custType.equals(that.custType) : that.custType != null) return false;
        if (eRsiTimedata != null ? !eRsiTimedata.equals(that.eRsiTimedata) : that.eRsiTimedata != null) return false;
        if (farEnd != null ? !farEnd.equals(that.farEnd) : that.farEnd != null) return false;
        if (funct != null ? !funct.equals(that.funct) : that.funct != null) return false;
        if (grpCust != null ? !grpCust.equals(that.grpCust) : that.grpCust != null) return false;
        if (n1sap != null ? !n1sap.equals(that.n1sap) : that.n1sap != null) return false;
        if (node != null ? !node.equals(that.node) : that.node != null) return false;
        if (servLay != null ? !servLay.equals(that.servLay) : that.servLay != null) return false;
        if (subint != null ? !subint.equals(that.subint) : that.subint != null) return false;
        return treg != null ? treg.equals(that.treg) : that.treg == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = custName != null ? custName.hashCode() : 0;
        result = 31 * result + (custType != null ? custType.hashCode() : 0);
        temp = Double.doubleToLongBits(e_rsi_BitsPerSecondIn);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(e_rsi_BitsPerSecondOut);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (eRsiTimedata != null ? eRsiTimedata.hashCode() : 0);
        temp = Double.doubleToLongBits(e_rsi_Utilization);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (farEnd != null ? farEnd.hashCode() : 0);
        result = 31 * result + (funct != null ? funct.hashCode() : 0);
        result = 31 * result + (grpCust != null ? grpCust.hashCode() : 0);
        result = 31 * result + (n1sap != null ? n1sap.hashCode() : 0);
        result = 31 * result + (node != null ? node.hashCode() : 0);
        result = 31 * result + (servLay != null ? servLay.hashCode() : 0);
        result = 31 * result + (subint != null ? subint.hashCode() : 0);
        result = 31 * result + (treg != null ? treg.hashCode() : 0);
        return result;
    }
}
