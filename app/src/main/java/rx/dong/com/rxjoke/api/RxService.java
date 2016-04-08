package rx.dong.com.rxjoke.api;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by SkyEyesStion on 2016/2/26.
 */
public class RxService {
    private static final String BASETESTURL = "http://apis.baidu.com/showapi_open_bus/";
    private static OkHttpClient okHttpClient = new OkHttpClient.Builder().addInterceptor
            (new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)).build();
    private static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASETESTURL)
            .client(okHttpClient)
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    private RxService() {
        //construct

    }

    public static <T> T createApi(Class<T> clazz) {

        return retrofit.create(clazz);
    }

}
