package Liskov_Substitution.Errado;

public class Quadrado extends Retangulo{
    // Construtor
    public Quadrado(double altura, double comprimento) {
        super(altura, comprimento);
    }
    
    // Métodos
    @Override
    public void setAltura(double altura){
        setAltura(altura);
        setComprimento(altura);
    }

    @Override
    public void setComprimento(double comprimento){
        setAltura(comprimento);
        setComprimento(comprimento);
    }
}
