package com.hxqh.twodatasource.repository.second;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the SIPETE_V_IS_TG_SS_DAILY database table.
 * SipeteVIsTgSsDailyRepository
 */
@Entity
@Table(name = "sipete_v_is_tg_ss_daily")
public class SipeteVIsTgSsDaily implements Serializable {

    @Id
    @Column(name = "Id")
    private Long id;

    @Column(name = "AICTRAF")
    private String aictraf;

    @Column(name = "AOGTRAF")
    private String aogtraf;

    @Column(name = "ATBN")
    private String atbn;

    @Column(name = "ATBS")
    private String atbs;

    @Column(name = "AVDATA")
    private String avdata;

    @Column(name = "BIDS")
    private String bids;

    @Column(name = "C7NUNSP")
    private String c7nunsp;

    @Column(name = "CCT")
    private String cct;

    @Column(name = "CCTBLOCK")
    private String cctblock;

    @Column(name = "CONGEST")
    private String congest;

    @Column(name = "`CONNECTION`")
    private String connection;

    @Column(name = "DEV")
    private String dev;

    @Column(name = "DPCLOADN")
    private String dpcloadn;

    @Column(name = "DPCLOADS")
    private String dpcloads;

    @Column(name = "EXTTCHIRR")
    private String exttchirr;

    @Column(name = "F_AREA")
    private String fArea;

    @Column(name = "F_SUB_AREA")
    private String fSubArea;

    @Column(name = "IANSW")
    private String iansw;

    @Column(name = "IASR")
    private String iasr;

    @Column(name = "ICMPDIAL")
    private String icmpdial;

    @Column(name = "ICMPDIALS")
    private String icmpdials;

    @Column(name = "ICRNA")
    private String icrna;

    @Column(name = "IICTRAF")
    private String iictraf;

    @Column(name = "INTTCHIRR")
    private String inttchirr;

    @Column(name = "IOGTRAF")
    private String iogtraf;

    @Column(name = "ISEIZ")
    private String iseiz;

    @Column(name = "ISEIZWACM")
    private String iseizwacm;

    @Column(name = "MHTS")
    private String mhts;

    @Column(name = "NMBLOCK")
    private String nmblock;

    @Column(name = "NODE")
    private String node;

    @Column(name = "NODIAL")
    private String nodial;

    @Column(name = "OANSW")
    private String oansw;

    @Column(name = "OASR")
    private String oasr;

    @Column(name = "OCC")
    private String occ;

    @Column(name = "OGLOST")
    private String oglost;

    @Column(name = "OGOFL")
    private String ogofl;

    @Column(name = "OGRNA")
    private String ogrna;

    @Column(name = "OPR")
    private String opr;

    @Column(name = "OSEIZ")
    private String oseiz;

    @Column(name = "OSEIZWACM")
    private String oseizwacm;

    @Column(name = "PCALLBLOCK")
    private String pcallblock;

    @Column(name = "PCTBLOCK")
    private String pctblock;

    @Column(name = "PEAK_INCOMING")
    private String peakIncoming;

    @Column(name = "PEAK_OUTGOING")
    private String peakOutgoing;

    @Column(name = "PEAK_TIME")
    private String peakTime;

    @Column(name = "PEAK_TRAF")
    private String peakTraf;

    @Column(name = "POCC")
    private String pocc;

    @Column(name = "POVERFLOW")
    private String poverflow;

    @Column(name = "SBUSY")
    private String sbusy;

    @Column(name = "SCH")
    private String sch;

    @Column(name = "SEGMEN")
    private String segmen;

    @Column(name = "SUB_OPR")
    private String subOpr;

    @Column(name = "SWLOST")
    private String swlost;

    @Column(name = "T_AREA")
    private String tArea;

    @Column(name = "T_SUB_AREA")
    private String tSubArea;

    @Column(name = "TANGGAL")
    private Date tanggal;

    @Column(name = "TO_XCH")
    private String toXch;

    @Column(name = "TRANS")
    private String trans;

    @Column(name = "UNALLNUMB")
    private String unallnumb;

    @Column(name = "UNREAS")
    private String unreas;

    @Column(name = "XCH")
    private String xch;

    @Column(name = "LAST_UPDATE")
    private Date lastupdate;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getfArea() {
        return fArea;
    }

    public void setfArea(String fArea) {
        this.fArea = fArea;
    }

    public String getfSubArea() {
        return fSubArea;
    }

    public void setfSubArea(String fSubArea) {
        this.fSubArea = fSubArea;
    }

    public String gettArea() {
        return tArea;
    }

    public void settArea(String tArea) {
        this.tArea = tArea;
    }

    public String gettSubArea() {
        return tSubArea;
    }

    public void settSubArea(String tSubArea) {
        this.tSubArea = tSubArea;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public String getAictraf() {
        return this.aictraf;
    }

    public void setAictraf(String aictraf) {
        this.aictraf = aictraf;
    }

    public String getAogtraf() {
        return this.aogtraf;
    }

    public void setAogtraf(String aogtraf) {
        this.aogtraf = aogtraf;
    }

    public String getAtbn() {
        return this.atbn;
    }

    public void setAtbn(String atbn) {
        this.atbn = atbn;
    }

    public String getAtbs() {
        return this.atbs;
    }

    public void setAtbs(String atbs) {
        this.atbs = atbs;
    }

    public String getAvdata() {
        return this.avdata;
    }

    public void setAvdata(String avdata) {
        this.avdata = avdata;
    }

    public String getBids() {
        return this.bids;
    }

    public void setBids(String bids) {
        this.bids = bids;
    }

    public String getC7nunsp() {
        return this.c7nunsp;
    }

    public void setC7nunsp(String c7nunsp) {
        this.c7nunsp = c7nunsp;
    }

    public String getCct() {
        return this.cct;
    }

    public void setCct(String cct) {
        this.cct = cct;
    }

    public String getCctblock() {
        return this.cctblock;
    }

    public void setCctblock(String cctblock) {
        this.cctblock = cctblock;
    }

    public String getCongest() {
        return this.congest;
    }

    public void setCongest(String congest) {
        this.congest = congest;
    }

    public String getConnection() {
        return this.connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public String getDev() {
        return this.dev;
    }

    public void setDev(String dev) {
        this.dev = dev;
    }

    public String getDpcloadn() {
        return this.dpcloadn;
    }

    public void setDpcloadn(String dpcloadn) {
        this.dpcloadn = dpcloadn;
    }

    public String getDpcloads() {
        return this.dpcloads;
    }

    public void setDpcloads(String dpcloads) {
        this.dpcloads = dpcloads;
    }

    public String getExttchirr() {
        return this.exttchirr;
    }

    public void setExttchirr(String exttchirr) {
        this.exttchirr = exttchirr;
    }

    public String getFArea() {
        return this.fArea;
    }

    public void setFArea(String fArea) {
        this.fArea = fArea;
    }

    public String getFSubArea() {
        return this.fSubArea;
    }

    public void setFSubArea(String fSubArea) {
        this.fSubArea = fSubArea;
    }

    public String getIansw() {
        return this.iansw;
    }

    public void setIansw(String iansw) {
        this.iansw = iansw;
    }

    public String getIasr() {
        return this.iasr;
    }

    public void setIasr(String iasr) {
        this.iasr = iasr;
    }

    public String getIcmpdial() {
        return this.icmpdial;
    }

    public void setIcmpdial(String icmpdial) {
        this.icmpdial = icmpdial;
    }

    public String getIcmpdials() {
        return this.icmpdials;
    }

    public void setIcmpdials(String icmpdials) {
        this.icmpdials = icmpdials;
    }

    public String getIcrna() {
        return this.icrna;
    }

    public void setIcrna(String icrna) {
        this.icrna = icrna;
    }

    public String getIictraf() {
        return this.iictraf;
    }

    public void setIictraf(String iictraf) {
        this.iictraf = iictraf;
    }

    public String getInttchirr() {
        return this.inttchirr;
    }

    public void setInttchirr(String inttchirr) {
        this.inttchirr = inttchirr;
    }

    public String getIogtraf() {
        return this.iogtraf;
    }

    public void setIogtraf(String iogtraf) {
        this.iogtraf = iogtraf;
    }

    public String getIseiz() {
        return this.iseiz;
    }

    public void setIseiz(String iseiz) {
        this.iseiz = iseiz;
    }

    public String getIseizwacm() {
        return this.iseizwacm;
    }

    public void setIseizwacm(String iseizwacm) {
        this.iseizwacm = iseizwacm;
    }

    public String getMhts() {
        return this.mhts;
    }

    public void setMhts(String mhts) {
        this.mhts = mhts;
    }

    public String getNmblock() {
        return this.nmblock;
    }

    public void setNmblock(String nmblock) {
        this.nmblock = nmblock;
    }

    public String getNode() {
        return this.node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public String getNodial() {
        return this.nodial;
    }

    public void setNodial(String nodial) {
        this.nodial = nodial;
    }

    public String getOansw() {
        return this.oansw;
    }

    public void setOansw(String oansw) {
        this.oansw = oansw;
    }

    public String getOasr() {
        return this.oasr;
    }

    public void setOasr(String oasr) {
        this.oasr = oasr;
    }

    public String getOcc() {
        return this.occ;
    }

    public void setOcc(String occ) {
        this.occ = occ;
    }

    public String getOglost() {
        return this.oglost;
    }

    public void setOglost(String oglost) {
        this.oglost = oglost;
    }

    public String getOgofl() {
        return this.ogofl;
    }

    public void setOgofl(String ogofl) {
        this.ogofl = ogofl;
    }

    public String getOgrna() {
        return this.ogrna;
    }

    public void setOgrna(String ogrna) {
        this.ogrna = ogrna;
    }

    public String getOpr() {
        return this.opr;
    }

    public void setOpr(String opr) {
        this.opr = opr;
    }

    public String getOseiz() {
        return this.oseiz;
    }

    public void setOseiz(String oseiz) {
        this.oseiz = oseiz;
    }

    public String getOseizwacm() {
        return this.oseizwacm;
    }

    public void setOseizwacm(String oseizwacm) {
        this.oseizwacm = oseizwacm;
    }

    public String getPcallblock() {
        return this.pcallblock;
    }

    public void setPcallblock(String pcallblock) {
        this.pcallblock = pcallblock;
    }

    public String getPctblock() {
        return this.pctblock;
    }

    public void setPctblock(String pctblock) {
        this.pctblock = pctblock;
    }

    public String getPeakIncoming() {
        return this.peakIncoming;
    }

    public void setPeakIncoming(String peakIncoming) {
        this.peakIncoming = peakIncoming;
    }

    public String getPeakOutgoing() {
        return this.peakOutgoing;
    }

    public void setPeakOutgoing(String peakOutgoing) {
        this.peakOutgoing = peakOutgoing;
    }

    public String getPeakTime() {
        return this.peakTime;
    }

    public void setPeakTime(String peakTime) {
        this.peakTime = peakTime;
    }

    public String getPeakTraf() {
        return this.peakTraf;
    }

    public void setPeakTraf(String peakTraf) {
        this.peakTraf = peakTraf;
    }

    public String getPocc() {
        return this.pocc;
    }

    public void setPocc(String pocc) {
        this.pocc = pocc;
    }

    public String getPoverflow() {
        return this.poverflow;
    }

    public void setPoverflow(String poverflow) {
        this.poverflow = poverflow;
    }

    public String getSbusy() {
        return this.sbusy;
    }

    public void setSbusy(String sbusy) {
        this.sbusy = sbusy;
    }

    public String getSch() {
        return this.sch;
    }

    public void setSch(String sch) {
        this.sch = sch;
    }

    public String getSegmen() {
        return this.segmen;
    }

    public void setSegmen(String segmen) {
        this.segmen = segmen;
    }

    public String getSubOpr() {
        return this.subOpr;
    }

    public void setSubOpr(String subOpr) {
        this.subOpr = subOpr;
    }

    public String getSwlost() {
        return this.swlost;
    }

    public void setSwlost(String swlost) {
        this.swlost = swlost;
    }

    public String getTArea() {
        return this.tArea;
    }

    public void setTArea(String tArea) {
        this.tArea = tArea;
    }

    public String getTSubArea() {
        return this.tSubArea;
    }

    public void setTSubArea(String tSubArea) {
        this.tSubArea = tSubArea;
    }


    public String getToXch() {
        return this.toXch;
    }

    public void setToXch(String toXch) {
        this.toXch = toXch;
    }

    public String getTrans() {
        return this.trans;
    }

    public void setTrans(String trans) {
        this.trans = trans;
    }

    public String getUnallnumb() {
        return this.unallnumb;
    }

    public void setUnallnumb(String unallnumb) {
        this.unallnumb = unallnumb;
    }

    public String getUnreas() {
        return this.unreas;
    }

    public void setUnreas(String unreas) {
        this.unreas = unreas;
    }

    public String getXch() {
        return this.xch;
    }

    public void setXch(String xch) {
        this.xch = xch;
    }

    public Date getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }


}