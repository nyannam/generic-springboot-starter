package services;

import org.springframework.stereotype.Service;

import entities.City;
import repositories.CityRepository;

@Service
public class CityService extends ServiceBase<City> {
	public CityService(CityRepository repo) {
		super(repo);
	}

}
