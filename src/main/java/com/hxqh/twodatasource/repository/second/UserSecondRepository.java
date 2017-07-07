package com.hxqh.twodatasource.repository.second;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Ocean lin on 2017/7/1.
 */
@Repository
public interface UserSecondRepository extends JpaRepository<SecondUser, Long> {

    @Query("select u from SecondUser u where u.name=:name")
    SecondUser findUserById(@Param("name") String name);
}
