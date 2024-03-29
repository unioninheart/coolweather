package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 李连和 on 2019/10/14.
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort{

        @SerializedName("txt")
        public String info;

    }

    public class CarWash{

        @SerializedName("txt")
        public String info;

    }

    public class Sport{

        @SerializedName("txt")
        public String info;

    }

}
