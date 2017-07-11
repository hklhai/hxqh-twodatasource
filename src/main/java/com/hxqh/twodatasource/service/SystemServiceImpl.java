package com.hxqh.twodatasource.service;

import com.hxqh.twodatasource.common.StaticUtils;
import com.hxqh.twodatasource.repository.primary.Openstreetmap;
import com.hxqh.twodatasource.repository.primary.OpenstreetmapRepository;
import com.hxqh.twodatasource.repository.second.TStoKoordinat;
import com.hxqh.twodatasource.repository.second.TStoKoordinatRepository;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Ocean lin on 2017/7/9.
 */
@Service("systemService")
public class SystemServiceImpl implements SystemService {

    @Autowired
    private OpenstreetmapRepository openstreetmapRepository;
    @Autowired
    private TStoKoordinatRepository tStoKoordinatRepository;

    @Transactional
    @Override
    public void openStreetMap() throws InvocationTargetException, IllegalAccessException {
        openstreetmapRepository.deleteAll();
        List<TStoKoordinat> stoKoordinatList = tStoKoordinatRepository.getData();
        List<Openstreetmap> openstreetmapList = new ArrayList<>();
        for (TStoKoordinat koordinat : stoKoordinatList) {
            Openstreetmap openstreetmap = new Openstreetmap();
            BeanUtils.copyProperties(openstreetmap, koordinat);
            //设置特定值
            openstreetmap.setName(koordinat.getNodeId());
            openstreetmap.setDescription(koordinat.getManufacture());
            openstreetmap.setMapy(String.valueOf(koordinat.getLat()));
            openstreetmap.setMapx(String.valueOf(koordinat.getLong_()));
            openstreetmap.setOpentype(StaticUtils.getMap().get(koordinat.getFunct()));

            openstreetmap.setShow(1);
            String timeFormat = StaticUtils.getDateTimeFormat(new Date());
            openstreetmap.setTs(timeFormat);
            //加入List
            openstreetmapList.add(openstreetmap);
        }
        openstreetmapRepository.save(openstreetmapList);

    }

    @Override
    public void saveOpenstreetmap(Openstreetmap openstreetmap) {
        openstreetmapRepository.save(openstreetmap);
    }

    @Override
    public void save(List<Openstreetmap> openstreetmapList) {
        openstreetmapRepository.save(openstreetmapList);
    }


//    @Autowired
//    private UserPrimaryRepository userDao;
//
//    public PrimaryUser findUserById(String name)
//    {
//        return userDao.findUserById(name);
//    }

}
