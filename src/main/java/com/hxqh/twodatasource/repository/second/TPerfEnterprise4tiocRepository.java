package com.hxqh.twodatasource.repository.second;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * Created by Ocean lin on 2017/7/11.
 */
@Repository
public interface TPerfEnterprise4tiocRepository extends JpaRepository<TPerfEnterprise4tioc, TPerfEnterprise4tiocKey> {

    @Query("select o from  TPerfEnterprise4tioc o where o.eRsiTimedata > ?1")
    List<TPerfEnterprise4tioc> findAllData(Date adddate);

    @Query("select o from  TPerfEnterprise4tioc o where o.eRsiTimedata = (select max(u.eRsiTimedata) from TPerfEnterprise4tioc u)")
    List<TPerfEnterprise4tioc> findAllDataTEST();

    @Query("select o from  TPerfEnterprise4tioc o where o.eRsiTimedata > ?1")
    List<TPerfEnterprise4tioc> findData(String s);
}
