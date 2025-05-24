public class CarrinhoDeCompras {
    private PagamentoStrategy estrategia;

    public void setEstrategia(PagamentoStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void finalizarCompra(double valor) {
        estrategia.pagar(valor);
    }
}
