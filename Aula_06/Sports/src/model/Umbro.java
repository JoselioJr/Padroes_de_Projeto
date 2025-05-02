package model;

public class Umbro implements IFabrica{

    @Override
    public ICamisa camisa() {
        return new CamisaFluminense();
    }
    
}
