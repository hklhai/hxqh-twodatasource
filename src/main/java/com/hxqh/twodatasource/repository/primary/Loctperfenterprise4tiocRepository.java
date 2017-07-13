package com.hxqh.twodatasource.repository.primary;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Ocean lin on 2017/7/10.
 */
@Repository
public interface Loctperfenterprise4tiocRepository extends CrudRepository<Loctperfenterprise4tioc, BigDecimal> {
    @Query("select o from Loctperfenterprise4tioc o where o.adddate = (select  max(u.adddate) from Loctperfenterprise4tioc u)")
    List<Loctperfenterprise4tioc> findMaxDateData();

    @Procedure(name = "analysis_source_ent_4tioc1")
    void analysis_source_ent_4tioc1();

//    @Query(nativeQuery = true, value = "call analysis_source_ent_4tioc1")
//    void callProcedure();

}
