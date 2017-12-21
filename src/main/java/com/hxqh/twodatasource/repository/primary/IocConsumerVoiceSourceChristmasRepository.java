package com.hxqh.twodatasource.repository.primary;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/**
 * Created by Ocean lin on 2017/12/21.
 */
@Repository
public interface IocConsumerVoiceSourceChristmasRepository extends CrudRepository<IocConsumerVoiceSourceChristmas, BigDecimal> {
}
