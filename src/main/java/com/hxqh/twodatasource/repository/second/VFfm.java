package com.hxqh.twodatasource.repository.second;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the v_ffm database table.
 * 
 */
@Entity
@Table(name="v_ffm")
public class VFfm implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private VFfmKey vFfmKey;

	public VFfm() {
	}

	public VFfmKey getvFfmKey() {
		return vFfmKey;
	}

	public void setvFfmKey(VFfmKey vFfmKey) {
		this.vFfmKey = vFfmKey;
	}
}