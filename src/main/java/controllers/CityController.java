package controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import controllers.ControllerBase;

import data.entities.City;
import mappers.CityMapper;
import mappers.MapperBase;
import models.APICity;
import services.CityService;
import services.ServiceBase;
import validators.CityValidator;
import validators.ValidatorBase;

@RestController
@RequestMapping(path = "/api/city")
public class CityController extends ControllerBase<APICity,City>{

	public CityController(CityService service, CityMapper mapper,
			CityValidator validator) {
		super(service, mapper, validator);
	}

}
