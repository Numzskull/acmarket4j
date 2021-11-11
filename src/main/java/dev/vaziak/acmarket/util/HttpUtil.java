package dev.vaziak.acmarket.util;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpUtil {
    public static String sendPostRequest(URL url) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
        httpURLConnection.setRequestProperty("User-Agent", "acmarket4j");

        int responseCode = httpURLConnection.getResponseCode();
        String response;

        if (responseCode == 200) {// Our request was sent back as OK from the server.
            DataInputStream input = new DataInputStream(httpURLConnection.getInputStream());
            StringBuilder stringBuilder = new StringBuilder();

            int c = input.read();

            while (c != -1) {
                stringBuilder.append((char) c);
                c = input.read();
            }

            response = stringBuilder.toString();

            input.close();
        } else {
            throw new RuntimeException("Failed to send post request (" + responseCode + ").");
        }

        return response;
    }
}
