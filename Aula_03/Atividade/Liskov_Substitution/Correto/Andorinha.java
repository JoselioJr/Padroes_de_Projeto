package Liskov_Substitution.Correto;

public class Andorinha extends Passaro implements Voador {
    // Construtor
    public Andorinha(String nomeCientifico, String familia) {
        super(nomeCientifico, familia);
    }

    // Método herdado da classe Passaro
    @Override
    public void emitirSom() {
        System.out.println("Sons de uma Andorinha");
    }

    // Método da interface Voador
    @Override
    public void voar() {
        System.out.println("A andorinha está voando!");
    }
}
