package com.hoaftq.open_weather_map_graphql.config;

import com.hoaftq.open_weather_map_graphql.dtos.WeatherDataMapper;
import com.hoaftq.open_weather_map_graphql.dtos.WeatherDataMapperImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public WeatherDataMapper weatherDataMapper() {
        return new WeatherDataMapperImpl();
    }
}
