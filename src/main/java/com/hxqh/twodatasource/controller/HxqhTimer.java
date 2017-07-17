package com.hxqh.twodatasource.controller;

import com.hxqh.twodatasource.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by Ocean lin on 2017/7/9.
 */
@Component
public class HxqhTimer {

    @Autowired
    private SystemService systemService;


    //每天早八点到晚八点，间隔5分钟执行任务
    //MYSQL(Source)   -->     Oracle(Target)
    //t_alert_env             tb_iocenterpriseevent
    @Scheduled(cron = "0 0/5 8-20 * * ?")
    public void execTAlertEnv() {
        try {
            systemService.saveAlertEnvs();
            systemService.analysis_data_event_altenv();

        } catch (Exception e) {
            //TODO 日志功能
            e.printStackTrace();
        }
    }

    //ttwifi_monitor_mttr_proactive             tb_IOCTICKETSCREEN100
    @Scheduled(cron = "0 0/5 8-20 * * ?")
    public void execWifiMonitor() {
        try {
            systemService.saveTtwifiMonitor();
            systemService.analysis_data_mttr_proactive();

        } catch (Exception e) {
            //TODO 日志功能
            e.printStackTrace();
        }
    }


    //每天早八点到晚八点，间隔5分钟执行任务
    //T_LVL_ENTERPRISE_CUST             tb_IOCCUSTOMERUSER
    @Scheduled(cron = "0 0/60 8-20 * * ?")
    public void execTLvlEnterpriseCust() {
        try {
            systemService.saveEnterpriseCusts();
            systemService.analysis_data_cust_for_dws();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //T_PORTDOWN_4IOC             tb_IOCTPORTDOWN4IOC
    @Scheduled(cron = "0 0/5 8-20 * * ?")
    public void execPortdown() {
        try {
            systemService.saveTPortdown();
            systemService.analysis_source_portdown();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //ttwifi_mttr_proactive_last_month             tb_iocticketScreen96
    @Scheduled(cron = "0 0/5 8-20 * * ?")
    public void execMttrProactive() {
        try {
            systemService.saveTtwifiMttr();
            systemService.analysis_data_mttr_targets();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //t_sto_koordinat             TB_IOC_CENTER_MAP
    @Scheduled(cron = "0 0/5 8-20 * * ?")
    public void execStoKoordinat() {
        try {
            systemService.saveTStoKoordinat();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //v_perf_enterprise_4tioc1             TB_IOC_ENT_4TIOC
    @Scheduled(cron = "0 0/5 8-20 * * ?")
    public void execPerfEnterprise4tiocRepository() {
        try {
            systemService.saveTPerfEnterprise4tiocRepository();

            systemService.analysis_source_ent_4tioc1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


//    //每5分钟执行一次
//    @Scheduled(fixedRate = 2 * 60 * 1000)
//    public void openStreetMap() {
//        try {
//            systemService.openStreetMap();
//        } catch (InvocationTargetException e) {
//            //TODO 日志功能
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
//    }

}
