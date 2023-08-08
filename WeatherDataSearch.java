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
import com.sibaram.Weather_App.repository.WeatherAppRepositorySearch;

@RestController
public class WeatherDataSearch {
	
	@Autowired
	private  WeatherAppRepositorySearch service;
	
	@PostMapping(value = "/location")
	public void saveWeatherSearch(@RequestBody SearchWeather searchWeather) {
		
		 service.saveWeatherSearch(searchWeather);
		
	}
	
	@GetMapping(value = "/location")
	public List<SearchWeather> getAllWeatherData() {
		
		return service.getAllData();
		
	}
	
	@DeleteMapping(value = "/location/{id}")
	public void deleteSearchWeather(@PathVariable int id) {
		
		service.deleteWeatherSearch(id);
	}
}
