package Sigle_Responsibility.Errado;

public class Departamento {
    // Atributos
    private String area;
    private String caracteristica;

    // Construtor
    public Departamento(String area, String caracteristica) {
        this.area = area;
        this.caracteristica = caracteristica;
    }

    // Encapsulamento
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }
}
