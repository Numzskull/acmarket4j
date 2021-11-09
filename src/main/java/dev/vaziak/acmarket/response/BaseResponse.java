package dev.vaziak.acmarket.response;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

/**
 * This is a response format that all responses from ACMarket follow.
 */
@Getter
public class BaseResponse {
    @SerializedName("status")
    private String status;

    @SerializedName("message")
    private String message;
}
