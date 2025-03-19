package Interface_Segregation.Correto;

public class Cubo implements FormaGeometrica3D{
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

    // Método da interface FormaGeometrica3D
    @Override
    public double calculoVolume() {
        return Math.pow(aresta, 3);
    } 
}
