package dev.vaziak.acmarket;

import dev.vaziak.acmarket.response.impl.Profile;
import dev.vaziak.acmarket.response.impl.Resource;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        ACMarket acMarket = new ACMarket(null);

        Profile profile = acMarket.getProfile(1);
        Resource resource = acMarket.getResource("60da189bc7e3b863db2a015a");

        Objects.requireNonNull(profile, "Failed to fetch profile (api_error)");
        Objects.requireNonNull(resource, "Failed to fetch resource (api_error)");

        System.out.println(profile.getStatus() + " " + profile.getUsername() + " " + resource.getName());
    }
}
