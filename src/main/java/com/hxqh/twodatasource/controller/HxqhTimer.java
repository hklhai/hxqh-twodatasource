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
    //t_alert_env             tb_iocenterpriseevent
    @Scheduled(cron = "0 0/5 8-20 * * ?")
    public void execTAlertEnv() {
        try {
            systemService.saveAlertEnvs();
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
        } catch (Exception e) {
            //TODO 日志功能
            e.printStackTrace();
        }
    }


    //每天早八点到晚八点，间隔5分钟执行任务
    //T_LVL_ENTERPRISE_CUST             tb_IOCCUSTOMERUSER
    @Scheduled(cron = "0 0/5 8-20 * * ?")
    public void exec() {

    }


//    @Test
//    public void testSaveTLvlEnterpriseCust() throws Exception {
//        List<TLvlEnterpriseCust> tLvlEnterpriseCusts = tLvlEnterpriseCustRepository.findAll();
//        if (tLvlEnterpriseCusts != null) {
//            systemService.saveEnterpriseCusts(tLvlEnterpriseCusts);
//        }
//    }


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
