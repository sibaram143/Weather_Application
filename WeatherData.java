package com.sibaram.Weather_App.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class WeatherData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String weatherConditions;
	
	private String temperature;
	
	
	private String humidity;
	
	private String wind;
	
	private String precipition;
	
	@OneToOne
//	@ManyToOne
	@JoinColumn(name = "search_weather_id")
	private SearchWeather searchWeather;
	
	public WeatherData(int id, String weatherConditions, String temperature, String humidity, String wind,
			String precipition, SearchWeather searchWeather) {
		super();
		this.id = id;
		this.weatherConditions = weatherConditions;
		this.temperature = temperature;
		this.humidity = humidity;
		this.wind = wind;
		this.precipition = precipition;
		this.searchWeather = searchWeather;
	}
	public WeatherData() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWeatherConditions() {
		return weatherConditions;
	}
	public void setWeatherConditions(String weatherConditions) {
		this.weatherConditions = weatherConditions;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getHumidity() {
		return humidity;
	}
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
	public String getWind() {
		return wind;
	}
	public void setWind(String wind) {
		this.wind = wind;
	}
	public String getPrecipition() {
		return precipition;
	}
	public void setPrecipition(String precipition) {
		this.precipition = precipition;
	}
	public SearchWeather getSearchWeather() {
		return searchWeather;
	}
	public void setSearchWeather(SearchWeather searchWeather) {
		this.searchWeather = searchWeather;
	}
	@Override
	public String toString() {
		return "WeatherData [id=" + id + ", weatherConditions=" + weatherConditions + ", temperature=" + temperature
				+ ", humidity=" + humidity + ", wind=" + wind + ", precipition=" + precipition + ", searchWeather="
				+ searchWeather + "]";
	}
	
	
	
	
}
