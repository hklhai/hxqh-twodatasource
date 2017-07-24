package com.hxqh.twodatasource.test;

import com.hxqh.twodatasource.repository.primary.TbIocConsumerVoiceTrafficRepository;
import com.hxqh.twodatasource.service.SystemService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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

    @Test
    public void test() throws Exception {
        Assert.assertTrue(1 == 1);
    }
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
//        systemService.saveTPerfEnterprise4tiocRepository();
//    }
//
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


    //sipete_v_is_tg_ss_daily  tb_ioc_consumer_voice_source
//    @Test
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
//        systemService.save_mobile_ip_transitRepository();
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
//
    @Test
    public void testsaveVFfmAchievement() throws Exception {
        systemService.saveVFfmAchievement();
    }

    //调用存储过程V_FFM --->tb_ioc_pro_ticket --->Analysis_Data_PRO_TICKET
//    @Test
//    public void analysis_data_pro_ticket() throws Exception {
//        systemService.analysis_data_pro_ticket();
//    }


//    //调用存储过程v_ffm_achievement  tb_ioc_pro_ticket--->Analysis_Data_PRO_TICKET_FFM
//    @Test
//    public void analysis_data_pro_ticket_ffm() throws Exception {
//        systemService.analysis_data_pro_ticket_ffm();
//    }



}




