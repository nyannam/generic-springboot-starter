package mappers;

import org.springframework.stereotype.Component;

import entities.City;
import models.APICity;

@Component
public class CityMapper extends MapperBase<APICity, City>{

	public CityMapper() {
		super(APICity.class, City.class);
	}
	

}
