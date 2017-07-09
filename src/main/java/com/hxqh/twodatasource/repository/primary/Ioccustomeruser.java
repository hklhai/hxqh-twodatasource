package com.hxqh.twodatasource.repository.primary;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;


/**
 * The persistent class for the IOCCUSTOMERUSER database table.
 * 
 */
@Entity
@Table(name = "TB_IOCCUSTOMERUSER")
public class Ioccustomeruser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "TB_IOCCUSTOMERUSER_IOCCUSTOMERUSERID_GENERATOR", sequenceName = "SEQ_TB_IOCCUSTOMERUSER")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TB_IOCCUSTOMERUSER_IOCCUSTOMERUSERID_GENERATOR")
	private BigDecimal ioccustomeruserid;

	private String custid;

	private String custname;

	private String custrank;

	private String custtype;

	private String lvl;

	private String ts;

	public Ioccustomeruser() {
	}

	public BigDecimal getIoccustomeruserid() {
		return ioccustomeruserid;
	}

	public void setIoccustomeruserid(BigDecimal ioccustomeruserid) {
		this.ioccustomeruserid = ioccustomeruserid;
	}

	public String getCustid() {
		return this.custid;
	}

	public void setCustid(String custid) {
		this.custid = custid;
	}

	public String getCustname() {
		return this.custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public String getCustrank() {
		return this.custrank;
	}

	public void setCustrank(String custrank) {
		this.custrank = custrank;
	}

	public String getCusttype() {
		return this.custtype;
	}

	public void setCusttype(String custtype) {
		this.custtype = custtype;
	}

	public String getLvl() {
		return this.lvl;
	}

	public void setLvl(String lvl) {
		this.lvl = lvl;
	}

	public String getTs() {
		return this.ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

}