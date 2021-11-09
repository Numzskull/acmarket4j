package dev.vaziak.acmarket.response.impl;

import com.google.gson.annotations.SerializedName;
import dev.vaziak.acmarket.response.BaseResponse;
import lombok.Getter;

@Getter
public class Profile extends BaseResponse {
    @SerializedName("reason")
    private String reason;

    @SerializedName("username")
    private String username;

    @SerializedName("uid")
    private int uid;

    @SerializedName("bio")
    private String bio;

    @SerializedName("seller")
    private boolean seller;

    @SerializedName("rank")
    private String rank;

    @SerializedName("created")
    private String created;
}
