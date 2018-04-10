package com.example.hasee.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hasee on 2018/4/8 0008.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }

}
