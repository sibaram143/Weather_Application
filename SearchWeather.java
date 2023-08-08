package com.sibaram.Weather_App.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class SearchWeather {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String city;
	
	@OneToMany(mappedBy = "searchWeather", cascade = CascadeType.ALL )
	private List<WeatherData> weatherData;
	
	public SearchWeather() {
		
	}

	public SearchWeather(int id, String city, List<WeatherData> weatherData) {
		super();
		this.id = id;
		this.city = city;
		this.weatherData = weatherData;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<WeatherData> getWeatherData() {
		return weatherData;
	}

	public void setWeatherData(List<WeatherData> weatherData) {
		this.weatherData = weatherData;
	}

	@Override
	public String toString() {
		return "SearchWeather [id=" + id + ", city=" + city + ", weatherData=" + weatherData + "]";
	}
	
	
}
