package Interface_Segregation.Errado;

public class Triangulo implements FormaGeometrica {
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

    // Métodos da interface FormaGeometrica
    @Override
    public double calculoArea() {
        return (this.base * this.altura) / 2;
    }

    @Override
    public double calculoVolume() {
        // Não é possível calcular o volume de um Triangulo
        return 0;
    }
}
