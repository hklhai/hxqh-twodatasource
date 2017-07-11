package com.hxqh.twodatasource.service;


import com.hxqh.twodatasource.repository.primary.Openstreetmap;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * Created by Ocean lin on 2017/7/1.
 */

public interface SystemService {

    void openStreetMap() throws InvocationTargetException, IllegalAccessException;

    void saveOpenstreetmap(Openstreetmap openstreetmap);

    void save(List<Openstreetmap> openstreetmapList);
}
