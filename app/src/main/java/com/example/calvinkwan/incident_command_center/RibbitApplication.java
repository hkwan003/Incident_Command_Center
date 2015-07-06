package com.example.calvinkwan.incident_command_center;

import com.parse.Parse;
import android.app.Application;

/**
 * Created by calvinkwan on 7/6/15.
 */
public class RibbitApplication extends Application
{
    @Override
    public void onCreate()
    {
        super.onCreate();
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "vnCbnf4r1MiM0EPAgCDuddmeDMEKz46hVpBVSwSv", "lKFrjBuEyn59KVBJuvUJNSdVDweAkfXznH5lEJxx");
    }

}
