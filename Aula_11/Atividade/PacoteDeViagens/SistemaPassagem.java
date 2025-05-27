public class SistemaPassagem {
    public Passagem reservar(String poltrona) {
        int fileira = Integer.parseInt(poltrona.substring(0, poltrona.length() - 1));
        String classe;
        double preco;

        if (fileira <= 3) {
            classe = "1° Classe";
            preco = 500 * 2.5 * 1.5;
        } else if (fileira <= 8) {
            classe = "Executiva";
            preco = 500 * 2.5;
        } else {
            classe = "Econômica";
            preco = 500;
        }

        return new Passagem(poltrona, classe, preco);
    }
}
