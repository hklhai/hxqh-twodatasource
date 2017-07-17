package com.hxqh.twodatasource.repository.primary;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/**
 * Created by Ocean lin on 2017/7/9.
 */
@Repository
public interface TbIocMobileIpTransitRepository extends CrudRepository<TbIocMobileIpTransit, BigDecimal> {

}
