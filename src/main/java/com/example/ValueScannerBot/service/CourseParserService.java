package com.example.ValueScannerBot.service;


import com.example.ValueScannerBot.dto.CourseDto;
import com.google.gson.Gson;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


@Service
@Data
public class CourseParserService {
    @Value("${api.key}")
    private String api_key;
    @Value("${api.value}")
    private String api_value;

    Gson gson = new Gson();
    URI uri;
    HttpResponse<String> getResponse;

    public CourseDto[] currentValues () {
        HttpClient httpClient = HttpClient.newHttpClient();
        try {
            uri = new URI("https://rest.coinapi.io/v1/assets");
        } catch (URISyntaxException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(uri)
                .header("X-CoinAPI-Key","8BC3828B-8C17-4186-8BFB-B1EDF5FD0C8A")
                .GET().build();

        try {
            getResponse = httpClient.send(getRequest, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
            return gson.fromJson(getResponse.body(), CourseDto[].class);
    }

}

