package com.hxqh.twodatasource.repository.second;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the T_LVL_ENTERPRISE_CUST database table.
 * 
 */
@Entity
@Table(name="T_LVL_ENTERPRISE_CUST")
public class TLvlEnterpriseCust implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="cust_abbrev")
	private String custAbbrev;

	@Column(name="cust_name")
	private String custName;

	@Column(name="`DIV`")
	private String div;

	@Column(name="GRP_CUST")
	private String grpCust;

	@Column(name="LVL")
	private String lvl;

	public TLvlEnterpriseCust() {
	}

	public String getCustAbbrev() {
		return this.custAbbrev;
	}

	public void setCustAbbrev(String custAbbrev) {
		this.custAbbrev = custAbbrev;
	}

	public String getCustName() {
		return this.custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getDiv() {
		return this.div;
	}

	public void setDiv(String div) {
		this.div = div;
	}

	public String getGrpCust() {
		return this.grpCust;
	}

	public void setGrpCust(String grpCust) {
		this.grpCust = grpCust;
	}

	public String getLvl() {
		return this.lvl;
	}

	public void setLvl(String lvl) {
		this.lvl = lvl;
	}

}