package com.hxqh.twodatasource.service;


import com.hxqh.twodatasource.pojo.GroupNode;
import com.hxqh.twodatasource.repository.primary.TbIocMobileIpTransit;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Ocean lin on 2017/7/1.
 */

public interface SystemService {


    void saveAlertEnvs() throws InvocationTargetException, IllegalAccessException;

    void saveEnterpriseCusts() throws Exception;

    void saveTtwifiMonitor() throws Exception;

    void saveTPortdown() throws Exception;

    void saveTtwifiMttr() throws Exception;

    void saveTStoKoordinat() throws Exception;

    GroupNode getEnterprise4tiocMax();

    void saveTPerfEnterprise4tiocRepository(BigDecimal tmp, BigDecimal addVal) throws Exception;

    void analysis_source_ent_4tioc1();

    void analysis_data_event_altenv();

    void analysis_source_portdown();

    void analysis_data_mttr_proactive();

    void analysis_data_mttr_targets();

    void analysis_data_cust_for_dws();

    /***Add Hy Chang  Start ****/
    void saveSipeteVIsTgSsDailyRepository() throws InvocationTargetException, IllegalAccessException;

    void saveMOBILE_BACKHAUL_TTCRepository() throws InvocationTargetException, IllegalAccessException;

    void save_mobile_ip_transitRepository(List<TbIocMobileIpTransit> ipTransits) throws InvocationTargetException, IllegalAccessException;

    void analysis_data_mobile_ip_trans();

    /***Add Hy Chang  end ****/

    void testTruncate();

    void analysis_data_consumer_voice();

    void saveVFfm() throws InvocationTargetException, IllegalAccessException;

    void saveVFfmAchievement() throws InvocationTargetException, IllegalAccessException;

    void analysis_data_pro_ticket();

    void analysis_data_pro_ticket_ffm();


    Long getEnterprise4tiocLength(BigDecimal tmp, BigDecimal addVal);

    void saveIocConsumerVoiceSource() throws InvocationTargetException, IllegalAccessException;

    void saveentErpriseProactive() throws InvocationTargetException, IllegalAccessException;
}


