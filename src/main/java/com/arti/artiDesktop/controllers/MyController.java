package com.arti.artiDesktop.controllers;

import com.arti.artiDesktop.Services.WeatherService;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import net.rgielen.fxweaver.core.FxmlView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javafx.event.ActionEvent;

@Controller
@FxmlView("main-scene.fxml")
public class MyController {
    private final WeatherService weatherService;
    @Autowired
    public MyController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }
    @FXML
    public Label weatherLabel;

    public void loadWeatherForecast(ActionEvent actionEvent) {
        this.weatherLabel.setText(weatherService.getWeatherForecast());
    }
}
