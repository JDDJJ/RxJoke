package rx.dong.com.rxjoke.ui.adapter;

import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import rx.dong.com.rxjoke.R;
import rx.dong.com.rxjoke.model.ContentlistEntity;
import rx.dong.com.rxjoke.util.TimeUtil;

/**
 * Created by JDD on 2016/4/23 0023.
 */
public class JokeAdapter extends RecyclerView.Adapter {

    private List<ContentlistEntity> jokeList;

    public JokeAdapter(List<ContentlistEntity> jokeList) {
        this.jokeList = jokeList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.joke_list_item,
                parent, false);
        JokeViewHolder holder = new JokeViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        JokeViewHolder jokeViewHolder = (JokeViewHolder) holder;
        jokeViewHolder.title.setText("#" + jokeList.get(position).getTitle() + "#");
        jokeViewHolder.time.setText(TimeUtil.getDateBySplit(jokeList.get(position).getCt()));
        /*使html中<标签>得以转化*/
        jokeViewHolder.content.setText(Html.fromHtml(jokeList.get(position).getText().toString()));


    }

    @Override
    public int getItemCount() {
        return jokeList.size();
    }

    static class JokeViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.title)
        TextView title;
        @Bind(R.id.time)
        TextView time;
        @Bind(R.id.content)
        TextView content;

        public JokeViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
