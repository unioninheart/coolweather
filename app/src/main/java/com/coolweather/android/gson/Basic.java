package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 李连和 on 2019/10/14.
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
