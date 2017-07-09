package com.hxqh.twodatasource.repository.second;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TStoKoordinatRepository extends CrudRepository<TStoKoordinat,String> {

	@Query("select o from TStoKoordinat o where o.funct is not null and o.funct <> ''")
	List<TStoKoordinat> getData();
}