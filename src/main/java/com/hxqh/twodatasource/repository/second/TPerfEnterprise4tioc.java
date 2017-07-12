package com.hxqh.twodatasource.repository.second;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the T_PERF_ENTERPRISE_4TIOC1_VW_5MINS database table.
 * 
 */
@Entity
@Table(name="v_perf_enterprise_4tioc1")
public class TPerfEnterprise4tioc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private TPerfEnterprise4tiocKey tPerfEnterprise4tiocKey;

	@Column(name="e_rsi_timedata")
	private String eRsiTimedata;


	public TPerfEnterprise4tioc() {
	}

	public String geteRsiTimedata() {
		return eRsiTimedata;
	}

	public void seteRsiTimedata(String eRsiTimedata) {
		this.eRsiTimedata = eRsiTimedata;
	}

	public TPerfEnterprise4tiocKey gettPerfEnterprise4tiocKey() {
		return tPerfEnterprise4tiocKey;
	}

	public void settPerfEnterprise4tiocKey(TPerfEnterprise4tiocKey tPerfEnterprise4tiocKey) {
		this.tPerfEnterprise4tiocKey = tPerfEnterprise4tiocKey;
	}
}