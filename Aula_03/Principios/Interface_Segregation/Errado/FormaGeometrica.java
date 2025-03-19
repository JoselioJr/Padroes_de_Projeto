package Interface_Segregation.Errado;

public interface FormaGeometrica {
    // Métodos de duas formas geometricas, 2D e 3D. Não podem ficar juntas
    public double calculoArea();
    public double calculoVolume();
}
