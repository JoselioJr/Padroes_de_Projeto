import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        Scanner scan = new Scanner(System.in);

        System.out.println("\n------------Formas de pagamento------------");
        System.out.println("1 - Cartão de Crédito;");
        System.out.println("2 - Paypal");

        System.out.print("\nDigite o valor: ");
        double valor = scan.nextDouble();
        scan.nextLine();

        System.out.print("Digite a forma de pagamento: ");
        String formaPagamento = scan.nextLine();

        switch (formaPagamento) {
            case "1":
                carrinho.setEstrategia(new CartaoDeCredito());
                carrinho.finalizarCompra(valor);

                break;
            
            case "Cartao":
                carrinho.setEstrategia(new CartaoDeCredito());
                carrinho.finalizarCompra(valor);

                break;

            case "2":
                carrinho.setEstrategia(new Paypal());
                carrinho.finalizarCompra(valor);

                break;

            case "Paypal":
                carrinho.setEstrategia(new Paypal());
                carrinho.finalizarCompra(valor);

                break;
            default:
                System.out.println("Forma de pagamento não autorizada!");

                break;
        }
    }
}
