package com.hxqh.twodatasource.repository.primary;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Ocean lin on 2017/11/30.
 */
@Repository
public interface TbEnterpriseProactiveRepository extends CrudRepository<TbEnterpriseProactive, Long> {
    @Query("select max(o.mid) from  TbEnterpriseProactive o ")
    Long findMaxSQLId();
}
