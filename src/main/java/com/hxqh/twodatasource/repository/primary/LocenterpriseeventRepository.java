package com.hxqh.twodatasource.repository.primary;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/**
 * Created by Ocean lin on 2017/7/10.
 */
@Repository
public interface LocenterpriseeventRepository extends CrudRepository<Locenterpriseevent, BigDecimal> {
//    @Query(nativeQuery=true,value = "truncate table TB_IOCENTERPRISEEVENT")
//    void truncatetable();

    @Procedure(name = "analysis_data_event_altenv")
    void analysis_data_event_altenv();
}
