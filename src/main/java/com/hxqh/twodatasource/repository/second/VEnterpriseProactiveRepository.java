package com.hxqh.twodatasource.repository.second;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Ocean lin on 2017/11/30.
 */
@Repository
public interface VEnterpriseProactiveRepository extends JpaRepository<VEnterpriseProactive, Long> {

    @Query("select o from VEnterpriseProactive o where o.id > ?1 ")
    List<VEnterpriseProactive> findExportData(Long maxSQLId);
}
