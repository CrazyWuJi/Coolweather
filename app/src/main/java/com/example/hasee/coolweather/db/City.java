package com.example.hasee.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by hasee on 2018/3/25 0025.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int privinceCode;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getCityName(){
        return cityName;
    }

    public void setCityName(String cityName){
        this.cityName=cityName;
    }

    public int getCityCode(){
        return cityCode;
    }

    public void setCityCode(int cityCode){
        this.cityCode=cityCode;
    }

    public int getPrivinceCode(){
        return privinceCode;
    }

    public void setPrivinceCode(int privinceCode){
        this.privinceCode=privinceCode;
    }
}
