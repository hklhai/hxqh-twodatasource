package com.hxqh.twodatasource.repository.primary;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the TB_IOC_MOBILE_IP_TRANSIT database table.
 *
 *
 */
@Entity
@Table(name = "TB_IOC_MOBILE_IPTRANSIT_SOURCE")
public class TbIocMobileIpTransit implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "TB_IOC_MOBILE_IP_TRANSIT_TRANSITID_GENERATOR", sequenceName = "SEQ_TB_IOC_MOB_TRANSIT_SOURCE")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TB_IOC_MOBILE_IP_TRANSIT_TRANSITID_GENERATOR")
    @Column(name = "TRANSIT_ID")
    private long transitId;

    private String agg;

    private BigDecimal bitspersecondin;

    private BigDecimal bitspersecondout;

    private String gate;

    @Column(name = "INTER_FACE")
    private String interface_;

    private String node;

    private BigDecimal operstatuspollable;

    @Temporal(TemporalType.DATE)
    private Date timedata;
    @Temporal(TemporalType.DATE)
    private Date ts;

    private String ttc;

    private BigDecimal wrongs;

    private Long ipid;

    public TbIocMobileIpTransit() {
    }

    public Long getIpid() {
        return ipid;
    }

    public void setIpid(Long ipid) {
        this.ipid = ipid;
    }

    public long getTransitId() {
        return this.transitId;
    }

    public void setTransitId(long transitId) {
        this.transitId = transitId;
    }

    public String getAgg() {
        return this.agg;
    }

    public void setAgg(String agg) {
        this.agg = agg;
    }

    public BigDecimal getBitspersecondin() {
        return this.bitspersecondin;
    }

    public void setBitspersecondin(BigDecimal bitspersecondin) {
        this.bitspersecondin = bitspersecondin;
    }

    public BigDecimal getBitspersecondout() {
        return this.bitspersecondout;
    }

    public void setBitspersecondout(BigDecimal bitspersecondout) {
        this.bitspersecondout = bitspersecondout;
    }

    public String getGate() {
        return this.gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    public String getInterface_() {
        return this.interface_;
    }

    public void setInterface_(String interface_) {
        this.interface_ = interface_;
    }

    public String getNode() {
        return this.node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public BigDecimal getOperstatuspollable() {
        return this.operstatuspollable;
    }

    public void setOperstatuspollable(BigDecimal operstatuspollable) {
        this.operstatuspollable = operstatuspollable;
    }

    public Date getTimedata() {
        return this.timedata;
    }

    public void setTimedata(Date timedata) {
        this.timedata = timedata;
    }

    public Date getTs() {
        return this.ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    public String getTtc() {
        return this.ttc;
    }

    public void setTtc(String ttc) {
        this.ttc = ttc;
    }

    public BigDecimal getWrongs() {
        return this.wrongs;
    }

    public void setWrongs(BigDecimal wrongs) {
        this.wrongs = wrongs;
    }

}