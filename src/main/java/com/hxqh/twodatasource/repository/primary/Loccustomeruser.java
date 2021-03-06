package com.hxqh.twodatasource.repository.primary;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the TB_IOCCUSTOMERUSER database table.
 */
@Entity
@Table(name = "TB_IOCCUSTOMERUSER")
@NamedStoredProcedureQueries({@NamedStoredProcedureQuery(name = "analysis_data_cust_for_dws", procedureName = "analysis_data_cust_for_dws")})
public class Loccustomeruser implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "CUST_ABBREV")
    private String custAbbrev;

    @Column(name = "CUST_NAME")
    private String custName;

    private String div;

    @Column(name = "GRP_CUST")
    private String grpCust;

    @Id
    @SequenceGenerator(name = "TB_IOCCUSTOMERUSER_IOCCUSTOMERUSERID_GENERATOR", sequenceName = "SEQ_TB_IOCCUSTOMERUSER")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TB_IOCCUSTOMERUSER_IOCCUSTOMERUSERID_GENERATOR")
    private BigDecimal ioccustomeruserid;

    private String lvl;

    private Date adddate;

    public Loccustomeruser() {
    }

    public Date getAdddate() {
        return adddate;
    }

    public void setAdddate(Date adddate) {
        this.adddate = adddate;
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

    public BigDecimal getIoccustomeruserid() {
        return this.ioccustomeruserid;
    }

    public void setIoccustomeruserid(BigDecimal ioccustomeruserid) {
        this.ioccustomeruserid = ioccustomeruserid;
    }

    public String getLvl() {
        return this.lvl;
    }

    public void setLvl(String lvl) {
        this.lvl = lvl;
    }

}