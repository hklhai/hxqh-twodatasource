package com.hxqh.twodatasource.service;


import com.hxqh.twodatasource.repository.primary.Openstreetmap;
import com.hxqh.twodatasource.repository.second.*;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * Created by Ocean lin on 2017/7/1.
 */

public interface SystemService {

    void openStreetMap() throws InvocationTargetException, IllegalAccessException;

    void saveOpenstreetmap(Openstreetmap openstreetmap);

    void save(List<Openstreetmap> openstreetmapList);

    void saveAlertEnvs(List<TAlertEnv> tAlertEnvs) throws InvocationTargetException, IllegalAccessException;

    void saveEnterpriseCusts(List<TLvlEnterpriseCust> tLvlEnterpriseCusts) throws Exception;

    void saveTtwifiMonitor(List<TtwifiMonitorMttrProactive> monitorMttrProactiveList) throws Exception;

    void saveTPortdown(List<TPortdown4ioc> tPortdown4iocRepositoryAll) throws Exception;

    void saveTtwifiMttr(List<TtwifiMttrProactiveLastMonth> mttrProactiveLastMonthList) throws Exception;

    void saveTStoKoordinat(List<TStoKoordinat> tStoKoordinatList) throws Exception;

    void saveTPerfEnterprise4tiocRepository() throws Exception;
}
