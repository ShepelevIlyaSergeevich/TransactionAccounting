package ru.shepelev.TransactionAccounting;

import org.springframework.beans.factory.annotation.Value;

import java.net.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.time.Duration;

public class ExchangeRatesClient {
    private final String URL = "";
    private final HttpClient client;

    @Value("${secretkey.twelvedata}")
    private String apikey;

    public ExchangeRatesClient() {
        client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .followRedirects(HttpClient.Redirect.NORMAL)
                .connectTimeout(Duration.ofSeconds(20))
                .authenticator(Authenticator.getDefault())
                .build();
    }

    public void getExchangeRates() throws URISyntaxException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(URL))
                .GET()
                .build();
    }
}
