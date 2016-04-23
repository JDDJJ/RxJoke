package rx.dong.com.rxjoke.ui;

import android.support.v7.app.AppCompatActivity;
import android.view.View;

import rx.dong.com.rxjoke.ui.view.MvpView;

/**
 * Created by JDD on 2016/4/22 0022.
 */
public class BaseActivity extends AppCompatActivity implements MvpView {

    @Override
    public void showLoading(String msg) {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showError(String msg, View.OnClickListener onClickListener) {

    }

    @Override
    public void showEmpty(String msg, View.OnClickListener onClickListener) {

    }

    @Override
    public void showEmpty(String msg, View.OnClickListener onClickListener, int imageId) {

    }

    @Override
    public void showNetError(View.OnClickListener onClickListener) {

    }
}
