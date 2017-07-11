package com.hxqh.twodatasource.repository.second;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ttwifi_monitor_mttr_proactive database table.
 */
@Entity
@Table(name = "ttwifi_monitor_mttr_proactive")
public class TtwifiMonitorMttrProactive implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private TtwifiMonitorKey ttwifiMonitorKey;

    public TtwifiMonitorMttrProactive() {
    }

    public TtwifiMonitorKey getTtwifiMonitorKey() {
        return ttwifiMonitorKey;
    }

    public void setTtwifiMonitorKey(TtwifiMonitorKey ttwifiMonitorKey) {
        this.ttwifiMonitorKey = ttwifiMonitorKey;
    }
}