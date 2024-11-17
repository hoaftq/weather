package com.hoaftq.open_weather_map_graphql.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public record RainDto(
        @JsonProperty("1h")
        double oneHour) {
}
