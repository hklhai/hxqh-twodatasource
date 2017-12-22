package com.hxqh.twodatasource.repository.second;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Hy Chang on 2017/7/17.
 */
@Repository
public interface SipeteVIsTgSsDailyRepository extends JpaRepository<SipeteVIsTgSsDaily, SipeteVIsTgSsDailyKey> {

    @Query("select max(o.id) from SipeteVIsTgSsDaily o")
    Long findMaxMySQLId();

    @Query("select o from SipeteVIsTgSsDaily o where o.id between ?1 and  ?2")
    List<SipeteVIsTgSsDaily> findStartAndEndData(Long min, Long max);

}
