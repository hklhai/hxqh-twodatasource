package com.hxqh.twodatasource.service;


import com.hxqh.twodatasource.repository.primary.UserPrimaryRepository;
import com.hxqh.twodatasource.repository.primary.PrimaryUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Ocean lin on 2017/7/1.
 */
@Service("systemService")
public class SystemService {

    @Autowired
    private UserPrimaryRepository userDao;

    public PrimaryUser findUserById(String name)
    {
        return userDao.findUserById(name);
    }


}
