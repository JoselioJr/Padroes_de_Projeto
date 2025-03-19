package Liskov_Substitution.Correto;

public class Pinguim extends Passaro{
    // Construtor
    public Pinguim(String nomeCientifico, String familia) {
        super(nomeCientifico, familia);
    }
    
    // Método herdado da classe Passaro
    @Override
    public void emitirSom() {
        System.out.println("Sons de Pinguim!");
    }
    
    // Método da classe
    public void nadar(){
        System.out.println("O Pinguim está nadando!");
    }
}
