package com.hxqh.twodatasource.repository.primary;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Ocean lin on 2017/7/1.
 */
@Repository
public interface UserPrimaryRepository extends JpaRepository<PrimaryUser, Long> {

    @Query("select u from PrimaryUser u where u.name=:name")
    PrimaryUser findUserById(@Param("name") String name);
}
