public enum NivelCliente {
    BRONZE(3),
    PRATA(5),
    OURO(7),
    PLATINA(10);

    private final int limiteItens;

    NivelCliente(int limiteItens) {
        this.limiteItens = limiteItens;
    }

    public int getLimiteItens() {
        return limiteItens;
    }
}
