public class Main {
    public static void main(String[] args) {
        Assinatura assinatura = new AssinaturaBasica();

        assinatura = new Pacote1(assinatura);
        assinatura = new Pacote3(assinatura);
        assinatura = new Pacote5(assinatura);

        System.out.println("Descrição: " + assinatura.getDescricao());
        System.out.printf("Preço Total: R$ %.2f\n", assinatura.getPreco());
    }
}
