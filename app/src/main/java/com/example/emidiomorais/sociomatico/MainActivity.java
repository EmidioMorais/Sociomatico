package com.example.emidiomorais.sociomatico;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    List<Post> postList=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView=findViewById(R.id.recyclerHome);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        final PostAdapter postAdapter=new PostAdapter(postList,this,false,false);
        recyclerView.setAdapter(postAdapter);
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(Config.base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        WordPressService wordPressService=retrofit.create(WordPressService.class);
        Call<List<Post>> call=wordPressService.getAllPost();
        call.enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                Log.d("myResponse:",  "Total Post:"+response.body().size());
                postAdapter.setData(response.body());
                postAdapter.notifyDataSetChanged();
            }
            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {
                Log.d("myResponse:",  "MSG"+t.toString());
            }
        });
    }
}