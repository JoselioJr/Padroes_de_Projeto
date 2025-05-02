package model;

public class Puma implements IFabrica{

    @Override
    public ICamisa camisa() {
        return new CamisaBotafogo();
    }
    
}
