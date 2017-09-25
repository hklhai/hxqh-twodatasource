package com.hxqh.twodatasource.repository.second;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

/**
 * Created by Hy Chang on 2017/7/17.
 */
public interface TIxtsel4iocRepository extends JpaRepository<TIxtsel4ioc, Long> {
    @Query("select o from TIxtsel4ioc o where o.id >:da")
    List<TIxtsel4ioc> findETLData(@Param("da") Long da);

}
