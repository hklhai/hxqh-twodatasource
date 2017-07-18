package com.hxqh.twodatasource.repository.primary;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/**
 * Created by Ocean lin on 2017/7/18.
 */
@Repository
public interface TbFfmAchievementRepository extends CrudRepository<TbFfmAchievement, BigDecimal> {
}
