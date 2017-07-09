package com.hxqh.twodatasource.service;


import com.hxqh.twodatasource.repository.primary.Openstreetmap;

/**
 * Created by Ocean lin on 2017/7/1.
 */

public interface SystemService {

    void openStreetMap();

    void saveOpenstreetmap(Openstreetmap openstreetmap);
}
