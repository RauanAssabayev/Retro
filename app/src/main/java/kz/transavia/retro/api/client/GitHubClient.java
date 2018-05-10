package kz.transavia.retro.api.client;

import java.util.List;
import kz.transavia.retro.api.model.GitHubRepo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHubClient {
    @GET("/users/{user}/repos")
    Call<List<GitHubRepo>> getReposForUser(@Path("user")String user);
}
