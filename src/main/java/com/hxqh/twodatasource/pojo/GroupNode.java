package com.hxqh.twodatasource.pojo;

import java.math.BigDecimal;

/**
 * Created by Ocean lin on 2017/7/27.
 */
public class GroupNode {
    private BigDecimal start;
    private BigDecimal end;

    public GroupNode(BigDecimal start, BigDecimal end) {
        this.start = start;
        this.end = end;
    }

    public BigDecimal getStart() {
        return start;
    }

    public void setStart(BigDecimal start) {
        this.start = start;
    }

    public BigDecimal getEnd() {
        return end;
    }

    public void setEnd(BigDecimal end) {
        this.end = end;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GroupNode{");
        sb.append("start=").append(start);
        sb.append(", end=").append(end);
        sb.append('}');
        return sb.toString();
    }
}
