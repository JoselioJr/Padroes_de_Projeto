public class SistemaCarro {
    public Carro alugar(String tipo) {
        double preco;
        switch (tipo) {
            case "Executivo":
                preco = 150 * 2;
                break;
            case "Luxo":
                preco = 150 * 4;
                break;
            default:
                preco = 150;
        }
        return new Carro(tipo, preco);
    }
}
