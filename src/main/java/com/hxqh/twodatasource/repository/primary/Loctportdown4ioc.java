package com.hxqh.twodatasource.repository.primary;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the TB_IOCTPORTDOWN4IOC database table.
 */
@Entity
@Table(name = "TB_IOCTPORTDOWN4IOC")
@NamedStoredProcedureQueries({@NamedStoredProcedureQuery(name = "analysis_source_portdown", procedureName = "analysis_source_portdown")})
public class Loctportdown4ioc implements Serializable {
    private static final long serialVersionUID = 1L;

    private String agg;

    private String descp;

    @Id
    @SequenceGenerator(name = "TB_IOCTPORTDOWN4IOC_IOCTPORTDOWN4IOCID_GENERATOR", sequenceName = "SEQ_TB_IOCTPORTDOWN4IOC")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TB_IOCTPORTDOWN4IOC_IOCTPORTDOWN4IOCID_GENERATOR")
    private BigDecimal ioctportdown4iocid;

    private String nbr;

    @Column(name = "NODE_IP")
    private String nodeIp;

    private String iocinterface;

    private String operstatus;

    private String ruas;

    @Temporal(TemporalType.DATE)
    private Date timedata;

    private String timemesin;

    private Date adddate;

    public Loctportdown4ioc() {
    }

    public Date getAdddate() {
        return adddate;
    }

    public void setAdddate(Date adddate) {
        this.adddate = adddate;
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

    public BigDecimal getIoctportdown4iocid() {
        return this.ioctportdown4iocid;
    }

    public void setIoctportdown4iocid(BigDecimal ioctportdown4iocid) {
        this.ioctportdown4iocid = ioctportdown4iocid;
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

    public String getIocinterface() {
        return iocinterface;
    }

    public void setIocinterface(String iocinterface) {
        this.iocinterface = iocinterface;
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

}