package model;

public class Nike implements IFabrica{

    @Override
    public ICamisa camisa() {
        return new CamisaBrasil();
    }
    
}