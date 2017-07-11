package com.hxqh.twodatasource.repository.second;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by Ocean lin on 2017/7/11.
 */
@Embeddable
public class TLvlEnterpriseCustKey implements Serializable {

    @Column(name = "cust_abbrev")
    private String custAbbrev;

    @Column(name = "cust_name")
    private String custName;

    @Column(name = "`DIV`")
    private String div;

    @Column(name = "GRP_CUST")
    private String grpCust;

    @Column(name = "LVL")
    private String lvl;

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

    public TLvlEnterpriseCustKey() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TLvlEnterpriseCustKey that = (TLvlEnterpriseCustKey) o;

        if (custAbbrev != null ? !custAbbrev.equals(that.custAbbrev) : that.custAbbrev != null) return false;
        if (custName != null ? !custName.equals(that.custName) : that.custName != null) return false;
        if (div != null ? !div.equals(that.div) : that.div != null) return false;
        if (grpCust != null ? !grpCust.equals(that.grpCust) : that.grpCust != null) return false;
        return lvl != null ? lvl.equals(that.lvl) : that.lvl == null;
    }

    @Override
    public int hashCode() {
        int result = custAbbrev != null ? custAbbrev.hashCode() : 0;
        result = 31 * result + (custName != null ? custName.hashCode() : 0);
        result = 31 * result + (div != null ? div.hashCode() : 0);
        result = 31 * result + (grpCust != null ? grpCust.hashCode() : 0);
        result = 31 * result + (lvl != null ? lvl.hashCode() : 0);
        return result;
    }
}
