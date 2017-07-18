package com.hxqh.twodatasource.repository.primary;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/**
 * Created by Ocean lin on 2017/7/9.
 */
@Repository
public interface TbIocConsumerVoiceTrafficRepository extends CrudRepository<TbIocConsumerVoiceTraffic, BigDecimal> {

    @Procedure(name = "analysis_data_consumer_voice")
    void analysis_data_consumer_voice();

    @Procedure(name = "p_truncate_twodatasource.trun_TB_USER")
    void p_truncate_twodatasource_trun_TB_USER();
}
