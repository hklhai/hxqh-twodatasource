package com.hxqh.twodatasource.controller;

import com.hxqh.twodatasource.pojo.GroupNode;
import com.hxqh.twodatasource.repository.primary.TbIocConsumerVoiceTrafficRepository;
import com.hxqh.twodatasource.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * Created by Ocean lin on 2017/7/9.
 */
@Component
public class HxqhTimer {

    @Autowired
    private SystemService systemService;
    @Autowired
    private TbIocConsumerVoiceTrafficRepository tbIocConsumerVoiceTrafficRepository;

    //每天早八点到晚八点，间隔5分钟执行任务
    //MYSQL(Source)   -->     Oracle(Target)
    //t_alert_env             tb_iocenterpriseevent
    @Scheduled(cron = "0 */5 * * * * ")
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
    @Scheduled(cron = "0 */5 * * * * ")
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
    @Scheduled(cron = "0 */5 * * * * ")
    public void execTLvlEnterpriseCust() {
        try {
            systemService.saveEnterpriseCusts();
            systemService.analysis_data_cust_for_dws();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //T_PORTDOWN_4IOC             tb_IOCTPORTDOWN4IOC
    @Scheduled(cron = "0 */5 * * * * ")
    public void execPortdown() {
        try {
            systemService.saveTPortdown();
            systemService.analysis_source_portdown();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //ttwifi_mttr_proactive_last_month             tb_iocticketScreen96
    @Scheduled(cron = "0 */5 * * * * ")
    public void execMttrProactive() {
        try {
            systemService.saveTtwifiMttr();
            systemService.analysis_data_mttr_targets();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //t_sto_koordinat             TB_IOC_CENTER_MAP
    @Scheduled(cron = "0 */5 * * * * ")
    public void execStoKoordinat() {
        try {
            systemService.saveTStoKoordinat();
            //TODO
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //v_perf_enterprise_4tioc1             TB_IOC_ENT_4TIOC
    @Scheduled(cron = "0 */6 * * * * ")
    public void execPerfEnterprise4tiocRepository() {
        try {

            GroupNode node = systemService.getEnterprise4tiocMax();
            //确保数据源中包含数据
            if (null != node.getMysqlStart() && null != node.getMysqlEnd()) {

                if (null == node.getOracleEnd())
                    node.setOracleEnd(node.getMysqlStart());
                if (node.getMysqlStart().compareTo(node.getOracleEnd()) > 0)
                    node.setOracleEnd(node.getMysqlStart());

                //如果mysql数据源没有更新数据不必迁移
                if (node.getMysqlEnd().compareTo(node.getOracleEnd()) > 0) {
                    //如果迁移数据大于100000则分批次迁移
                    BigDecimal arangeValue = node.getOracleEnd().add(new BigDecimal(200000));
                    if (node.getMysqlEnd().compareTo(arangeValue) > 0) {
                        BigDecimal tmp = node.getOracleEnd();
                        int i = 0;
                        while (node.getMysqlEnd().compareTo(tmp) > 0 && i < 200000) {
                            BigDecimal addVal = tmp.add(new BigDecimal(1000));
                            systemService.saveTPerfEnterprise4tiocRepository(tmp, addVal);
                            //获取实际List长度
                            Long enterprise4tiocLength = systemService.getEnterprise4tiocLength(tmp, addVal);

                            tmp = tmp.add(new BigDecimal(1000));
                            i = enterprise4tiocLength.intValue() + i;
                        }
                    } else {
                        systemService.saveTPerfEnterprise4tiocRepository(node.getOracleEnd(), node.getMysqlEnd());
                    }
                }
            }
            systemService.analysis_source_ent_4tioc1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //v_perf_enterprise_4tioc1             TB_IOC_ENT_4TIOC
    @Scheduled(cron = "0 */5 * * * * ")
    public void mutilThreadIOC_ENT_4TIOC() {
        try {
//            systemService.mutilThreadIOC_ENT_4TIOC();
//            systemService.analysis_source_ent_4tioc1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //sipete_v_is_tg_ss_daily             TB_IOC_CONSUMER_VOICE_TRAFFIC
    @Scheduled(cron = "0 */15 * * * * ")
    public void execSipeteVIsTgSsDailyRepository() {
        try {
            systemService.saveSipeteVIsTgSsDailyRepository();
            //systemService.analysis_source_ent_4tioc1();
            //TODO
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //t_tsel_agg_topolgy             TB_IOC_MOBILE_BACKHAUL_TTC
    @Scheduled(cron = "0 */5 * * * * ")
    public void execMOBILE_BACKHAUL_TTCRepository() {
        try {
            systemService.saveMOBILE_BACKHAUL_TTCRepository();
            //systemService.analysis_source_ent_4tioc1();
            //TODO
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //v_ixtsel_4ioc             TB_IOC_MOBILE_BACKHAUL_TTC
    @Scheduled(cron = "0 */5 * * * * ")
    public void exec_mobile_ip_transitRepository() {
        try {
            systemService.save_mobile_ip_transitRepository();
            //TODO
            //  systemService.analysis_source_ent_4tioc1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Scheduled(cron = "0 */10 * * * * ")
    public void exec_saveVFfm() {
        try {
            systemService.saveVFfm();
            systemService.analysis_data_pro_ticket();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Scheduled(cron = "0 */10 * * * * ")
    public void saveVFfmAchievement() {
        try {
            systemService.saveVFfmAchievement();

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
