package com.hxqh.twodatasource.test;

import com.hxqh.twodatasource.common.StaticUtils;
import com.hxqh.twodatasource.repository.primary.Openstreetmap;
import com.hxqh.twodatasource.repository.second.TStoKoordinat;
import com.hxqh.twodatasource.repository.second.TStoKoordinatRepository;
import com.hxqh.twodatasource.service.SystemService;
import org.apache.commons.beanutils.BeanUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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
    private TStoKoordinatRepository tStoKoordinatRepository;
    @Autowired
    private SystemService systemService;

    @Before
    public void setUp() {

    }

    @Test
    public void testInsert() throws Exception {
//        Openstreetmap openstreetmap = new Openstreetmap();
//        openstreetmap.setName("XXX");
//        systemService.saveOpenstreetmap(openstreetmap);

//        List<TStoKoordinat> stoKoordinatList = tStoKoordinatRepository.getData();
//        Assert.assertTrue(stoKoordinatList.size()>10);
    }


    @Test
    public void test() throws Exception {

//        PrimaryUser primaryUser = new PrimaryUser("dd","12345");
//        userPrimaryRepository.save(primaryUser);
//        Assert.assertTrue(userPrimaryRepository.findAll().size()>1);
//
//        SecondUser hk = userSecondRepository.findUserById("hk");
//        Assert.assertEquals("hk", hk.getName());



    }
}




