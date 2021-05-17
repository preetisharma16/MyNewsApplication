package com.example.mynewsapplication.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
//import com.squareup.moshi.Json;

public class SourceNews {

    @SerializedName("id")
    @Expose
   // @Json(name= "id")
    private String id;

    @SerializedName("name")
    @Expose
   // @Json(name= "name")
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
