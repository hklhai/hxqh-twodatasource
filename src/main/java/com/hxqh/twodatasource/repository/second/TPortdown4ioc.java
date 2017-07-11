package com.hxqh.twodatasource.repository.second;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the T_PORTDOWN_4IOC database table.
 * 
 */
@Entity
@Table(name="v_portdown_4ioc")
public class TPortdown4ioc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private TPortdown4iocKey tPortdown4iocKey;

	public TPortdown4ioc() {
	}

	public TPortdown4iocKey gettPortdown4iocKey() {
		return tPortdown4iocKey;
	}

	public void settPortdown4iocKey(TPortdown4iocKey tPortdown4iocKey) {
		this.tPortdown4iocKey = tPortdown4iocKey;
	}
}