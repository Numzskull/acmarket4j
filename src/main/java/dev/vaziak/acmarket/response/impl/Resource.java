package dev.vaziak.acmarket.response.impl;

import com.google.gson.annotations.SerializedName;
import dev.vaziak.acmarket.response.BaseResponse;
import lombok.Getter;

@Getter
public class Resource extends BaseResponse {
    @SerializedName("name")
    private String name;

    @SerializedName("customers")
    private int customers;

    @SerializedName("short")
    private String shortDescription;

    @SerializedName("body")
    private String body;

    @SerializedName("created")
    private String created;
}
