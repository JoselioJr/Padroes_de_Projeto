package Liskov_Substitution.Errado;

public class Retangulo {
    // Atributos
    private double altura;
    private double comprimento;

    // Construtor
    public Retangulo(double altura, double comprimento) {
        this.altura = altura;
        this.comprimento = comprimento;
    }

    // Encapsulamento
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    // Método para calcular a Área
    public double calculaArea(double altura, double comprimento){
        return altura * comprimento;
    }
}