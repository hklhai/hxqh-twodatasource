package com.hxqh.twodatasource.service;

import com.hxqh.twodatasource.repository.primary.*;
import com.hxqh.twodatasource.repository.second.*;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
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
    private TStoKoordinatRepository tStoKoordinatRepository;
    @Autowired
    private LocenterpriseeventRepository locenterpriseeventRepository;
    @Autowired
    private LoccustomeruserRepository loccustomeruserRepository;
    @Autowired
    private Locticketscreen100Repository locticketscreen100Repository;
    @Autowired
    private Loctportdown4iocRepository loctportdown4iocRepository;
    @Autowired
    private Locticketscreen96Repository locticketscreen96Repository;
    @Autowired
    private OpenstreetmapRepository openstreetmapRepository;
    @Autowired
    private Loctperfenterprise4tiocRepository loctperfenterprise4tiocRepository;

    /***************************MYSQL********************************/
    @Autowired
    private TPerfEnterprise4tiocRepository enterprise4tiocRepository;

    /***************************MYSQL********************************/

    @Transactional
    @Override
    public void openStreetMap() throws InvocationTargetException, IllegalAccessException {

    }

    @Override
    public void saveOpenstreetmap(Openstreetmap openstreetmap) {
        openstreetmapRepository.save(openstreetmap);
    }

    @Override
    public void save(List<Openstreetmap> openstreetmapList) {
        openstreetmapRepository.save(openstreetmapList);
    }

    @Transactional
    @Override
    public void saveAlertEnvs(List<TAlertEnv> tAlertEnvs) throws InvocationTargetException, IllegalAccessException {
        List<Locenterpriseevent> locenterpriseeventList = new ArrayList<>();
        for (TAlertEnv env : tAlertEnvs) {
            Locenterpriseevent locenterpriseevent = new Locenterpriseevent();
            BeanUtils.copyProperties(locenterpriseevent, env.gettAlertEnvKey());
            locenterpriseevent.setAdddate(new Date());
            locenterpriseeventList.add(locenterpriseevent);
        }
        locenterpriseeventRepository.deleteAll();
        locenterpriseeventRepository.save(locenterpriseeventList);
    }

    @Transactional
    @Override
    public void saveEnterpriseCusts(List<TLvlEnterpriseCust> tLvlEnterpriseCusts) throws Exception {
        List<Loccustomeruser> loccustomeruserList = new ArrayList<>();
        for (TLvlEnterpriseCust cust : tLvlEnterpriseCusts) {
            if (cust != null) {
                Loccustomeruser loccustomeruser = new Loccustomeruser();
                BeanUtils.copyProperties(loccustomeruser, cust.gettLvlEnterpriseCustKey());
                loccustomeruser.setAdddate(new Date());
                loccustomeruserList.add(loccustomeruser);
            }
        }
        loccustomeruserRepository.deleteAll();
        loccustomeruserRepository.save(loccustomeruserList);
    }

    @Override
    public void saveTtwifiMonitor(List<TtwifiMonitorMttrProactive> monitorMttrProactiveList) throws Exception {
        List<Locticketscreen100> locticketscreen100List = new ArrayList<>();
        for (TtwifiMonitorMttrProactive proactive : monitorMttrProactiveList) {
            Locticketscreen100 locticketscreen100 = new Locticketscreen100();
            BeanUtils.copyProperties(locticketscreen100, proactive.getTtwifiMonitorKey());
            locticketscreen100.setAdddate(new Date());
            locticketscreen100List.add(locticketscreen100);
        }
        locticketscreen100Repository.deleteAll();
        locticketscreen100Repository.save(locticketscreen100List);
    }

    @Override
    public void saveTPortdown(List<TPortdown4ioc> tPortdown4iocRepositoryAll) throws Exception {
        List<Loctportdown4ioc> loctportdown4iocs = new ArrayList<>();
        for (TPortdown4ioc portdown4ioc : tPortdown4iocRepositoryAll) {
            Loctportdown4ioc ioc = new Loctportdown4ioc();
            BeanUtils.copyProperties(ioc, portdown4ioc.gettPortdown4iocKey());
            ioc.setAdddate(new Date());
            loctportdown4iocs.add(ioc);
        }
        loctportdown4iocRepository.deleteAll();
        loctportdown4iocRepository.save(loctportdown4iocs);
    }

    @Override
    public void saveTtwifiMttr(List<TtwifiMttrProactiveLastMonth> mttrProactiveLastMonthList) throws Exception {
        List<Locticketscreen96> locticketscreen96s = new ArrayList<>();
        for (TtwifiMttrProactiveLastMonth mttrProactiveLastMonth : mttrProactiveLastMonthList) {
            Locticketscreen96 ioc = new Locticketscreen96();
            BeanUtils.copyProperties(ioc, mttrProactiveLastMonth.getTtwifiMttrProactiveKey());
            ioc.setAdddate(new Date());
            locticketscreen96s.add(ioc);
        }
        locticketscreen96Repository.deleteAll();
        locticketscreen96Repository.save(locticketscreen96s);
    }

    @Override
    public void saveTStoKoordinat(List<TStoKoordinat> tStoKoordinatList) throws Exception {
        List<Openstreetmap> openstreetmapList = new ArrayList<>();
        for (TStoKoordinat tStoKoordinat : tStoKoordinatList) {
            Openstreetmap openstreetmap = new Openstreetmap();
            BeanUtils.copyProperties(openstreetmap, tStoKoordinat.gettStoKoordinatKey());
            openstreetmap.setAdddate(new Date());
            openstreetmapList.add(openstreetmap);
        }
        openstreetmapRepository.deleteAll();
        openstreetmapRepository.save(openstreetmapList);
    }

    @Override
    public void saveTPerfEnterprise4tiocRepository() throws Exception {

        //查询当前最大值
        Loctperfenterprise4tioc maxDateData = loctperfenterprise4tiocRepository.findMaxDateData();
        if(maxDateData.getIoctperfenterpriseid()!=null)
        {

            List<TPerfEnterprise4tioc> perfEnterprise4tiocList = enterprise4tiocRepository.findAllData(maxDateData);

            List<Loctperfenterprise4tioc> loctperfenterprise4tiocs = new ArrayList<>();
            for (TPerfEnterprise4tioc  tPerfEnterprise4tioc: perfEnterprise4tiocList) {
                Loctperfenterprise4tioc tioc = new Loctperfenterprise4tioc();
                BeanUtils.copyProperties(tioc, tPerfEnterprise4tioc.gettPerfEnterprise4tiocKey());
                tioc.setAdddate(new Date());
                loctperfenterprise4tiocs.add(tioc);
            }
            loctperfenterprise4tiocRepository.save(loctperfenterprise4tiocs);
        }
    }

}
