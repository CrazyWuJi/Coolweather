package com.example.hasee.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hasee on 2018/4/8 0008.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }

}
