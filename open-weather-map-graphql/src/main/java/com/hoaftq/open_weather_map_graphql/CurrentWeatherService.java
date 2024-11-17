package com.hoaftq.open_weather_map_graphql;

import com.hoaftq.open_weather_map_graphql.codegen.types.Units;
import com.hoaftq.open_weather_map_graphql.codegen.types.WeatherData;
import com.hoaftq.open_weather_map_graphql.config.OpenWeatherMapConfig;
import com.hoaftq.open_weather_map_graphql.dtos.WeatherDataDto;
import com.hoaftq.open_weather_map_graphql.dtos.WeatherDataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CurrentWeatherService {

    @Autowired
    private RestTemplate template;

    @Autowired
    private OpenWeatherMapConfig config;

    @Autowired
    private WeatherDataMapper mapper;

    public WeatherData getWeatherData(float lat, float lon, Units units, String lang) {
        var apiUrl = buildApiUrl(lat, lon, units, lang);
        var responseDto = template.getForEntity(apiUrl, WeatherDataDto.class).getBody();
        return mapper.weatherDataDtoToWeatherData(responseDto);
    }

    private String buildApiUrl(float lat, float lon, Units units, String lang) {
        var builder = new StringBuilder()
                .append(config.getWeatherUrl()).append("?")
                .append("appid=").append(config.getApiKey())
                .append("&lat=").append(lat)
                .append("&lon=").append(lon);

        if (units != null) {
            builder.append("&units=").append(units);
        }

        if (lang != null) {
            builder.append("&lang=").append(lang);
        }

        return builder.toString();
    }
}
