package com.hxqh.twodatasource.repository.second;

import com.hxqh.twodatasource.repository.primary.Loctperfenterprise4tioc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Ocean lin on 2017/7/11.
 */
@Repository
public interface TPerfEnterprise4tiocRepository extends JpaRepository<TPerfEnterprise4tioc,TPerfEnterprise4tiocKey> {
    List<TPerfEnterprise4tioc> findAllData(Loctperfenterprise4tioc maxDateData);
}
