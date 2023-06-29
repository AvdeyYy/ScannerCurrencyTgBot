//package com.example.ValueScannerBot.service;
//
//import com.example.ValueScannerBot.dto.CourseDto;
//import com.google.gson.Gson;
//import com.squareup.okhttp.OkHttpClient;
//import com.squareup.okhttp.Request;
//import com.squareup.okhttp.Response;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.io.IOException;
//
//@Service
//
//public class CourseParserServiceV2 {
//    static {
//        OkHttpClient okHttpClient = new OkHttpClient();
//        Gson gson = new Gson();
//
//        Request request = new Request.Builder()
//                .url("https://rest.coinapi.io/v1/assets")
//                .addHeader("X-CoinAPI-Key","8BC3828B-8C17-4186-8BFB-B1EDF5FD0C8A")
//                .get().build();
//        try {
//            Response response = okHttpClient.newCall(request).execute();
//            System.out.println("tut");
//            System.out.println(response);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//    public CourseParserServiceV2() throws IOException {
//    }
//}
