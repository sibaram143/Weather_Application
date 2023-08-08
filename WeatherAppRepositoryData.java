package com.sibaram.Weather_App.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sibaram.Weather_App.dto.WeatherAppDtoWeatherData;
import com.sibaram.Weather_App.entity.WeatherData;

@Repository
public class WeatherAppRepositoryData {
	
	@Autowired
	private WeatherAppDtoWeatherData repository;
	
	public WeatherData saveWeatherData(WeatherData weatherData) {
		
		return repository.save(weatherData);
		
	}
	
	public List<WeatherData> getAllData() {
		
		return repository.findAll();
		
	}
	
	public void deleteWeatherData(int id) {
		
		repository.deleteById(id);
	}
	
}
