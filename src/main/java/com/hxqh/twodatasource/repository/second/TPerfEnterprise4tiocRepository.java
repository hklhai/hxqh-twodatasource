package com.hxqh.twodatasource.repository.second;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Ocean lin on 2017/7/11.
 */
@Repository
public interface TPerfEnterprise4tiocRepository extends JpaRepository<TPerfEnterprise4tioc, TPerfEnterprise4tiocKey> {


    @Query("select o from TPerfEnterprise4tioc o where o.mysqlid between ?1 and  ?2 ")
    List<TPerfEnterprise4tioc> findData(BigDecimal min, BigDecimal max);

    @Query("select max(o.mysqlid) from  TPerfEnterprise4tioc o ")
    BigDecimal findMaxSQLId();

    @Query("select min(o.mysqlid) from  TPerfEnterprise4tioc o ")
    BigDecimal findMinSQLId();

    @Query("select count(o.mysqlid) from TPerfEnterprise4tioc o where o.mysqlid between ?1 and  ?2 ")
    Long getEnterprise4tiocLength(BigDecimal tmp, BigDecimal addVal);
}
