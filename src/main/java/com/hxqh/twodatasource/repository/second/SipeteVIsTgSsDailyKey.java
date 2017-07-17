package com.hxqh.twodatasource.repository.second;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the SIPETE_V_IS_TG_SS_DAILY database table.
 * 
 */
@Embeddable
public class SipeteVIsTgSsDailyKey implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="AICTRAF")
	private String aictraf;

	@Column(name="AOGTRAF")
	private String aogtraf;

	@Column(name="ATBN")
	private String atbn;

	@Column(name="ATBS")
	private String atbs;

	@Column(name="AVDATA")
	private String avdata;

	@Column(name="BIDS")
	private String bids;

	@Column(name="C7NUNSP")
	private String c7nunsp;

	@Column(name="CCT")
	private String cct;

	@Column(name="CCTBLOCK")
	private String cctblock;

	@Column(name="CONGEST")
	private String congest;

	@Column(name="`CONNECTION`")
	private String connection;

	@Column(name="DEV")
	private String dev;

	@Column(name="DPCLOADN")
	private String dpcloadn;

	@Column(name="DPCLOADS")
	private String dpcloads;

	@Column(name="EXTTCHIRR")
	private String exttchirr;

	@Column(name="F_AREA")
	private String fArea;

	@Column(name="F_SUB_AREA")
	private String fSubArea;

	@Column(name="IANSW")
	private String iansw;

	@Column(name="IASR")
	private String iasr;

	@Column(name="ICMPDIAL")
	private String icmpdial;

	@Column(name="ICMPDIALS")
	private String icmpdials;

	@Column(name="ICRNA")
	private String icrna;

	@Column(name="IICTRAF")
	private String iictraf;

	@Column(name="INTTCHIRR")
	private String inttchirr;

	@Column(name="IOGTRAF")
	private String iogtraf;

	@Column(name="ISEIZ")
	private String iseiz;

	@Column(name="ISEIZWACM")
	private String iseizwacm;

	@Column(name="MHTS")
	private String mhts;

	@Column(name="NMBLOCK")
	private String nmblock;

	@Column(name="NODE")
	private String node;

	@Column(name="NODIAL")
	private String nodial;

	@Column(name="OANSW")
	private String oansw;

	@Column(name="OASR")
	private String oasr;

	@Column(name="OCC")
	private String occ;

	@Column(name="OGLOST")
	private String oglost;

	@Column(name="OGOFL")
	private String ogofl;

	@Column(name="OGRNA")
	private String ogrna;

	@Column(name="OPR")
	private String opr;

	@Column(name="OSEIZ")
	private String oseiz;

	@Column(name="OSEIZWACM")
	private String oseizwacm;

	@Column(name="PCALLBLOCK")
	private String pcallblock;

	@Column(name="PCTBLOCK")
	private String pctblock;

	@Column(name="PEAK_INCOMING")
	private String peakIncoming;

	@Column(name="PEAK_OUTGOING")
	private String peakOutgoing;

	@Column(name="PEAK_TIME")
	private String peakTime;

	@Column(name="PEAK_TRAF")
	private String peakTraf;

	@Column(name="POCC")
	private String pocc;

	@Column(name="POVERFLOW")
	private String poverflow;

	@Column(name="SBUSY")
	private String sbusy;

	@Column(name="SCH")
	private String sch;

	@Column(name="SEGMEN")
	private String segmen;

	@Column(name="SUB_OPR")
	private String subOpr;

	@Column(name="SWLOST")
	private String swlost;

	@Column(name="T_AREA")
	private String tArea;

	@Column(name="T_SUB_AREA")
	private String tSubArea;

	@Column(name="TANGGAL")
	private String tanggal;

	@Column(name="TO_XCH")
	private String toXch;

	@Column(name="TRANS")
	private String trans;

	@Column(name="UNALLNUMB")
	private String unallnumb;

	@Column(name="UNREAS")
	private String unreas;

	@Column(name="XCH")
	private String xch;

	public SipeteVIsTgSsDailyKey() {
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

	public String getTanggal() {
		return this.tanggal;
	}

	public void setTanggal(String tanggal) {
		this.tanggal = tanggal;
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

	public boolean equals(Object object) {
		if (this == object) return true;
		if (object == null || getClass() != object.getClass()) return false;
		if (!super.equals(object)) return false;

		SipeteVIsTgSsDailyKey that = (SipeteVIsTgSsDailyKey) object;

		if (aictraf != null ? !aictraf.equals(that.aictraf) : that.aictraf != null) return false;
		if (aogtraf != null ? !aogtraf.equals(that.aogtraf) : that.aogtraf != null) return false;
		if (atbn != null ? !atbn.equals(that.atbn) : that.atbn != null) return false;
		if (atbs != null ? !atbs.equals(that.atbs) : that.atbs != null) return false;
		if (avdata != null ? !avdata.equals(that.avdata) : that.avdata != null) return false;
		if (bids != null ? !bids.equals(that.bids) : that.bids != null) return false;
		if (c7nunsp != null ? !c7nunsp.equals(that.c7nunsp) : that.c7nunsp != null) return false;
		if (cct != null ? !cct.equals(that.cct) : that.cct != null) return false;
		if (cctblock != null ? !cctblock.equals(that.cctblock) : that.cctblock != null) return false;
		if (congest != null ? !congest.equals(that.congest) : that.congest != null) return false;
		if (connection != null ? !connection.equals(that.connection) : that.connection != null) return false;
		if (dev != null ? !dev.equals(that.dev) : that.dev != null) return false;
		if (dpcloadn != null ? !dpcloadn.equals(that.dpcloadn) : that.dpcloadn != null) return false;
		if (dpcloads != null ? !dpcloads.equals(that.dpcloads) : that.dpcloads != null) return false;
		if (exttchirr != null ? !exttchirr.equals(that.exttchirr) : that.exttchirr != null) return false;
		if (fArea != null ? !fArea.equals(that.fArea) : that.fArea != null) return false;
		if (fSubArea != null ? !fSubArea.equals(that.fSubArea) : that.fSubArea != null) return false;
		if (iansw != null ? !iansw.equals(that.iansw) : that.iansw != null) return false;
		if (iasr != null ? !iasr.equals(that.iasr) : that.iasr != null) return false;
		if (icmpdial != null ? !icmpdial.equals(that.icmpdial) : that.icmpdial != null) return false;
		if (icmpdials != null ? !icmpdials.equals(that.icmpdials) : that.icmpdials != null) return false;
		if (icrna != null ? !icrna.equals(that.icrna) : that.icrna != null) return false;
		if (iictraf != null ? !iictraf.equals(that.iictraf) : that.iictraf != null) return false;
		if (inttchirr != null ? !inttchirr.equals(that.inttchirr) : that.inttchirr != null) return false;
		if (iogtraf != null ? !iogtraf.equals(that.iogtraf) : that.iogtraf != null) return false;
		if (iseiz != null ? !iseiz.equals(that.iseiz) : that.iseiz != null) return false;
		if (iseizwacm != null ? !iseizwacm.equals(that.iseizwacm) : that.iseizwacm != null) return false;
		if (mhts != null ? !mhts.equals(that.mhts) : that.mhts != null) return false;
		if (nmblock != null ? !nmblock.equals(that.nmblock) : that.nmblock != null) return false;
		if (node != null ? !node.equals(that.node) : that.node != null) return false;
		if (nodial != null ? !nodial.equals(that.nodial) : that.nodial != null) return false;
		if (oansw != null ? !oansw.equals(that.oansw) : that.oansw != null) return false;
		if (oasr != null ? !oasr.equals(that.oasr) : that.oasr != null) return false;
		if (occ != null ? !occ.equals(that.occ) : that.occ != null) return false;
		if (oglost != null ? !oglost.equals(that.oglost) : that.oglost != null) return false;
		if (ogofl != null ? !ogofl.equals(that.ogofl) : that.ogofl != null) return false;
		if (ogrna != null ? !ogrna.equals(that.ogrna) : that.ogrna != null) return false;
		if (opr != null ? !opr.equals(that.opr) : that.opr != null) return false;
		if (oseiz != null ? !oseiz.equals(that.oseiz) : that.oseiz != null) return false;
		if (oseizwacm != null ? !oseizwacm.equals(that.oseizwacm) : that.oseizwacm != null) return false;
		if (pcallblock != null ? !pcallblock.equals(that.pcallblock) : that.pcallblock != null) return false;
		if (pctblock != null ? !pctblock.equals(that.pctblock) : that.pctblock != null) return false;
		if (peakIncoming != null ? !peakIncoming.equals(that.peakIncoming) : that.peakIncoming != null) return false;
		if (peakOutgoing != null ? !peakOutgoing.equals(that.peakOutgoing) : that.peakOutgoing != null) return false;
		if (peakTime != null ? !peakTime.equals(that.peakTime) : that.peakTime != null) return false;
		if (peakTraf != null ? !peakTraf.equals(that.peakTraf) : that.peakTraf != null) return false;
		if (pocc != null ? !pocc.equals(that.pocc) : that.pocc != null) return false;
		if (poverflow != null ? !poverflow.equals(that.poverflow) : that.poverflow != null) return false;
		if (sbusy != null ? !sbusy.equals(that.sbusy) : that.sbusy != null) return false;
		if (sch != null ? !sch.equals(that.sch) : that.sch != null) return false;
		if (segmen != null ? !segmen.equals(that.segmen) : that.segmen != null) return false;
		if (subOpr != null ? !subOpr.equals(that.subOpr) : that.subOpr != null) return false;
		if (swlost != null ? !swlost.equals(that.swlost) : that.swlost != null) return false;
		if (tArea != null ? !tArea.equals(that.tArea) : that.tArea != null) return false;
		if (tSubArea != null ? !tSubArea.equals(that.tSubArea) : that.tSubArea != null) return false;
		if (tanggal != null ? !tanggal.equals(that.tanggal) : that.tanggal != null) return false;
		if (toXch != null ? !toXch.equals(that.toXch) : that.toXch != null) return false;
		if (trans != null ? !trans.equals(that.trans) : that.trans != null) return false;
		if (unallnumb != null ? !unallnumb.equals(that.unallnumb) : that.unallnumb != null) return false;
		if (unreas != null ? !unreas.equals(that.unreas) : that.unreas != null) return false;
		if (xch != null ? !xch.equals(that.xch) : that.xch != null) return false;

		return true;
	}

	public int hashCode() {
		int result = super.hashCode();
		result = 31 * result + (aictraf != null ? aictraf.hashCode() : 0);
		result = 31 * result + (aogtraf != null ? aogtraf.hashCode() : 0);
		result = 31 * result + (atbn != null ? atbn.hashCode() : 0);
		result = 31 * result + (atbs != null ? atbs.hashCode() : 0);
		result = 31 * result + (avdata != null ? avdata.hashCode() : 0);
		result = 31 * result + (bids != null ? bids.hashCode() : 0);
		result = 31 * result + (c7nunsp != null ? c7nunsp.hashCode() : 0);
		result = 31 * result + (cct != null ? cct.hashCode() : 0);
		result = 31 * result + (cctblock != null ? cctblock.hashCode() : 0);
		result = 31 * result + (congest != null ? congest.hashCode() : 0);
		result = 31 * result + (connection != null ? connection.hashCode() : 0);
		result = 31 * result + (dev != null ? dev.hashCode() : 0);
		result = 31 * result + (dpcloadn != null ? dpcloadn.hashCode() : 0);
		result = 31 * result + (dpcloads != null ? dpcloads.hashCode() : 0);
		result = 31 * result + (exttchirr != null ? exttchirr.hashCode() : 0);
		result = 31 * result + (fArea != null ? fArea.hashCode() : 0);
		result = 31 * result + (fSubArea != null ? fSubArea.hashCode() : 0);
		result = 31 * result + (iansw != null ? iansw.hashCode() : 0);
		result = 31 * result + (iasr != null ? iasr.hashCode() : 0);
		result = 31 * result + (icmpdial != null ? icmpdial.hashCode() : 0);
		result = 31 * result + (icmpdials != null ? icmpdials.hashCode() : 0);
		result = 31 * result + (icrna != null ? icrna.hashCode() : 0);
		result = 31 * result + (iictraf != null ? iictraf.hashCode() : 0);
		result = 31 * result + (inttchirr != null ? inttchirr.hashCode() : 0);
		result = 31 * result + (iogtraf != null ? iogtraf.hashCode() : 0);
		result = 31 * result + (iseiz != null ? iseiz.hashCode() : 0);
		result = 31 * result + (iseizwacm != null ? iseizwacm.hashCode() : 0);
		result = 31 * result + (mhts != null ? mhts.hashCode() : 0);
		result = 31 * result + (nmblock != null ? nmblock.hashCode() : 0);
		result = 31 * result + (node != null ? node.hashCode() : 0);
		result = 31 * result + (nodial != null ? nodial.hashCode() : 0);
		result = 31 * result + (oansw != null ? oansw.hashCode() : 0);
		result = 31 * result + (oasr != null ? oasr.hashCode() : 0);
		result = 31 * result + (occ != null ? occ.hashCode() : 0);
		result = 31 * result + (oglost != null ? oglost.hashCode() : 0);
		result = 31 * result + (ogofl != null ? ogofl.hashCode() : 0);
		result = 31 * result + (ogrna != null ? ogrna.hashCode() : 0);
		result = 31 * result + (opr != null ? opr.hashCode() : 0);
		result = 31 * result + (oseiz != null ? oseiz.hashCode() : 0);
		result = 31 * result + (oseizwacm != null ? oseizwacm.hashCode() : 0);
		result = 31 * result + (pcallblock != null ? pcallblock.hashCode() : 0);
		result = 31 * result + (pctblock != null ? pctblock.hashCode() : 0);
		result = 31 * result + (peakIncoming != null ? peakIncoming.hashCode() : 0);
		result = 31 * result + (peakOutgoing != null ? peakOutgoing.hashCode() : 0);
		result = 31 * result + (peakTime != null ? peakTime.hashCode() : 0);
		result = 31 * result + (peakTraf != null ? peakTraf.hashCode() : 0);
		result = 31 * result + (pocc != null ? pocc.hashCode() : 0);
		result = 31 * result + (poverflow != null ? poverflow.hashCode() : 0);
		result = 31 * result + (sbusy != null ? sbusy.hashCode() : 0);
		result = 31 * result + (sch != null ? sch.hashCode() : 0);
		result = 31 * result + (segmen != null ? segmen.hashCode() : 0);
		result = 31 * result + (subOpr != null ? subOpr.hashCode() : 0);
		result = 31 * result + (swlost != null ? swlost.hashCode() : 0);
		result = 31 * result + (tArea != null ? tArea.hashCode() : 0);
		result = 31 * result + (tSubArea != null ? tSubArea.hashCode() : 0);
		result = 31 * result + (tanggal != null ? tanggal.hashCode() : 0);
		result = 31 * result + (toXch != null ? toXch.hashCode() : 0);
		result = 31 * result + (trans != null ? trans.hashCode() : 0);
		result = 31 * result + (unallnumb != null ? unallnumb.hashCode() : 0);
		result = 31 * result + (unreas != null ? unreas.hashCode() : 0);
		result = 31 * result + (xch != null ? xch.hashCode() : 0);
		return result;
	}
}