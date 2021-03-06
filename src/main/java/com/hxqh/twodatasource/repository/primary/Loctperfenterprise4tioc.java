package com.hxqh.twodatasource.repository.primary;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the TB_IOCTPERFENTERPRISE4TIOC database table.
 */
@Entity
@Table(name = "TB_IOC_ENT_4TIOC")
@NamedStoredProcedureQueries({@NamedStoredProcedureQuery(name = "analysis_source_ent_4tioc1", procedureName = "analysis_source_ent_4tioc1")})
public class Loctperfenterprise4tioc implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "CUST_NAME")
    private String custName;

    private String custtype;

    @Column(name = "E_RSI_BITSPERSECONDIN")
    private BigDecimal eRsiBitspersecondin;

    @Column(name = "E_RSI_BITSPERSECONDOUT")
    private BigDecimal eRsiBitspersecondout;

    @Column(name = "E_RSI_TIMEDATA")
    private String eRsiTimedata;

    @Column(name = "E_RSI_UTILIZATION")
    private BigDecimal eRsiUtilization;

    @Column(name = "FAR_END")
    private String farEnd;

    private String funct;

    @Column(name = "GRP_CUST")
    private String grpCust;

    private Date adddate;

    @Id
    @SequenceGenerator(name = "TB_IOCTPERFENTERPRISE4TIOC_IOCTPERFENTERPRISEID_GENERATOR", sequenceName = "SEQ_TB_IOCTPERFENTERPRISE4TIOC")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TB_IOCTPERFENTERPRISE4TIOC_IOCTPERFENTERPRISEID_GENERATOR")
    private BigDecimal ioctperfenterpriseid;

    private String n1sap;

    private String node;

    @Column(name = "SERV_LAY")
    private String servLay;

    private String subint;

    private String treg;

    private BigDecimal mysqlid;

    public Loctperfenterprise4tioc() {
    }

    public BigDecimal getMysqlid() {
        return mysqlid;
    }

    public void setMysqlid(BigDecimal mysqlid) {
        this.mysqlid = mysqlid;
    }

    public BigDecimal geteRsiBitspersecondin() {
        return eRsiBitspersecondin;
    }

    public void seteRsiBitspersecondin(BigDecimal eRsiBitspersecondin) {
        this.eRsiBitspersecondin = eRsiBitspersecondin;
    }

    public BigDecimal geteRsiBitspersecondout() {
        return eRsiBitspersecondout;
    }

    public void seteRsiBitspersecondout(BigDecimal eRsiBitspersecondout) {
        this.eRsiBitspersecondout = eRsiBitspersecondout;
    }

    public String geteRsiTimedata() {
        return eRsiTimedata;
    }

    public void seteRsiTimedata(String eRsiTimedata) {
        this.eRsiTimedata = eRsiTimedata;
    }

    public BigDecimal geteRsiUtilization() {
        return eRsiUtilization;
    }

    public void seteRsiUtilization(BigDecimal eRsiUtilization) {
        this.eRsiUtilization = eRsiUtilization;
    }

    public Date getAdddate() {
        return adddate;
    }

    public void setAdddate(Date adddate) {
        this.adddate = adddate;
    }

    public String getCustName() {
        return this.custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCusttype() {
        return this.custtype;
    }

    public void setCusttype(String custtype) {
        this.custtype = custtype;
    }

    public BigDecimal getERsiBitspersecondin() {
        return this.eRsiBitspersecondin;
    }

    public void setERsiBitspersecondin(BigDecimal eRsiBitspersecondin) {
        this.eRsiBitspersecondin = eRsiBitspersecondin;
    }

    public BigDecimal getERsiBitspersecondout() {
        return this.eRsiBitspersecondout;
    }

    public void setERsiBitspersecondout(BigDecimal eRsiBitspersecondout) {
        this.eRsiBitspersecondout = eRsiBitspersecondout;
    }

    public String getERsiTimedata() {
        return this.eRsiTimedata;
    }

    public void setERsiTimedata(String eRsiTimedata) {
        this.eRsiTimedata = eRsiTimedata;
    }

    public BigDecimal getERsiUtilization() {
        return this.eRsiUtilization;
    }

    public void setERsiUtilization(BigDecimal eRsiUtilization) {
        this.eRsiUtilization = eRsiUtilization;
    }

    public String getFarEnd() {
        return this.farEnd;
    }

    public void setFarEnd(String farEnd) {
        this.farEnd = farEnd;
    }

    public String getFunct() {
        return this.funct;
    }

    public void setFunct(String funct) {
        this.funct = funct;
    }

    public String getGrpCust() {
        return this.grpCust;
    }

    public void setGrpCust(String grpCust) {
        this.grpCust = grpCust;
    }

    public BigDecimal getIoctperfenterpriseid() {
        return this.ioctperfenterpriseid;
    }

    public void setIoctperfenterpriseid(BigDecimal ioctperfenterpriseid) {
        this.ioctperfenterpriseid = ioctperfenterpriseid;
    }

    public String getN1sap() {
        return this.n1sap;
    }

    public void setN1sap(String n1sap) {
        this.n1sap = n1sap;
    }

    public String getNode() {
        return this.node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public String getServLay() {
        return this.servLay;
    }

    public void setServLay(String servLay) {
        this.servLay = servLay;
    }

    public String getSubint() {
        return this.subint;
    }

    public void setSubint(String subint) {
        this.subint = subint;
    }

    public String getTreg() {
        return this.treg;
    }

    public void setTreg(String treg) {
        this.treg = treg;
    }

}