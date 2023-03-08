package com.zfy.Service.impl;

import com.zfy.Dao.impl.UserDao;
import com.zfy.Service.ServiceInterface;
import com.zfy.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceDao implements ServiceInterface {
    //调用countrylanguage表
    private String countrycode;
    private String language;
    private String isofficial;
    private Double percentage;

    @Autowired
    private UserMapper userdao;


    public ServiceDao() {
    }

    public ServiceDao(String countrycode, String language, String isofficial, Double percentage) {
        this.countrycode = countrycode;
        this.language = language;
        this.isofficial = isofficial;
        this.percentage = percentage;
    }

    /**
     * 获取
     * @return countrycode
     */
    public String getCountrycode() {
        return countrycode;
    }

    /**
     * 设置
     * @param countrycode
     */
    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    /**
     * 获取
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * 设置
     * @param language
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * 获取
     * @return isofficial
     */
    public String getIsofficial() {
        return isofficial;
    }

    /**
     * 设置
     * @param isofficial
     */
    public void setIsofficial(String isofficial) {
        this.isofficial = isofficial;
    }

    /**
     * 获取
     * @return percentage
     */
    public Double getPercentage() {
        return percentage;
    }

    /**
     * 设置
     * @param percentage
     */
    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    public String toString() {
        return "ServiceDao{countrycode = " + countrycode + ", language = " + language + ", isofficial = " + isofficial + ", percentage = " + percentage + "}";
    }

    @Override
    public void save() {
        System.out.println("service dao");
    }

    @Override
    public void transferMoney(Integer inId, Integer outId, Integer person) {
        userdao.inMoney(inId, person);
        //int i = 1 / 0;//模拟异常,如果没有事务管理,就会一边ok另外一边false
        userdao.outMoney(outId, person);
    }
}
