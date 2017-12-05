package com.hxqh.twodatasource.test;

import com.hxqh.twodatasource.common.ListUtils;
import com.hxqh.twodatasource.repository.primary.TbIocConsumerVoiceTrafficRepository;
import com.hxqh.twodatasource.repository.primary.TbIocMobileIpTransit;
import com.hxqh.twodatasource.repository.second.TIxtsel4ioc;
import com.hxqh.twodatasource.repository.second.TIxtsel4iocRepository;
import com.hxqh.twodatasource.service.SystemService;
import org.apache.commons.beanutils.BeanUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Ocean lin on 2017/7/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    private SystemService systemService;
    @Autowired
    private TbIocConsumerVoiceTrafficRepository tbIocConsumerVoiceTrafficRepository;

    @Autowired
    private TIxtsel4iocRepository tIxtsel4iocRepository;

    @Test
    public void test() throws Exception {
        Assert.assertTrue(1 == 1);
    }

    // v_enterprise_proactive--->TB_ENTERPRISE_PROACTIVE
//    @Test
//    public void testEnterpriseProactive() throws Exception {
//        systemService.saveentErpriseProactive();
//    }

//T_ALERT_ENV-->TB_IOCENTERPRISEEVENT
//    @Test
//    public void testTAlertEnv() throws Exception {
//        systemService.saveAlertEnvs();
//    }
//
//    @Test
//    public void testProactive() throws Exception {
//        systemService.saveTtwifiMonitor();
//    }
//
//    @Test
//    public void testSaveTLvlEnterpriseCust() throws Exception {
//        systemService.saveEnterpriseCusts();
//    }
//
//    @Test
//    public void testTPortdown4ioc() throws Exception {
//        systemService.saveTPortdown();
//    }

    //    @Test
//    public void testTStoKoordinat() throws Exception {
//        systemService.saveTStoKoordinat();
//    }
//
//    @Test
//    public void testTtwifiMttr() throws Exception {
//        systemService.saveTtwifiMttr();
//    }
//


//    @Test
//    public void testTPerfEnterprise4tiocRepository() throws Exception {
//
//        GroupNode node = systemService.getEnterprise4tiocMax();
//
//        //确保数据源中包含数据
//        if (null != node.getMysqlStart() && null != node.getMysqlEnd()) {
//
//            if (null == node.getOracleEnd())
//                node.setOracleEnd(node.getMysqlStart());
//            if (node.getMysqlStart().compareTo(node.getOracleEnd()) > 0)
//                node.setOracleEnd(node.getMysqlStart());
//
//            //如果mysql数据源没有更新数据不必迁移
//            if (node.getMysqlEnd().compareTo(node.getOracleEnd()) > 0) {
//                //如果迁移数据大于100000则分批次迁移
//                BigDecimal arangeValue = node.getOracleEnd().add(new BigDecimal(9000));
//                if (node.getMysqlEnd().compareTo(arangeValue) > 0) {
//                    BigDecimal tmp = node.getOracleEnd();
//                    int i = 0;
//                    while (node.getMysqlEnd().compareTo(tmp) > 0 && i < 100000) {
//                        BigDecimal addVal = tmp.add(new BigDecimal(1001));
//                        systemService.saveTPerfEnterprise4tiocRepository(tmp, addVal);
//                        //获取实际List长度
//                        Long enterprise4tiocLength = systemService.getEnterprise4tiocLength(tmp, addVal);
//
//                        tmp = tmp.add(new BigDecimal(1000));
//                        i = enterprise4tiocLength.intValue() + i;
//                    }
//                } else {
//                    systemService.saveTPerfEnterprise4tiocRepository(node.getOracleEnd(), node.getMysqlEnd());
//                }
//            }
//        }
//    }


//        systemService.saveTPerfEnterprise4tiocRepository();
//        systemService.analysis_source_ent_4tioc1();
//}
////
//
//    //调用存储过程  analysis_source_ent_4tioc1
//    //V_PERF_ENTERPRISE_4TIOC1           tb_ioctperfenterprise4tioc      Analysis_Source_ENT_4TIOC1
//    @Test
//    public void testIoctperfenterprise4tioc() throws Exception {
//        systemService.analysis_source_ent_4tioc1();
//    }
//
//    //调用存储过程  analysis_data_event_altenv
//    //t_alert_env             tb_iocenterpriseevent       Analysis_Data_Event_Altenv
//    @Test
//    public void testIocenterpriseevent() throws Exception {
//        systemService.analysis_data_event_altenv();
//    }
//
//    //调用存储过程  analysis_source_portdown
//    //T_PORTDOWN_4IOC             tb_IOCTPORTDOWN4IOC           Analysis_Source_PORTDOWN
//    @Test
//    public void testPortdown() throws Exception {
//        systemService.analysis_source_portdown();
//    }
//
//    //ttwifi_monitor_mttr_proactive        tb_IOCTICKETSCREEN100       Analysis_Data_Mttr_Proactive
//    @Test
//    public void testIocticketscreen100() throws Exception {
//        systemService.analysis_data_mttr_proactive();
//    }
//
//    //ttwifi_mttr_proactive_last_month     tb_iocticketScreen96        Analysis_Data_Mttr_Targets
//    @Test
//    public void testIocticketScreen96  () throws Exception {
//        systemService.analysis_data_mttr_targets();
//    }

//    //T_LVL_ENTERPRISE_CUST             tb_IOCCUSTOMERUSER
//    @Test
//    public void analysis_data_cust_for_dws() throws Exception {
//        systemService.analysis_data_cust_for_dws();
//    }

// TB_IOC_CONSUMER_VOICE_SOURCE     ----->Analysis_Data_CONSUMER_Voice
//    @Test
//    public void analysis_data_consumer_voice() throws Exception {
//        systemService.analysis_data_consumer_voice();
//    }


    //    sipete_v_is_tg_ss_daily  tb_ioc_consumer_voice_source -->TB_IOC_CONSUMER_VOICE_SOURCE
//    @Test  //not used  not used not used
//    public void testSipeteVIsTgSsDailyRepository() throws Exception {
//        systemService.saveSipeteVIsTgSsDailyRepository();
//    }

//    @Test
//    public void testsaveMOBILE_BACKHAUL_TTCRepository() throws Exception {
//        systemService.saveMOBILE_BACKHAUL_TTCRepository();
//    }

    //v_ixtsel_4ioc    TB_IOC_MOBILE_IPTRANSIT_SOURCE
//    @Test
//    public void testsave_mobile_ip_transitRepository() throws Exception {
//
//        //1.检查 Oracle 最大时间记录
//        Long maxOracle = tbIocConsumerVoiceTrafficRepository.getMaxRecord();
//        //2.查询MYSQL之后数据Date
//        if (null == maxOracle) {
//            maxOracle = 0l;
//        }
//        List<TIxtsel4ioc> tIxtsel4iocList = tIxtsel4iocRepository.findETLData(maxOracle);
//
//        //3.存入Oracle
//        if (tIxtsel4iocList.size() > 0) {
//            List<TbIocMobileIpTransit> transits = new ArrayList<>();
//            for (TIxtsel4ioc t : tIxtsel4iocList) {
//                TbIocMobileIpTransit tn = new TbIocMobileIpTransit();
//                BeanUtils.copyProperties(tn, t);
//                tn.setWrongs(BigDecimal.valueOf(t.getWrong()));
//                tn.setTs(new Date());
//                tn.setInterface_(t.getIocinterface());
//                tn.setIpid(t.getId());
//                tn.setTimedata(t.getTimedata());
//                transits.add(tn);
//            }
//            //拆分List
//            List<List<TbIocMobileIpTransit>> split = ListUtils.split(transits, 500);
//            for (int i = 0; i < split.size(); i++) {
//                systemService.save_mobile_ip_transitRepository(split.get(i));
//            }
//            systemService.analysis_data_mobile_ip_trans();
//        }
//    }


//    TB_IOC_MOB_BACKHAUL_TTC_SOURCE   --->  Analysis_Data_MOBILE_Back_TTC
//    @Test
//    public void analysis_data_mobile_back_ttc() throws Exception {
//        tbIocConsumerVoiceTrafficRepository.analysis_data_mobile_back_ttc();
//    }


//    //    TB_IOC_MOBILE_IPTRANSIT_SOURCE ---> Analysis_Data_MOBILE_IP_Trans
//    @Test
//    public void analysis_data_mobile_ip_trans() throws Exception {
//        tbIocConsumerVoiceTrafficRepository.analysis_data_mobile_ip_trans();
//    }

//tTruncat测试
//    @Test
//    public void testTruncate() throws Exception {
//        systemService.testTruncate();
//    }

//    @Test
//    public void testsaveVFfm() throws Exception {
//        systemService.saveVFfm();
//    }

//    @Test
//    public void testsaveVFfmAchievement() throws Exception {
//        systemService.saveVFfmAchievement();
//    }

//    //调用存储过程v_ffm --->tb_ioc_pro_ticket --->Analysis_Data_PRO_TICKET
//    @Test
//    public void analysis_data_pro_ticket() throws Exception {
//        systemService.analysis_data_pro_ticket();
//    }
//
//
//    //调用存储过程v_ffm_achievement  tb_ioc_pro_ticket--->Analysis_Data_PRO_TICKET_FFM
//    @Test
//    public void analysis_data_pro_ticket_ffm() throws Exception {
//        systemService.analysis_data_pro_ticket_ffm();
//    }


    //    sipete_v_is_tg_ss_daily  tb_ioc_consumer_voice_source -->TB_IOC_CONSUMER_VOICE_SOURCE
//    @Test
//    public void testSaveIocConsumerVoiceSource() throws Exception {
//        systemService.saveIocConsumerVoiceSource();
//    }


}





