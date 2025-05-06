package com.azu.watchHelper02;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.stereotype.Component;

@Component
public class MaoyanHotMoviesApiClientTest {

    public void getHotMoviesFromApi(String cityId, String cityName) {
        String apiUrl = "http://localhost:3000/movie/hot?ci=" + cityId + "&ct=" + cityName;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(apiUrl))
                .GET()
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                System.out.println("通过API获取的热映电影数据: " + response.body());
            } else {
                System.out.println("请求失败，状态码: " + response.statusCode());
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MaoyanHotMoviesApiClientTest client = new MaoyanHotMoviesApiClientTest();
        String cityId = "1";
        String cityName = "北京";
        client.getHotMoviesFromApi(cityId, cityName);
    }
}