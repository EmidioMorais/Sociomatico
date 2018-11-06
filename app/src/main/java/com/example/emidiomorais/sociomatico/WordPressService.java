package com.example.emidiomorais.sociomatico;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface WordPressService {

    @GET("wp/v2/posts")

    Call<List<Post>> getAllPost();
}
