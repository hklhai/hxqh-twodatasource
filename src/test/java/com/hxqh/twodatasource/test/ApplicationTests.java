package com.hxqh.twodatasource.test;

import com.hxqh.twodatasource.repository.second.*;
import com.hxqh.twodatasource.service.SystemService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by Ocean lin on 2017/7/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    private SystemService systemService;


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
//
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

}




