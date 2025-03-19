package Interface_Segregation.Correto;

public class Quadrado implements FormaGeometrica2D{
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

    // Método da interface FormaGeometrica2D
    @Override
    public double calculoArea() {
        return this.lado * this.lado;
    }
}