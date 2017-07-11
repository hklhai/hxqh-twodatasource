package com.hxqh.twodatasource.repository.second;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_sto_koordinat database table.
 */
@Entity
@Table(name = "t_sto_koordinat")
public class TStoKoordinat implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private TStoKoordinatKey tStoKoordinatKey;

    public TStoKoordinat() {
    }

    public TStoKoordinatKey gettStoKoordinatKey() {
        return tStoKoordinatKey;
    }

    public void settStoKoordinatKey(TStoKoordinatKey tStoKoordinatKey) {
        this.tStoKoordinatKey = tStoKoordinatKey;
    }
}