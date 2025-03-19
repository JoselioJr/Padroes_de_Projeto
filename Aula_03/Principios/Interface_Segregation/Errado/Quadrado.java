package Interface_Segregation.Errado;

public class Quadrado implements FormaGeometrica{
    // Atributos
    private double lado;

    // Construtor
    public Quadrado(double lado) {
        this.lado = lado;
    }

    // Encapsulamento
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    // Métodos da interface FormaGeometrica
    @Override
    public double calculoArea() {
        return this.lado * this.lado;
    }

    @Override
    public double calculoVolume() {
        // Não é possível calcular o volume de um Quadrado
        return 0;
    }
}
