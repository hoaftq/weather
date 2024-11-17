package com.hoaftq.open_weather_map_graphql.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenWeatherMapConfig {

    @Value("${open-weather-map.api-key}")
    private String apiKey;

    @Value("${open-weather-map.weather-url}")
    private String weatherUrl;

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getWeatherUrl() {
        return weatherUrl;
    }

    public void setWeatherUrl(String weatherUrl) {
        this.weatherUrl = weatherUrl;
    }
}
