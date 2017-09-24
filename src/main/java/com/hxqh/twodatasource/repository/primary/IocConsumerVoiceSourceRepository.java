package com.hxqh.twodatasource.repository.primary;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/**
 * Created by Ocean lin on 2017/9/24.
 */
@Repository
public interface IocConsumerVoiceSourceRepository extends CrudRepository<IocConsumerVoiceSource, BigDecimal> {
}
