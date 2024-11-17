package com.hoaftq.open_weather_map_graphql.dtos;

import com.hoaftq.open_weather_map_graphql.codegen.types.Main;
import com.hoaftq.open_weather_map_graphql.codegen.types.Rain;
import com.hoaftq.open_weather_map_graphql.codegen.types.Snow;
import com.hoaftq.open_weather_map_graphql.codegen.types.WeatherData;
import org.mapstruct.Mapper;

@Mapper
public interface WeatherDataMapper {
    WeatherData weatherDataDtoToWeatherData(WeatherDataDto dto);

    Main mainDtoToMain(MainDto dto);

    Rain rainDtoToRain(RainDto dto);

    Snow snowDtoToSnow(SnowDto dto);
}
