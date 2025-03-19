package Interface_Segregation.Correto;

public class Triangulo implements FormaGeometrica2D{
    // Atributos
    private double base;
    private double altura;

    // Construtor
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Encapsulamento
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método da interface FormaGeometrica2D
    @Override
    public double calculoArea() {
        return (this.base * this.altura) / 2;
    }   
}
