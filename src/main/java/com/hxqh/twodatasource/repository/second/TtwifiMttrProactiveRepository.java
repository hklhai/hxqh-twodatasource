package com.hxqh.twodatasource.repository.second;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Ocean lin on 2017/7/11.
 */
@Repository
public interface TtwifiMttrProactiveRepository extends JpaRepository<TtwifiMttrProactiveLastMonth,TtwifiMttrProactiveKey> {
}
