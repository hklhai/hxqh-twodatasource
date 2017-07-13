package com.hxqh.twodatasource.repository.primary;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/**
 * Created by Ocean lin on 2017/7/10.
 */
@Repository
public interface Loctportdown4iocRepository extends CrudRepository<Loctportdown4ioc,BigDecimal>{
    @Procedure(name = "analysis_source_portdown")
    void analysis_source_portdown();
}
