package com.hxqh.twodatasource.repository.second;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TStoKoordinatRepository extends JpaRepository<TStoKoordinat,TStoKoordinatKey> {



}