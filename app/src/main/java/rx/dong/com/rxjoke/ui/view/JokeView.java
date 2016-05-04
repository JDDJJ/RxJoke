package rx.dong.com.rxjoke.ui.view;

import android.view.View;

import com.hannesdorfmann.mosby.mvp.MvpView;

import java.util.List;

import rx.dong.com.rxjoke.model.ContentlistEntity;

/**
 * Created by JDD on 2016/4/21 0021.
 */
public interface JokeView extends MvpView {
    void showError(String msg, View.OnClickListener onClickListener);

    void refresh(List<ContentlistEntity> data);

    void loadMore(List<ContentlistEntity> data);

}
