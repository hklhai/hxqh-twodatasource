package com.hxqh.twodatasource.service;

import com.hxqh.twodatasource.repository.primary.OpenstreetmapRepository;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Ocean lin on 2017/7/9.
 */
@Service("systemService")
@Transactional
public class SystemServiceImpl implements SystemService {

    @Autowired
    private OpenstreetmapRepository openstreetmapRepository;

    @Override
    public void openStreetMap() {
        openstreetmapRepository.deleteAll();
//        BeanUtils.copyProperties();

    }

//    @Autowired
//    private UserPrimaryRepository userDao;
//
//    public PrimaryUser findUserById(String name)
//    {
//        return userDao.findUserById(name);
//    }

}