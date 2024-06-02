package com.arti.artiDesktop.Services;

import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    public String getWeatherForecast() {
        return "It's gonna snow a lot. Brace yourself, the winter is coming.";
    }
}