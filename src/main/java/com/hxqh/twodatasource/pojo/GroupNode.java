package com.hxqh.twodatasource.pojo;

import java.math.BigDecimal;

/**
 * Created by Ocean lin on 2017/7/27.
 */
public class GroupNode {
    private BigDecimal mysqlStart;
    private BigDecimal mysqlEnd;
    private BigDecimal oracleEnd;

    public GroupNode(BigDecimal mysqlStart, BigDecimal mysqlEnd, BigDecimal oracleEnd) {
        this.mysqlStart = mysqlStart;
        this.mysqlEnd = mysqlEnd;
        this.oracleEnd = oracleEnd;
    }

    public BigDecimal getMysqlStart() {
        return mysqlStart;
    }

    public void setMysqlStart(BigDecimal mysqlStart) {
        this.mysqlStart = mysqlStart;
    }

    public BigDecimal getMysqlEnd() {
        return mysqlEnd;
    }

    public void setMysqlEnd(BigDecimal mysqlEnd) {
        this.mysqlEnd = mysqlEnd;
    }

    public BigDecimal getOracleEnd() {
        return oracleEnd;
    }

    public void setOracleEnd(BigDecimal oracleEnd) {
        this.oracleEnd = oracleEnd;
    }
}
