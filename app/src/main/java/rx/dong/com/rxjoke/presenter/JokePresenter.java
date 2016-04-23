package rx.dong.com.rxjoke.presenter;

import com.orhanobut.logger.Logger;

import java.util.List;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.dong.com.rxjoke.api.JokeApi;
import rx.dong.com.rxjoke.api.RxService;
import rx.dong.com.rxjoke.model.ContentlistEntity;
import rx.dong.com.rxjoke.model.JokeEntity;
import rx.dong.com.rxjoke.ui.view.JokeView;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by JDD on 2016/4/21 0021.
 */
public class JokePresenter extends BasePresenter<JokeView> {

    @Override
    public void attachView(JokeView mvpView) {
        super.attachView(mvpView);
    }

    @Override
    public void detachView() {
        super.detachView();
    }

    public void loadList(final int page) {
        RxService.createApi(JokeApi.class)
                .getJoke(page)
                .subscribeOn(Schedulers.io())
                .map(new Func1<JokeEntity, List<ContentlistEntity>>() {
                    @Override
                    public List<ContentlistEntity> call(JokeEntity jokeEntity) {
                        return jokeEntity.getShowapi_res_body().getContentlist();
                    }
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<ContentlistEntity>>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Logger.e(e.getMessage());
                        getMvpView().showError(null, null);
                    }

                    @Override
                    public void onNext(List<ContentlistEntity> contentlistEntities) {
                        if (page == 1) {
                            getMvpView().refresh(contentlistEntities);
                        } else {
                            getMvpView().loadMore(contentlistEntities);
                        }
                    }
                });

    }
}
