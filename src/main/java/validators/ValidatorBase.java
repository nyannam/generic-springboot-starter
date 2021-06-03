package validators;

public abstract class ValidatorBase<APIModel> {
    public abstract boolean IsValidModel(APIModel model);
}
