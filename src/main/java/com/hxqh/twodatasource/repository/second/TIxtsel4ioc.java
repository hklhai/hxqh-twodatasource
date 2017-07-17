package com.hxqh.twodatasource.repository.second;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_ixtsel_4ioc database table.
 * 
 */
@Entity
@Table(name="v_ixtsel_4ioc")
public class TIxtsel4ioc implements Serializable {
	@Id
	private  TIxtsel4iocKey tIxtsel4iocKey;

	public TIxtsel4iocKey gettIxtsel4iocKey() {
		return tIxtsel4iocKey;
	}

	public void settIxtsel4iocKey(TIxtsel4iocKey tIxtsel4iocKey) {
		this.tIxtsel4iocKey = tIxtsel4iocKey;
	}
}