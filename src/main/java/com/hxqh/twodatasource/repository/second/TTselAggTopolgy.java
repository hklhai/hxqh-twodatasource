package com.hxqh.twodatasource.repository.second;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_tsel_agg_topolgy database table.
 */
@Entity
@Table(name = "t_tsel_agg_topolgy")
public class TTselAggTopolgy implements Serializable {

    @Id
    private TTselAggTopolgyKey tTselAggTopolgyKey;

    public TTselAggTopolgyKey gettTselAggTopolgyKey() {
        return tTselAggTopolgyKey;
    }

    public void settTselAggTopolgyKey(TTselAggTopolgyKey tTselAggTopolgyKey) {
        this.tTselAggTopolgyKey = tTselAggTopolgyKey;
    }
}