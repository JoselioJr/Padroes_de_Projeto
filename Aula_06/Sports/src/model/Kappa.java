package model;

public class Kappa implements IFabrica{

    @Override
    public ICamisa camisa() {
        return new CamisaVasco();
    }
    
}
