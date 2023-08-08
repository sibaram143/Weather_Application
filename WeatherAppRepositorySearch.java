package com.sibaram.Weather_App.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sibaram.Weather_App.dto.WeatherAppDtoWeatherSearch;
import com.sibaram.Weather_App.entity.SearchWeather;

@Repository
public class WeatherAppRepositorySearch {
	
	@Autowired
	private WeatherAppDtoWeatherSearch repository;
	
	public SearchWeather saveWeatherSearch(SearchWeather weatherSearch) {
		
		return repository.save(weatherSearch);
		
		
	}
	
	public List<SearchWeather> getAllData() {
		
		return repository.findAll();
		
	}
	
	public void deleteWeatherSearch(int id) {
		
		repository.deleteById(id);
	}
	
}
