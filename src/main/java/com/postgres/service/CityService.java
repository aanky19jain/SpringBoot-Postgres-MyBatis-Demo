package com.postgres.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.postgres.mappers.CityMapper;
import com.postgres.model.City;

@Service
public class CityService {

	@Autowired
	private CityMapper cityMapper;

	public List<City> getAllCities() {
		return cityMapper.getAllCities();
	}

	public City getCityPopulationByName(String name) {
		return cityMapper.getCityPopulationByName(name);
	}

	public boolean updateCityPopulationByName(String name, int population) {
		return cityMapper.updateCityPopulationByName(name, population);
	}

	public boolean deleteCity(String name) {
		return cityMapper.deleteCity(name);
	}

	public City createCity(City city) {
		cityMapper.createCity(city);
		return city;
	}

}
