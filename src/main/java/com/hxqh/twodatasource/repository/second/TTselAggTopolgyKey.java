package com.hxqh.twodatasource.repository.second;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;


/**
 * The persistent class for the t_tsel_agg_topolgy database table.
 * 
 */
@Embeddable
public class TTselAggTopolgyKey implements Serializable {
	private static final long serialVersionUID = 1L;

	private String agg;

	private int alert;

	@Column(name="Errors")
	private int errors;

	private int flap;

	@Column(name="n2_me")
	private String n2Me;

	private int operstatus;

	private String port;

	@Column(name="ran_ttc")
	private String ranTtc;

	@Column(name="reg_tsel")
	private String regTsel;

	private String timedata;

	private String treg;

	@Column(name="Utilization")
	private double utilization;

	public TTselAggTopolgyKey() {
	}

	public String getAgg() {
		return this.agg;
	}

	public void setAgg(String agg) {
		this.agg = agg;
	}

	public int getAlert() {
		return this.alert;
	}

	public void setAlert(int alert) {
		this.alert = alert;
	}

	public int getErrors() {
		return this.errors;
	}

	public void setErrors(int errors) {
		this.errors = errors;
	}

	public int getFlap() {
		return this.flap;
	}

	public void setFlap(int flap) {
		this.flap = flap;
	}

	public String getN2Me() {
		return this.n2Me;
	}

	public void setN2Me(String n2Me) {
		this.n2Me = n2Me;
	}

	public int getOperstatus() {
		return this.operstatus;
	}

	public void setOperstatus(int operstatus) {
		this.operstatus = operstatus;
	}

	public String getPort() {
		return this.port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getRanTtc() {
		return this.ranTtc;
	}

	public void setRanTtc(String ranTtc) {
		this.ranTtc = ranTtc;
	}

	public String getRegTsel() {
		return this.regTsel;
	}

	public void setRegTsel(String regTsel) {
		this.regTsel = regTsel;
	}

	public String getTimedata() {
		return this.timedata;
	}

	public void setTimedata(String timedata) {
		this.timedata = timedata;
	}

	public String getTreg() {
		return this.treg;
	}

	public void setTreg(String treg) {
		this.treg = treg;
	}

	public double getUtilization() {
		return this.utilization;
	}

	public void setUtilization(double utilization) {
		this.utilization = utilization;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		TTselAggTopolgyKey that = (TTselAggTopolgyKey) o;

		if (alert != that.alert) return false;
		if (errors != that.errors) return false;
		if (flap != that.flap) return false;
		if (operstatus != that.operstatus) return false;
		if (Double.compare(that.utilization, utilization) != 0) return false;
		if (agg != null ? !agg.equals(that.agg) : that.agg != null) return false;
		if (n2Me != null ? !n2Me.equals(that.n2Me) : that.n2Me != null) return false;
		if (port != null ? !port.equals(that.port) : that.port != null) return false;
		if (ranTtc != null ? !ranTtc.equals(that.ranTtc) : that.ranTtc != null) return false;
		if (regTsel != null ? !regTsel.equals(that.regTsel) : that.regTsel != null) return false;
		if (timedata != null ? !timedata.equals(that.timedata) : that.timedata != null) return false;
		return treg != null ? treg.equals(that.treg) : that.treg == null;
	}

	@Override
	public int hashCode() {
		int result;
		long temp;
		result = agg != null ? agg.hashCode() : 0;
		result = 31 * result + alert;
		result = 31 * result + errors;
		result = 31 * result + flap;
		result = 31 * result + (n2Me != null ? n2Me.hashCode() : 0);
		result = 31 * result + operstatus;
		result = 31 * result + (port != null ? port.hashCode() : 0);
		result = 31 * result + (ranTtc != null ? ranTtc.hashCode() : 0);
		result = 31 * result + (regTsel != null ? regTsel.hashCode() : 0);
		result = 31 * result + (timedata != null ? timedata.hashCode() : 0);
		result = 31 * result + (treg != null ? treg.hashCode() : 0);
		temp = Double.doubleToLongBits(utilization);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
}