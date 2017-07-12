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


    @Test
    public void testTAlertEnv() throws Exception {
        systemService.saveAlertEnvs();
    }

    @Test
    public void testProactive() throws Exception {
        systemService.saveTtwifiMonitor();
    }

    @Test
    public void testSaveTLvlEnterpriseCust() throws Exception {
        systemService.saveEnterpriseCusts();
    }

    @Test
    public void testTPortdown4ioc() throws Exception {
        systemService.saveTPortdown();
    }

    @Test
    public void testTStoKoordinat() throws Exception {
        systemService.saveTStoKoordinat();
    }

    @Test
    public void testTtwifiMttr() throws Exception {
        systemService.saveTtwifiMttr();
    }

    @Test
    public void testTPerfEnterprise4tiocRepository() throws Exception {
        systemService.saveTPerfEnterprise4tiocRepository();
    }


}




