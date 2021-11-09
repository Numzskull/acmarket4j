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

        DataInputStream input = new DataInputStream(httpURLConnection.getInputStream());
        StringBuilder stringBuilder = new StringBuilder();

        int c = input.read();

        while (c != -1) {
            stringBuilder.append((char) c);
            c = input.read();
        }

        String response = stringBuilder.toString();

        input.close();

        return response;
    }
}
