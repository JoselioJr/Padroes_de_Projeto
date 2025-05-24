public class CartaoDeCredito implements PagamentoStrategy{

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento no valor de R$"+valor+" realizado com cartão de crédito!");
    }

}
