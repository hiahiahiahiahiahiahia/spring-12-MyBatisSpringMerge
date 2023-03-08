package com.zfy.Test;

import com.alibaba.druid.support.json.JSONUtils;
import com.zfy.Service.ServiceInterface;
import com.zfy.Service.impl.ServiceDao;
import com.zfy.config.SpringConfig;
import com.zfy.mapper.ServiceMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class MyBatisVSSpring {
    @Test
    public void testRunMerge(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        ServiceMapper serviceMapper = ctx.getBean(ServiceMapper.class);
        List<ServiceDao> serviceDaos = serviceMapper.selectAll();
        for (ServiceDao dao : serviceDaos) {
            System.out.println(dao.getCountrycode() + ", " + dao.getLanguage());
        }
        System.out.println("+------------------------+");

        ServiceInterface serviceInterface = ctx.getBean(ServiceInterface.class);
        serviceInterface.transferMoney(2, 3, 10);

    }
}
