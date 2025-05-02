package model;

public class Adidas  implements IFabrica{

    @Override
    public ICamisa camisa() {
        return new CamisaFlamengo();
    }
    
}
