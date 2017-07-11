package com.hxqh.twodatasource.repository.second;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the T_LVL_ENTERPRISE_CUST database table.
 */
@Entity
@Table(name = "v_lvl_enterprise_cust")
public class TLvlEnterpriseCust implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private TLvlEnterpriseCustKey tLvlEnterpriseCustKey;

    public TLvlEnterpriseCust() {
    }

    public TLvlEnterpriseCustKey gettLvlEnterpriseCustKey() {
        return tLvlEnterpriseCustKey;
    }

    public void settLvlEnterpriseCustKey(TLvlEnterpriseCustKey tLvlEnterpriseCustKey) {
        this.tLvlEnterpriseCustKey = tLvlEnterpriseCustKey;
    }
}