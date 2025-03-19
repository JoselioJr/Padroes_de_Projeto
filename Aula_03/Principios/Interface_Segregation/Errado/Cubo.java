package Interface_Segregation.Errado;

public class Cubo implements FormaGeometrica{
    // Atributos
    private double aresta;

    // Construtor
    public Cubo(double aresta) {
        this.aresta = aresta;
    }

    // Encapsulamento
    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }

    // Métodos da interface FormaGeometrica
    @Override
    public double calculoArea() {
        // Não é possível calcular a área de um Cubo
        return 0;
    }

    @Override
    public double calculoVolume() {
        return Math.pow(aresta, 3);
    }
}
