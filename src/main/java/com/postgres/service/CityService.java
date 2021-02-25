package com.postgres.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
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

	@Cacheable("ticketsCache")
	public City getCityPopulationByName(String name) {
		City city = null;
		try {
			System.out.println("---sleep----");
			Thread.sleep(5000);
			city = cityMapper.getCityPopulationByName(name);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return city;
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
