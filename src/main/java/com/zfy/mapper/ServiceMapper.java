package com.zfy.mapper;

import com.zfy.Service.impl.ServiceDao;

import java.util.List;
import java.util.Map;

public interface ServiceMapper {
    //public ServiceDao selectByConditions(String countrycode, String language);//多条件查询
    List<ServiceDao> selectByConditions(Map map);

    List<ServiceDao> selectSingle(ServiceDao servicedao);//需要传对象,需要首先进行封装

    List<ServiceDao> selectAll();
}
