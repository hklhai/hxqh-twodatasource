package com.hxqh.twodatasource.repository.primary;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by Ocean lin on 2017/7/9.
 */
@Repository
public interface TbIocConsumerVoiceTrafficRepository extends CrudRepository<TbIocConsumerVoiceTraffic, BigDecimal> {

    @Procedure(name = "analysis_data_consumer_voice")
    void analysis_data_consumer_voice();

    @Procedure(name = "p_truncate_twodatasource.trun_TB_USER")
    void p_truncate_twodatasource_trun_TB_USER();

    @Procedure(name = "p_truncate_twodatasource.trun_TB_IOC_MOBILE_IPTRANSIT")
    void p_truncate_twodatasource_trun_TB_IOC_MOBILE_IPTRANSIT();

    @Procedure(name = "p_truncate_twodatasource.trun_tb_ffm")
    void p_truncate_twodatasource_trun_tb_ffm();

    @Procedure(name = "p_truncate_twodatasource.trun_tb_ffm_achievement")
    void p_truncate_twodatasource_trun_tb_ffm_achievement();


    /*************************调用*****************************************/
    @Procedure(name = "analysis_data_mobile_back_ttc")
    void analysis_data_mobile_back_ttc();
    @Procedure(name = "analysis_data_mobile_ip_trans")
    void analysis_data_mobile_ip_trans();


    @Query("select max(x.ipid) as tanggal from TbIocConsumerVoiceTraffic x")
    Long getMaxRecord();


    @Procedure(name = "analysis_data_pro_ticket")
    void analysis_data_pro_ticket();

    @Procedure(name = "analysis_data_pro_ticket_ffm")
    void analysis_data_pro_ticket_ffm();

    /*************************调用*****************************************/

}
