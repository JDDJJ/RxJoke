package rx.dong.com.rxjoke.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;
import rx.Observable;
import rx.dong.com.rxjoke.model.JokeEntity;

/**
 * Created by JDD on 2016/4/8.
 */
public interface JokeApi {

    @GET("showapi_joke/joke_text")
    Observable<JokeEntity> getJoke(@Header("apikey") String apikey, @Query("page")
    String page);

    @GET("showapi_joke/joke_text")
    Call<JokeEntity> callJoke(@Header("apikey") String apikey, @Query("page")
    String page);
}
