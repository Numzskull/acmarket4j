package dev.vaziak.acmarket;

import com.google.gson.Gson;
import dev.vaziak.acmarket.response.impl.Profile;
import dev.vaziak.acmarket.response.impl.Resource;
import dev.vaziak.acmarket.util.HttpUtil;
import lombok.RequiredArgsConstructor;

import java.io.IOException;
import java.net.URL;

@RequiredArgsConstructor
public class ACMarket {
    // ACMarkets Base API URL
    private static final String API_URL = "https://anticheat.market/api";

    private final Gson gson = new Gson();

    // Unused but may be used in the future.
    private final String apiKey;

    /**
     * Fetches a Profile based off of provided id
     * @param id User Id provided by AC-Market
     * @return {@code Profile} instance based off of server response
     */
    public Profile getProfile(int id) {
        String data;

        try {
            data = HttpUtil.sendPostRequest(new URL(String.format("%s/profiles/%d", API_URL, id)));
        } catch (IOException e) {
            data = "{\"status\": \"api_error\"}";
        }

        return gson.fromJson(data, Profile.class);
    }

    /**
     * Fetches a Resource based off of the provided resource id
     * @param resourceId A {@code String} provided by ACMarket identifying resources
     * @return {@code Resource} based off of server response
     */
    public Resource getResource(String resourceId) {
        String data;

        try {
            data = HttpUtil.sendPostRequest(new URL(String.format("%s/resources/%s", API_URL, resourceId)));
        } catch (IOException e) {
            data = "{\"status\": \"api_error\"}";
        }

        return gson.fromJson(data, Resource.class);
    }
}
