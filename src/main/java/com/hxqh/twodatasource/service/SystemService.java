package com.hxqh.twodatasource.service;


import com.hxqh.twodatasource.repository.primary.Openstreetmap;
import com.hxqh.twodatasource.repository.second.*;

import java.lang.reflect.InvocationTargetException;
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

    void saveTPerfEnterprise4tiocRepository() throws Exception;

    void analysis_source_ent_4tioc1();

    void analysis_data_event_altenv();

    void analysis_source_portdown();

    void analysis_data_mttr_proactive();

    void analysis_data_mttr_targets();

    void analysis_data_cust_for_dws();

    /***Add Hy Chang  Start ****/
    void saveSipeteVIsTgSsDailyRepository() throws InvocationTargetException, IllegalAccessException;

    void saveMOBILE_BACKHAUL_TTCRepository() throws InvocationTargetException, IllegalAccessException;

    void save_mobile_ip_transitRepository() throws InvocationTargetException, IllegalAccessException;

    /***Add Hy Chang  end ****/

    void testTruncate();

    void analysis_data_consumer_voice();

    void saveVFfm() throws InvocationTargetException, IllegalAccessException;

    void saveVFfmAchievement() throws InvocationTargetException, IllegalAccessException;

    void analysis_data_pro_ticket();

    void analysis_data_pro_ticket_ffm();
}


