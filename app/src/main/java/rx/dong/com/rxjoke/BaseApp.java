package rx.dong.com.rxjoke;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by JDD on 2016/4/8.
 */
public class BaseApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        LeakCanary.install(this);
    }
}
