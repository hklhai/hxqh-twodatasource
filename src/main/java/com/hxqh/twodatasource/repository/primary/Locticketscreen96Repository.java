package com.hxqh.twodatasource.repository.primary;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/**
 * Created by Ocean lin on 2017/7/10.
 */
@Repository
public interface Locticketscreen96Repository extends CrudRepository<Locticketscreen96, BigDecimal> {

    @Procedure(name = "analysis_data_mttr_targets")
    void analysis_data_mttr_targets();
}
