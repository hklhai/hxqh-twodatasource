package com.hxqh.twodatasource.repository.primary;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/**
 * Created by Ocean lin on 2017/7/10.
 */
@Repository
public interface Loctperfenterprise4tiocRepository extends CrudRepository<Loctperfenterprise4tioc,BigDecimal> {
    @Query("select o from Loctperfenterprise4tioc o where o.adddate = (select  max(u.adddate) from Loctperfenterprise4tioc u)")
    Loctperfenterprise4tioc findMaxDateData();
}
