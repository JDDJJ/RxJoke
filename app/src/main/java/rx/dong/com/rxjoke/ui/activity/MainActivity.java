package rx.dong.com.rxjoke.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.orhanobut.logger.Logger;

import rx.Observer;
import rx.dong.com.rxjoke.R;
import rx.dong.com.rxjoke.api.JokeApi;
import rx.dong.com.rxjoke.api.RxService;
import rx.dong.com.rxjoke.model.JokeEntity;
import rx.schedulers.Schedulers;

/**
 * Created by JDD on 2016/4/8.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RxService.createApi(JokeApi.class)
                .getJoke("83ec99fff780989a5376a1bc595ed5ff", "2")
                .subscribeOn(Schedulers.io())
//                .observeOn(Schedulers.io())
                .subscribe(new Observer<JokeEntity>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Logger.e(e.getMessage());
                    }

                    @Override
                    public void onNext(JokeEntity jokeEntity) {
                        Logger.e(jokeEntity.getShowapi_res_body().getContentlist().get(1).getText
                                ());

                    }
                });


    }
}
