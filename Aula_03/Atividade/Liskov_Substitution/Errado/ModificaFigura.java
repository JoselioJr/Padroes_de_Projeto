package Liskov_Substitution.Errado;

public class ModificaFigura {
    // Método de mudança de tamanho da figura
    public void redimensionaTamanho(Retangulo retangulo){
        retangulo.setAltura(2 * retangulo.getAltura());
        retangulo.setComprimento(4 * retangulo.getComprimento());

    }
    // Como este método realiza a alteração do tamanho da figura em escalas diferentes, ao ralizar a mudança no Quadrado,
    // Ele deixará de ser um Quadrado por não ter o tamanho de sua Altura e Compriemnto iguais, como deve ser de um Quadrado.
}