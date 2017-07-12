package com.hxqh.twodatasource.repository.second;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Ocean lin on 2017/7/11.
 */
@Repository
public interface TLvlEnterpriseCustRepository extends JpaRepository<TLvlEnterpriseCust, String> {
    @Query("select 0 from TLvlEnterpriseCust o")
    List<TLvlEnterpriseCust> findAllData();
}
