package services;

import org.springframework.stereotype.Service;

import data.entities.City;
import data.repositories.CityRepository;

@Service
public class CityService extends ServiceBase<City> {
	public CityService(CityRepository repo) {
		super(repo);
	}

}
