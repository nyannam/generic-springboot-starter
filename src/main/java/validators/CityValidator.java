package validators;

import org.springframework.stereotype.Service;

import models.APICity;

@Service
public class CityValidator extends ValidatorBase<APICity> {
	

	    @Override
	    public boolean IsValidModel(APICity model) {
	        if (model == null) return false;
	        return true;
	    }
}
