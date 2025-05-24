public class Paypal implements PagamentoStrategy{

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento no valor de R$"+valor+" realizado com Paypal!");
    }

}
