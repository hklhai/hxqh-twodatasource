package com.hxqh.twodatasource.repository.primary;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the OPENSTREETMAP database table.
 */
@Entity
@Table(name = "TB_OPENSTREETMAP")
public class Openstreetmap implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "TB_OPENSTREETMAP_OPENSTREETMAPID_GENERATOR", sequenceName = "SEQ_TB_OPENSTREETMAP")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TB_OPENSTREETMAP_OPENSTREETMAPID_GENERATOR")
    private BigDecimal openstreetmapid;

    private String description;

    private String ipadd;

    private String mapx;

    private String mapy;

    private String name;

    private Integer show;

    private String sto;

    private Integer treg;

    private String ts;

    private String opentype;

    public Openstreetmap() {
    }

    public BigDecimal getOpenstreetmapid() {
        return openstreetmapid;
    }

    public void setOpenstreetmapid(BigDecimal openstreetmapid) {
        this.openstreetmapid = openstreetmapid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIpadd() {
        return ipadd;
    }

    public void setIpadd(String ipadd) {
        this.ipadd = ipadd;
    }

    public String getMapx() {
        return mapx;
    }

    public void setMapx(String mapx) {
        this.mapx = mapx;
    }

    public String getMapy() {
        return mapy;
    }

    public void setMapy(String mapy) {
        this.mapy = mapy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getShow() {
        return show;
    }

    public void setShow(Integer show) {
        this.show = show;
    }

    public String getSto() {
        return sto;
    }

    public void setSto(String sto) {
        this.sto = sto;
    }

    public Integer getTreg() {
        return treg;
    }

    public void setTreg(Integer treg) {
        this.treg = treg;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public String getOpentype() {
        return opentype;
    }

    public void setOpentype(String opentype) {
        this.opentype = opentype;
    }
}