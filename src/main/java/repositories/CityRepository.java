package repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import entities.City;

public interface CityRepository extends CrudRepository<City, Long> {
	List<City> findAll();

}
