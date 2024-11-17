package com.hoaftq.open_weather_map_graphql;

import com.hoaftq.open_weather_map_graphql.codegen.types.Units;
import com.hoaftq.open_weather_map_graphql.codegen.types.WeatherData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class CurrentWeatherController {

    @Autowired
    private CurrentWeatherService service;

    @QueryMapping
    public WeatherData weather(@Argument float lat, @Argument float lon, @Argument Units units, @Argument String lang) {
        return service.getWeatherData(lat, lon, units, lang);
    }
}
