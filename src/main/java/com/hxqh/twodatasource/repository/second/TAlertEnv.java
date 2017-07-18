package com.hxqh.twodatasource.repository.second;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


/**
 * The persistent class for the t_alert_env database table.
 */
@Entity
@Table(name = "t_alert_env")
public class TAlertEnv implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    TAlertEnvKey tAlertEnvKey;

    public TAlertEnv() {
    }

    public TAlertEnvKey gettAlertEnvKey() {
        return tAlertEnvKey;
    }

    public void settAlertEnvKey(TAlertEnvKey tAlertEnvKey) {
        this.tAlertEnvKey = tAlertEnvKey;
    }
}