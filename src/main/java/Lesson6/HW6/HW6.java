package Lesson6.HW6;

import okhttp3.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HW6 {
    public static void main(String[] args) throws IOException {
        OkHttpClient okHttpClient = new OkHttpClient();
        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme("https")
                .host("api.weather.yandex.ru")
                .addPathSegment("/v2")
                .addPathSegment("/forecast")
                .build();

        String authBody = "{\n" +
                "    \"lat\" : \"69.355352\",\n" +
                "    \"lon\" : \"88.169750\",\n" +
                "    \"lang\" : \"ru_RU\",\n" +
                "    \"limit\" : 5,\n" +
                "    \"hours\" : true,{\n" +
                "    \"extra\" : true,\n" +
                "}";

     //  RequestBody requestAuthBody = RequestBody.create(authBody, MediaType.parse("JSON"));

        Request requestAuth = new Request.Builder()
                .url("https://api.weather.yandex.ru/v2/forecast/")
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json")
                .addHeader("X-Yandex-API-Key", "51805fc3-fe14-4bf6-8766-99ecb4024843")
                .get()
                .build();

        Response responseAuth = okHttpClient.newCall(requestAuth).execute();

        System.out.println(responseAuth.isSuccessful());

        String responseBodyWithToken = responseAuth.body().string();

        System.out.println(responseBodyWithToken);

        String createBookingJson = "{\n" +
                "    \"now\" : ,\n" +
                "    \"now_dt\" : ,\n" +
                "    \"info\" : ,\n" +
                "    \"fact\" : ,\n" +
                "    \"forecasts\" : {\n" +
                "}";

     //   RequestBody requestCreateBookingBody = RequestBody.create(createBookingJson, MediaType.parse("JSON"));


        Request requestCreateBooking = new Request.Builder()
                .url("https://api.weather.yandex.ru/v2/forecast/")
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/json")
                .addHeader("X-Yandex-API-Key", "51805fc3-fe14-4bf6-8766-99ecb4024843")
                .get()
                .build();

        Response createBookingResponse = okHttpClient.newCall(requestCreateBooking).execute();

        System.out.println(createBookingResponse.body().string());
    }
}
