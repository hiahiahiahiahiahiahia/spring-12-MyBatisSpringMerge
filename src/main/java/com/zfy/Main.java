package com.zfy;

import com.zfy.Dao.impl.UserDao;
import com.zfy.Service.impl.ServiceDao;
import com.zfy.mapper.ServiceMapper;
import com.zfy.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config-nouse.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        int id = 2;
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        UserDao userDao = userMapper.selectById(id);
        System.out.println(userDao);

        ServiceMapper servicemap = sqlSession.getMapper(ServiceMapper.class);
        String countrycode = "AGO", language = "Kongo";
        //+---------------------------------------------+//
        //使用多条件查询
//        Map map = new HashMap();
//        map.put("countrycode", countrycode);
//        map.put("language", language);
//
//        List<ServiceDao> serviceDaos = servicemap.selectByConditions(map);
//        for (ServiceDao serviceDao : serviceDaos) {
//            System.out.println(serviceDao.getCountrycode() + ", " + serviceDao.getLanguage());
//        }

        //+---------------------------------------------+//
        //使用单条件查询
        ServiceDao servicedao = new ServiceDao();
        servicedao.setCountrycode(countrycode);
        servicedao.setIsofficial("F");
        servicedao.setLanguage("Chinese");
        List<ServiceDao> serviceDaos = servicemap.selectSingle(servicedao);
        for (ServiceDao serviceDao : serviceDaos) {
            System.out.println(serviceDao.getCountrycode() + ", " + serviceDao.getLanguage());
        }
    }
}