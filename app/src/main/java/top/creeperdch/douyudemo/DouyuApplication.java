package top.creeperdch.douyudemo;

import android.app.Application;
import android.content.Context;

/**
 * Created by CREEPERDCH on 2017/9/22.
 * HINT:
 */

public class DouyuApplication extends Application {

    private Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }
}
