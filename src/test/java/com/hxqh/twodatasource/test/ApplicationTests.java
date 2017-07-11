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
    @Autowired
    private TAlertEnvRepository alertEnvRepository;
    @Autowired
    private TLvlEnterpriseCustRepository tLvlEnterpriseCustRepository;
    @Autowired
    private TtwifiMonitorRepository ttwifiMonitorRepository;
    @Autowired
    private TPortdown4iocRepository tPortdown4iocRepository;
    @Autowired
    private TtwifiMttrProactiveRepository ttwifiMttrProactiveRepository;
    @Autowired
    private TStoKoordinatRepository tStoKoordinatRepository;



    @Test
    public void testTAlertEnv() throws Exception {
        List<TAlertEnv> tAlertEnvs = alertEnvRepository.findAll();
        systemService.saveAlertEnvs(tAlertEnvs);
    }

    @Test
    public void testSaveTLvlEnterpriseCust() throws Exception {
        List<TLvlEnterpriseCust> tLvlEnterpriseCusts = tLvlEnterpriseCustRepository.findAll();
        if (tLvlEnterpriseCusts != null) {
            systemService.saveEnterpriseCusts(tLvlEnterpriseCusts);
        }
    }

    @Test
    public void testProactive() throws Exception {
        List<TtwifiMonitorMttrProactive> monitorMttrProactiveList = ttwifiMonitorRepository.findAll();
        systemService.saveTtwifiMonitor(monitorMttrProactiveList);
    }

    @Test
    public void testTPortdown4ioc() throws Exception {
        List<TPortdown4ioc> tPortdown4iocRepositoryAll = tPortdown4iocRepository.findAll();
        systemService.saveTPortdown(tPortdown4iocRepositoryAll);
    }

    @Test
    public void testTtwifiMttr() throws Exception {
        List<TtwifiMttrProactiveLastMonth> mttrProactiveLastMonthList = ttwifiMttrProactiveRepository.findAll();
        systemService.saveTtwifiMttr(mttrProactiveLastMonthList);
    }

    @Test
    public void testTStoKoordinat() throws Exception {
        List<TStoKoordinat> tStoKoordinatList = tStoKoordinatRepository.findAll();
        systemService.saveTStoKoordinat(tStoKoordinatList);
    }

    @Test
    public void testTPerfEnterprise4tiocRepository() throws Exception {
        systemService.saveTPerfEnterprise4tiocRepository();
    }


}




