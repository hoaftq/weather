package com.hoaftq.open_weather_map_graphql.dtos;

import com.hoaftq.open_weather_map_graphql.codegen.types.*;

import java.util.List;

public record WeatherDataDto(
        Coordinates coord,
        List<Weather> weather,
        String base,
        MainDto main,
        double visibility,
        Wind wind,
        Clouds clouds,
        RainDto rain,
        SnowDto snow,
        int dt,
        Sys sys,
        int timezone,
        int id,
        String name,
        int cod) {
}

