package com.hxqh.twodatasource.repository.second;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by Ocean lin on 2017/7/11.
 */
@Embeddable
public class TAlertEnvKey implements Serializable {


    private String detekakhir;

    private String dtnya;

    @Column(name="jml_5mnt")
    private int jml5mnt;

    private String msgalrm;

    private String node;

    public String getDetekakhir() {
        return detekakhir;
    }

    public void setDetekakhir(String detekakhir) {
        this.detekakhir = detekakhir;
    }

    public String getDtnya() {
        return dtnya;
    }

    public void setDtnya(String dtnya) {
        this.dtnya = dtnya;
    }

    public int getJml5mnt() {
        return jml5mnt;
    }

    public void setJml5mnt(int jml5mnt) {
        this.jml5mnt = jml5mnt;
    }

    public String getMsgalrm() {
        return msgalrm;
    }

    public void setMsgalrm(String msgalrm) {
        this.msgalrm = msgalrm;
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TAlertEnvKey that = (TAlertEnvKey) o;

        if (jml5mnt != that.jml5mnt) return false;
        if (detekakhir != null ? !detekakhir.equals(that.detekakhir) : that.detekakhir != null) return false;
        if (dtnya != null ? !dtnya.equals(that.dtnya) : that.dtnya != null) return false;
        if (msgalrm != null ? !msgalrm.equals(that.msgalrm) : that.msgalrm != null) return false;
        return node != null ? node.equals(that.node) : that.node == null;
    }

    @Override
    public int hashCode() {
        int result = detekakhir != null ? detekakhir.hashCode() : 0;
        result = 31 * result + (dtnya != null ? dtnya.hashCode() : 0);
        result = 31 * result + jml5mnt;
        result = 31 * result + (msgalrm != null ? msgalrm.hashCode() : 0);
        result = 31 * result + (node != null ? node.hashCode() : 0);
        return result;
    }
}
