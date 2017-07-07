package com.hxqh.twodatasource.test;

import com.hxqh.twodatasource.repository.primary.PrimaryUser;
import com.hxqh.twodatasource.repository.primary.UserPrimaryRepository;
import com.hxqh.twodatasource.repository.second.SecondUser;
import com.hxqh.twodatasource.repository.second.UserSecondRepository;
import org.junit.Assert;
import org.junit.Before;
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
    private UserPrimaryRepository userPrimaryRepository;
    @Autowired
    private UserSecondRepository userSecondRepository;

    @Before
    public void setUp() {
    }

    @Test
    public void test() throws Exception {

        PrimaryUser primaryUser = new PrimaryUser("dd","12345");
        userPrimaryRepository.save(primaryUser);
        Assert.assertTrue(userPrimaryRepository.findAll().size()>1);

        SecondUser hk = userSecondRepository.findUserById("hk");
        Assert.assertEquals("hk", hk.getName());

    }
}
