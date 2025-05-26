public enum Item {
    QUADRINHO("Quadrinho", 15.00),
    CHAVEIRO("Chaveiro", 5.00),
    BUSTO("Busto", 10.00),
    ADESIVO("Adesivo", 1.00),
    POSTER("Poster", 25.00),
    CAMISETA("Camiseta", 25.00),
    CANETA("Caneta", 3.00),
    MINIATURA("Miniatura", 20.00);

    private final String nome;
    private final double preco;

    Item(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
