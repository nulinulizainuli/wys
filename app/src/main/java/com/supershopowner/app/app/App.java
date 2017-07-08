package com.supershopowner.app.app;

import android.app.Application;
import android.provider.Settings;

import com.deanlib.ootb.OotbConfig;
import com.deanlib.ootb.data.io.DefaultLoadingDialog;
import com.deanlib.ootb.data.io.DefaultResultCode;
import com.deanlib.ootb.utils.VersionUtils;
import com.supershopowner.app.utils.UserManager;

/**
 *
 * Created by dean on 2017/7/8.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        OotbConfig.init(this,Constants.DEBUG);

        //网络设置
        OotbConfig.setRequestServer("",null,new DefaultResultCode(),new DefaultLoadingDialog());

        //设备ID
        Constants.deviceId = Settings.Secure.getString(getContentResolver(), Settings.Secure.ANDROID_ID);
        Constants.versionName = VersionUtils.getAppVersionName();


        //用户
        UserManager.getInstance(this);

    }
}
