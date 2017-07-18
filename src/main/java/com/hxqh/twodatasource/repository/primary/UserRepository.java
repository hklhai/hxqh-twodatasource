package com.hxqh.twodatasource.repository.primary;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Ocean lin on 2017/7/17.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
