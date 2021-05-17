package com.example.mynewsapplication.models;
import com.squareup.moshi.Json;

import java.util.List;

public class NewsData {
   // @SerializedName("status")
   // @Expose
    @Json(name= "status")
    private String status;

    //@SerializedName("totalResult")
   // @Expose
    @Json(name= "totalResult")
    private int totalResult;

    //@SerializedName("articles")
    //@Expose
    @Json(name= "articles")
    private List<NewsArticle> article;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalResult() {
        return totalResult;
    }

    public void setTotalResult(int totalResult) {
        this.totalResult = totalResult;
    }

    public List<NewsArticle> getArticle() {
        return article;
    }

    public void setArticle(List<NewsArticle> article) {
        this.article = article;
    }
}
