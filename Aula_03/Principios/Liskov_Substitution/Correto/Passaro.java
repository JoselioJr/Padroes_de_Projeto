package Liskov_Substitution.Correto;

public abstract class Passaro {
    // Atributos
    private String nomeCientifico;
    private String familia;

    // Construtor
    public Passaro(String nomeCientifico, String familia) {
        this.nomeCientifico = nomeCientifico;
        this.familia = familia;
    }

    // Encapsulamento
    public String getNomeCientifico() {
        return nomeCientifico;
    }

    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    // Método abstrato
    public abstract void emitirSom();
}
