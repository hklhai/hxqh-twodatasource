package com.hxqh.twodatasource.repository.second;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


/**
 * The persistent class for the ttwifi_mttr_proactive_last_month database table.
 */
@Entity
@Table(name = "ttwifi_mttr_proactive_last_month")
public class TtwifiMttrProactiveLastMonth implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private TtwifiMttrProactiveKey ttwifiMttrProactiveKey;

    public TtwifiMttrProactiveLastMonth() {
    }

    public TtwifiMttrProactiveKey getTtwifiMttrProactiveKey() {
        return ttwifiMttrProactiveKey;
    }

    public void setTtwifiMttrProactiveKey(TtwifiMttrProactiveKey ttwifiMttrProactiveKey) {
        this.ttwifiMttrProactiveKey = ttwifiMttrProactiveKey;
    }

}