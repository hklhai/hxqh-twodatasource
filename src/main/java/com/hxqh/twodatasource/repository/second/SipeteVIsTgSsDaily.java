package com.hxqh.twodatasource.repository.second;
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the SIPETE_V_IS_TG_SS_DAILY database table.
 *  SipeteVIsTgSsDailyRepository
 */
@Entity
@Table(name="sipete_v_is_tg_ss_daily")
public class SipeteVIsTgSsDaily implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private  SipeteVIsTgSsDailyKey sipeteVIsTgSsDailyKey;
	public SipeteVIsTgSsDailyKey getSipeteVIsTgSsDailyKey() {
		return sipeteVIsTgSsDailyKey;
	}

	public void setSipeteVIsTgSsDailyKey(SipeteVIsTgSsDailyKey sipeteVIsTgSsDailyKey) {
		this.sipeteVIsTgSsDailyKey = sipeteVIsTgSsDailyKey;
	}


}