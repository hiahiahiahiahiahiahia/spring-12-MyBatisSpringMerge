package com.zfy.mapper;

import com.zfy.Dao.impl.UserDao;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface UserMapper {
    public UserDao selectById(int id);

    @Update("update city " +
            "set population = population + #{person} " +
            "where id=#{inID}")
    void inMoney(@Param("inID") Integer inId, @Param("person") Integer person);

    @Update("update city set population = population - #{person} where id=#{outID}")
    void outMoney(@Param("outID")Integer outId, @Param("person") Integer person);
}
