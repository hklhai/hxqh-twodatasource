package com.hxqh.twodatasource.service;

import com.hxqh.twodatasource.common.ListUtils;
import com.hxqh.twodatasource.pojo.GroupNode;
import com.hxqh.twodatasource.repository.primary.*;
import com.hxqh.twodatasource.repository.second.*;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Ocean lin on 2017/7/9.
 */
@Service("systemService")
public class SystemServiceImpl implements SystemService {

    static Logger logger = Logger.getLogger(SystemServiceImpl.class);


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
    @Autowired
    private TbIocConsumerVoiceTrafficRepository tbIocConsumerVoiceTrafficRepository;
    @Autowired
    private TbIocMobileBackHaulTtcRepository tbIocMobileBackHaulTtcRepository;
    @Autowired
    private TbIocMobileIpTransitRepository tbIocMobileIpTransitRepository;

    @Autowired
    private TbFfmAchievementRepository tbFfmAchievementRepository;
    @Autowired
    private TbFfmRepository tbFfmRepository;

    @Autowired
    private IocConsumerVoiceSourceRepository iocConsumerVoiceSourceRepository;

    @Autowired
    private TbEnterpriseProactiveRepository tbEnterpriseProactiveRepository;


    @Autowired
    private IocConsumerVoiceSourceChristmasRepository iocConsumerVoiceSourceChristmasRepository;

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
    @Autowired
    private SipeteVIsTgSsDailyRepository sipeteVIsTgSsDailyRepository;
    @Autowired
    private TTselAggTopolgyRepository tTselAggTopolgyRepository;
    @Autowired
    private TIxtsel4iocRepository tIxtsel4iocRepository;
    @Autowired
    private VFfmRepository vFfmRepository;
    @Autowired
    private VFfmAchievementRepository vFfmAchievementRepository;
    @Autowired
    private VEnterpriseProactiveRepository enterpriseProactiveRepository;

    /***************************MYSQL********************************/


    @Transactional
    @Override
    public void saveAlertEnvs() throws InvocationTargetException, IllegalAccessException {
        List<TAlertEnv> tAlertEnvs = alertEnvRepository.findAll();
        if (tAlertEnvs != null) {
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
        logger.info(" t_alert_env-->TB_IOCENTERPRISEEVENT");
    }

    @Transactional
    @Override
    public void saveEnterpriseCusts() throws Exception {

        List<TLvlEnterpriseCust> tLvlEnterpriseCusts = tLvlEnterpriseCustRepository.findAll();
        if (tLvlEnterpriseCusts != null) {
            List<Loccustomeruser> loccustomeruserList = new ArrayList<>();
            for (TLvlEnterpriseCust cust : tLvlEnterpriseCusts) {
                if (cust != null) {
                    Loccustomeruser loccustomeruser = new Loccustomeruser();
                    BeanUtils.copyProperties(loccustomeruser, cust);
                    loccustomeruser.setAdddate(new Date());
                    loccustomeruserList.add(loccustomeruser);
                }
            }
            loccustomeruserRepository.deleteAll();
            loccustomeruserRepository.save(loccustomeruserList);
        }
        logger.info(" v_lvl_enterprise_cust-->TB_IOCCUSTOMERUSER");
    }

    @Transactional
    @Override
    public void saveTtwifiMonitor() throws Exception {
        List<TtwifiMonitorMttrProactive> monitorMttrProactiveList = ttwifiMonitorRepository.findAll();
        if (monitorMttrProactiveList != null) {

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
        logger.info(" ttwifi_monitor_mttr_proactive-->TB_IOCTICKETSCREEN100");
    }

    @Transactional
    @Override
    public void saveTPortdown() throws Exception {
        List<TPortdown4ioc> tPortdown4iocRepositoryAll = tPortdown4iocRepository.findAll();
        if (tPortdown4iocRepositoryAll != null) {
            List<Loctportdown4ioc> loctportdown4iocs = new ArrayList<>();
            for (TPortdown4ioc portdown4ioc : tPortdown4iocRepositoryAll) {
                Loctportdown4ioc ioc = new Loctportdown4ioc();
                BeanUtils.copyProperties(ioc, portdown4ioc.gettPortdown4iocKey());
                ioc.setAdddate(new Date());
                ioc.setIocinterface(portdown4ioc.gettPortdown4iocKey().getInterface_());
                loctportdown4iocs.add(ioc);
            }
            loctportdown4iocRepository.deleteAll();
            loctportdown4iocRepository.save(loctportdown4iocs);
        }
        logger.info(" v_portdown_4ioc-->TB_IOCTPORTDOWN4IOC");

    }

    @Transactional
    @Override
    public void saveTtwifiMttr() throws Exception {
        List<TtwifiMttrProactiveLastMonth> mttrProactiveLastMonthList = ttwifiMttrProactiveRepository.findAll();
        if (mttrProactiveLastMonthList != null) {
            List<Locticketscreen96> locticketscreen96s = new ArrayList<>();
            for (TtwifiMttrProactiveLastMonth mttrProactiveLastMonth : mttrProactiveLastMonthList) {
                Locticketscreen96 ioc = new Locticketscreen96();
                BeanUtils.copyProperties(ioc, mttrProactiveLastMonth.getTtwifiMttrProactiveKey());
                ioc.setAdddate(new Date());
                ioc.setAggts(mttrProactiveLastMonth.getTtwifiMttrProactiveKey().getLastupdate());
                locticketscreen96s.add(ioc);
            }
            locticketscreen96Repository.deleteAll();
            locticketscreen96Repository.save(locticketscreen96s);
        }
        logger.info(" ttwifi_mttr_proactive_last_month-->TB_IOCTICKETSCREEN96");

    }

    @Transactional
    @Override
    public void saveTStoKoordinat() throws Exception {
        List<TStoKoordinat> tStoKoordinatList = tStoKoordinatRepository.findAll();
        if (tStoKoordinatList != null) {
            List<Openstreetmap> openstreetmapList = new ArrayList<>();
            for (TStoKoordinat tStoKoordinat : tStoKoordinatList) {
                Openstreetmap openstreetmap = new Openstreetmap();
                BeanUtils.copyProperties(openstreetmap, tStoKoordinat.gettStoKoordinatKey());
                openstreetmap.setAdddate(new Date());
                //手动设置经纬度，因规避关键字
                openstreetmap.setLatitude(BigDecimal.valueOf(tStoKoordinat.gettStoKoordinatKey().getLat()));
                openstreetmap.setLongitude(BigDecimal.valueOf(tStoKoordinat.gettStoKoordinatKey().getLong_()));
                openstreetmap.setShow(1);
                openstreetmap.setStatus("Up");
                openstreetmapList.add(openstreetmap);
            }
            openstreetmapRepository.deleteAll();
            openstreetmapRepository.save(openstreetmapList);
        }
        logger.info(" t_sto_koordinat-->TB_IOC_CENTER_MAP");

    }

    @Override
    public GroupNode getEnterprise4tiocMax() {
        BigDecimal mysqlStart = enterprise4tiocRepository.findMinSQLId();
        BigDecimal mysqlEnd = enterprise4tiocRepository.findMaxSQLId();
        BigDecimal oracleEnd = loctperfenterprise4tiocRepository.findMaxMySQLId();

        GroupNode node = new GroupNode(mysqlStart, mysqlEnd, oracleEnd);
        return node;
    }

    @Transactional
    @Override
    public void saveTPerfEnterprise4tiocRepository(BigDecimal tmp, BigDecimal addVal) throws Exception {
        List<TPerfEnterprise4tioc> perfEnterprise4tiocList = enterprise4tiocRepository.findData(tmp, addVal);
        List<Loctperfenterprise4tioc> loctperfenterprise4tiocs = new ArrayList<>();
        dealData(perfEnterprise4tiocList, loctperfenterprise4tiocs);
        loctperfenterprise4tiocRepository.save(loctperfenterprise4tiocs);
        logger.info(" v_perf_enterprise_4tioc1-->TB_IOC_ENT_4TIOC " + tmp + "->" + addVal);
    }

    @Override
    public Long getEnterprise4tiocLength(BigDecimal tmp, BigDecimal addVal) {
        return enterprise4tiocRepository.getEnterprise4tiocLength(tmp, addVal);
    }

    private void dealData(List<TPerfEnterprise4tioc> perfEnterprise4tiocList, List<Loctperfenterprise4tioc> loctperfenterprise4tiocs) throws IllegalAccessException, InvocationTargetException {
        for (TPerfEnterprise4tioc tPerfEnterprise4tioc : perfEnterprise4tiocList) {
            Loctperfenterprise4tioc tioc = new Loctperfenterprise4tioc();
            BeanUtils.copyProperties(tioc, tPerfEnterprise4tioc);

            tioc.seteRsiTimedata(tPerfEnterprise4tioc.geteRsiTimedata());
            tioc.setAdddate(new Date());

            tioc.setCusttype(tPerfEnterprise4tioc.getCusttype());
            tioc.seteRsiBitspersecondin(BigDecimal.valueOf(tPerfEnterprise4tioc.getErsibitspersecondin()));
            tioc.seteRsiBitspersecondout(BigDecimal.valueOf(tPerfEnterprise4tioc.getErsibitspersecondout()));

            loctperfenterprise4tiocs.add(tioc);
        }
    }

    @Override
    public void analysis_source_ent_4tioc1() {
        loctperfenterprise4tiocRepository.analysis_source_ent_4tioc1();
    }

    @Override
    public void analysis_data_event_altenv() {
        locenterpriseeventRepository.analysis_data_event_altenv();
    }

    @Override
    public void analysis_source_portdown() {
        loctportdown4iocRepository.analysis_source_portdown();
    }

    @Override
    public void analysis_data_mttr_proactive() {
        locticketscreen100Repository.analysis_data_mttr_proactive();
    }

    @Override
    public void analysis_data_mttr_targets() {
        locticketscreen96Repository.analysis_data_mttr_targets();
    }

    @Override
    public void analysis_data_cust_for_dws() {
        loccustomeruserRepository.analysis_data_cust_for_dws();
    }


    //  sipete_v_is_tg_ss_daily --> TB_IOC_CONSUMER_CHRISTMAS
    @Transactional
    @Override
    public void iocConsumerVoiceSourceForChristmas() throws InvocationTargetException, IllegalAccessException {
        List<SipeteVIsTgSsDaily> vIsTgSsDailyList = sipeteVIsTgSsDailyRepository.findAll();

        // 完全清除Oracle  TB_IOC_CONSUMER_CHRISTMAS表数据
        tbIocConsumerVoiceTrafficRepository.p_truncate_tb_ioc_consumer_christmas();

        if (vIsTgSsDailyList != null) {
            List<IocConsumerVoiceSourceChristmas> voiceSourceList = new LinkedList<>();
            for (SipeteVIsTgSsDaily s : vIsTgSsDailyList) {
                IocConsumerVoiceSourceChristmas voiceSource = new IocConsumerVoiceSourceChristmas();
                BeanUtils.copyProperties(voiceSource, s.getSipeteVIsTgSsDailyKey());
                voiceSource.setTs(new Date());
                voiceSourceList.add(voiceSource);
            }
            //拆分List
            List<List<IocConsumerVoiceSourceChristmas>> split = ListUtils.split(voiceSourceList, 1000);
            for (int i = 0; i < split.size(); i++) {
                iocConsumerVoiceSourceChristmasRepository.save(split.get(i));
            }

        }
    }

    @Transactional
    @Override
    public void saveIocConsumerVoiceSource() throws InvocationTargetException, IllegalAccessException {
        List<SipeteVIsTgSsDaily> vIsTgSsDailyList = sipeteVIsTgSsDailyRepository.findAll();
        if (vIsTgSsDailyList != null) {
            List<IocConsumerVoiceSource> voiceSourceList = new LinkedList<>();
            for (SipeteVIsTgSsDaily s : vIsTgSsDailyList) {
                IocConsumerVoiceSource voiceSource = new IocConsumerVoiceSource();
                BeanUtils.copyProperties(voiceSource, s.getSipeteVIsTgSsDailyKey());
                voiceSource.setTs(new Date());
                voiceSourceList.add(voiceSource);
            }
            //拆分List
            List<List<IocConsumerVoiceSource>> split = ListUtils.split(voiceSourceList, 1000);
            for (int i = 0; i < split.size(); i++) {
                iocConsumerVoiceSourceRepository.save(split.get(i));
            }

        }
    }


    /**
     * 2017-12-21 16:25:39  lh  未使用
     * <p>
     * Add By Hy Chang Area Start
     */
    @Transactional
    @Override
    public void saveSipeteVIsTgSsDailyRepository() throws InvocationTargetException, IllegalAccessException {
        List<SipeteVIsTgSsDaily> vIsTgSsDailyList = sipeteVIsTgSsDailyRepository.findAll();

        if (vIsTgSsDailyList != null) {
            List<TbIocConsumerVoiceTraffic> iocConsumerVoiceTrafficList = new ArrayList<>();
            for (SipeteVIsTgSsDaily s : vIsTgSsDailyList) {
                TbIocConsumerVoiceTraffic tbIocConsumerVoiceTraffic = new TbIocConsumerVoiceTraffic();
                BeanUtils.copyProperties(tbIocConsumerVoiceTraffic, s.getSipeteVIsTgSsDailyKey());
                tbIocConsumerVoiceTraffic.setTs(new Date());
                iocConsumerVoiceTrafficList.add(tbIocConsumerVoiceTraffic);
            }
            //因为业务需要不删除数据
            tbIocConsumerVoiceTrafficRepository.save(iocConsumerVoiceTrafficList);
        }
//        tbIocConsumerVoiceTrafficRepository.analysis_data_consumer_voice();
        logger.info(" sipete_v_is_tg_ss_daily-->TB_IOC_CONSUMER_VOICE_SOURCE");
    }


    @Transactional
    @Override
    public void saveMOBILE_BACKHAUL_TTCRepository() throws InvocationTargetException, IllegalAccessException {
        List<TTselAggTopolgy> vIsTgSsDailyList = tTselAggTopolgyRepository.findAll();
        if (vIsTgSsDailyList.size() > 0) {
            List<TbIocMobileBackhaulTtc> backhaulTtcList = new ArrayList<>();
            for (TTselAggTopolgy tt : vIsTgSsDailyList) {
                TbIocMobileBackhaulTtc ttc = new TbIocMobileBackhaulTtc();
                BeanUtils.copyProperties(ttc, tt.gettTselAggTopolgyKey());
                ttc.setTs(new Date());
                ttc.setWrong(BigDecimal.valueOf(tt.gettTselAggTopolgyKey().getErrors()));
                backhaulTtcList.add(ttc);
            }
            tbIocMobileBackHaulTtcRepository.deleteAll();
            tbIocMobileBackHaulTtcRepository.save(backhaulTtcList);
        }
        tbIocConsumerVoiceTrafficRepository.analysis_data_mobile_back_ttc();
        logger.info(" t_tsel_agg_topolgy-->TB_IOC_MOB_BACKHAUL_TTC_SOURCE");
    }

    /**
     * modify lh 2017-9-26 06:57:55
     *
     * @param ipTransits
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    @Transactional
    @Override
    public void save_mobile_ip_transitRepository(List<TbIocMobileIpTransit> ipTransits) throws InvocationTargetException, IllegalAccessException {
        tbIocMobileIpTransitRepository.save(ipTransits);
        logger.info(" v_ixtsel_4ioc-->TB_IOC_MOBILE_IPTRANSIT_SOURCE-->" + ipTransits.get(0).getIpid());
    }

    @Override
    public void analysis_data_mobile_ip_trans() {
        tbIocConsumerVoiceTrafficRepository.analysis_data_mobile_ip_trans();
        logger.info(" v_ixtsel_4ioc-->TB_IOC_MOBILE_IPTRANSIT_SOURCE-->analysis_data_mobile_ip_trans");
    }


    /****Add bY Hy Chang Area End****/


    @Override
    public void testTruncate() {
        tbIocConsumerVoiceTrafficRepository.p_truncate_twodatasource_trun_TB_USER();
    }

    @Override
    public void analysis_data_consumer_voice() {
        tbIocConsumerVoiceTrafficRepository.analysis_data_consumer_voice();
    }

    @Transactional
    @Override
    public void saveVFfm() throws InvocationTargetException, IllegalAccessException {
        List<VFfm> vFfmList = vFfmRepository.findAll();
        List<TbFfm> ffmList = new ArrayList<>();
        if (vFfmList.size() > 0) {
            for (int i = 0; i < vFfmList.size(); i++) {
                TbFfm ffm = new TbFfm();
                BeanUtils.copyProperties(ffm, vFfmList.get(i).getvFfmKey());
                ffm.setAdddate(new Date());
                ffmList.add(ffm);
            }
        }
        tbIocConsumerVoiceTrafficRepository.p_truncate_twodatasource_trun_tb_ffm();
        tbFfmRepository.save(ffmList);
        //调用存储过程
//        tbIocConsumerVoiceTrafficRepository.analysis_data_pro_ticket();
        logger.info(" v_ffm --->tb_ioc_pro_ticket --->Analysis_Data_PRO_TICKET ");
    }

    @Transactional
    @Override
    public void saveVFfmAchievement() throws InvocationTargetException, IllegalAccessException {
        List<VFfmAchievement> vFfmAchievementList = vFfmAchievementRepository.findAll();
        List<TbFfmAchievement> vFfmAchievements = new ArrayList<>();
        if (vFfmAchievementList.size() > 0) {
            for (int i = 0; i < vFfmAchievementList.size(); i++) {
                TbFfmAchievement tbFfmAchievement = new TbFfmAchievement();
                BeanUtils.copyProperties(tbFfmAchievement, vFfmAchievementList.get(i).getvFfmAchievementKey());
                tbFfmAchievement.setAdddate(new Date());
                vFfmAchievements.add(tbFfmAchievement);
            }
            tbIocConsumerVoiceTrafficRepository.p_truncate_twodatasource_trun_tb_ffm_achievement();
            tbFfmAchievementRepository.save(vFfmAchievements);
        }
        //调用存储过程
        tbIocConsumerVoiceTrafficRepository.analysis_data_pro_ticket_ffm();
        logger.info(" v_ffm_achievement-->TB_IOC_PRO_TICKET_FFM--->Analysis_Data_PRO_TICKET_FFM");
    }

    @Override
    public void analysis_data_pro_ticket() {
        tbIocConsumerVoiceTrafficRepository.analysis_data_pro_ticket();
    }

    @Override
    public void analysis_data_pro_ticket_ffm() {
        tbIocConsumerVoiceTrafficRepository.analysis_data_pro_ticket_ffm();
    }

    @Override
    public void saveentErpriseProactive() throws InvocationTargetException, IllegalAccessException {
        List<VEnterpriseProactive> exportData = new ArrayList<>();
        List<TbEnterpriseProactive> enterpriseProactiveList = new ArrayList<>();


        // 查询Oracle中最大的mid值
        Long maxSQLId = tbEnterpriseProactiveRepository.findMaxSQLId();
        // 如果不为null查询mysql大于该mid的值
        if (null != maxSQLId) {
            exportData = enterpriseProactiveRepository.findExportData(maxSQLId);
        } else {
            exportData = enterpriseProactiveRepository.findAll();
        }
        if (exportData.size() > 0) {
            for (int i = 0; i < exportData.size(); i++) {
                TbEnterpriseProactive tbEnterpriseProactive = new TbEnterpriseProactive();
                BeanUtils.copyProperties(tbEnterpriseProactive, exportData.get(i));
                tbEnterpriseProactive.setAddtime(new Date());
                tbEnterpriseProactive.setMid(exportData.get(i).getId());
                enterpriseProactiveList.add(tbEnterpriseProactive);
            }
            tbEnterpriseProactiveRepository.save(enterpriseProactiveList);
            logger.info(" v_enterprise_proactive--->TB_ENTERPRISE_PROACTIVE ");
        }
    }


}
