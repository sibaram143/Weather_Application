package com.sibaram.Weather_App.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sibaram.Weather_App.entity.SearchWeather;
import com.sibaram.Weather_App.entity.WeatherData;
import com.sibaram.Weather_App.repository.WeatherAppRepositoryData;

@RestController
public class WeatherDataController {
	
	@Autowired
	private WeatherAppRepositoryData service;
	
	@PostMapping(value = "/weatherData")
	public void saveWeatherSearch(@RequestBody WeatherData weatherData) {
		
		service.saveWeatherData(weatherData);
		
	}
	
	@GetMapping(value = "/weatherData")
	public List<WeatherData> getAllWeatherData() {
		
		return service.getAllData();
		
	}
	
	@DeleteMapping(value = "/weatherData/{id}")
	public void deleteSearchWeather(@PathVariable int id) {
		
		service.deleteWeatherData(id);
	}
}
