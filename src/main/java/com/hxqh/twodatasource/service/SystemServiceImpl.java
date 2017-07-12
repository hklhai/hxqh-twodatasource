package com.hxqh.twodatasource.service;

import com.hxqh.twodatasource.repository.primary.*;
import com.hxqh.twodatasource.repository.second.*;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Ocean lin on 2017/7/9.
 */
@Service("systemService")
public class SystemServiceImpl implements SystemService {

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
    public void saveAlertEnvs() throws InvocationTargetException, IllegalAccessException {
        List<TAlertEnv> tAlertEnvs = alertEnvRepository.findAll();
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

    @Transactional
    @Override
    public void saveTtwifiMonitor() throws Exception {
        List<TtwifiMonitorMttrProactive> monitorMttrProactiveList = ttwifiMonitorRepository.findAll();

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
        List<Loctperfenterprise4tioc> maxDateData = loctperfenterprise4tiocRepository.findMaxDateData();
        Loctperfenterprise4tioc tioc = null;
        if (maxDateData.size()==0) {//maxDateData.getIoctperfenterpriseid()!=null&&maxDateData.getAdddate()!=null
            //从MYSQL 中查询数据
            if(maxDateData.size()>=1)
            {
                tioc = maxDateData.get(0);
            }
            List<TPerfEnterprise4tioc> perfEnterprise4tiocList = enterprise4tiocRepository.findData(tioc.geteRsiTimedata());

            List<Loctperfenterprise4tioc> loctperfenterprise4tiocs = new ArrayList<>();
            dealData(perfEnterprise4tiocList, loctperfenterprise4tiocs);
            loctperfenterprise4tiocRepository.save(loctperfenterprise4tiocs);
        } else {
            List<TPerfEnterprise4tioc> perfEnterprise4tiocList = enterprise4tiocRepository.findAllDataTEST();
//            List<TPerfEnterprise4tioc> perfEnterprise4tiocList = enterprise4tiocRepository.findAllData();
            List<Loctperfenterprise4tioc> loctperfenterprise4tiocs = new ArrayList<>();
            dealData(perfEnterprise4tiocList, loctperfenterprise4tiocs);
            loctperfenterprise4tiocRepository.save(loctperfenterprise4tiocs);
        }
    }

    private void dealData(List<TPerfEnterprise4tioc> perfEnterprise4tiocList, List<Loctperfenterprise4tioc> loctperfenterprise4tiocs) throws IllegalAccessException, InvocationTargetException {
        for (TPerfEnterprise4tioc tPerfEnterprise4tioc : perfEnterprise4tiocList) {
            Loctperfenterprise4tioc tioc = new Loctperfenterprise4tioc();
            BeanUtils.copyProperties(tioc, tPerfEnterprise4tioc.gettPerfEnterprise4tiocKey());

            tioc.seteRsiTimedata(tPerfEnterprise4tioc.geteRsiTimedata());
            tioc.setAdddate(new Date());

            tioc.setCusttype(tPerfEnterprise4tioc.gettPerfEnterprise4tiocKey().getCusttype());
            tioc.seteRsiBitspersecondin(BigDecimal.valueOf(tPerfEnterprise4tioc.gettPerfEnterprise4tiocKey().getErsibitspersecondin()));
            tioc.seteRsiBitspersecondout(BigDecimal.valueOf(tPerfEnterprise4tioc.gettPerfEnterprise4tiocKey().getErsibitspersecondout()));

            loctperfenterprise4tiocs.add(tioc);
        }
    }

}
