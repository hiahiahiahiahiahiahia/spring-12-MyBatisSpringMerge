package com.zfy.Dao.impl;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao{
    //调用city表
    private Integer id;
    private String name;
    private String countrycode;
    private String district;
    private Integer population;

    public UserDao() {
    }

    public UserDao(Integer id, String name, String countrycode, String district, Integer population) {
        this.id = id;
        this.name = name;
        this.countrycode = countrycode;
        this.district = district;
        this.population = population;
    }

    /**
     * 获取
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
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
     * @return district
     */
    public String getDistrict() {
        return district;
    }

    /**
     * 设置
     * @param district
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * 获取
     * @return population
     */
    public Integer getPopulation() {
        return population;
    }

    /**
     * 设置
     * @param population
     */
    public void setPopulation(Integer population) {
        this.population = population;
    }

    public String toString() {
        return "UserDao{id = " + id + ", name = " + name + ", countrycode = " + countrycode + ", district = " + district + ", population = " + population + "}";
    }
}
