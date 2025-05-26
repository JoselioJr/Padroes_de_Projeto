import java.util.Scanner;

public class LojaQuadrinhos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escolha o nível do cliente (BRONZE, PRATA, OURO, PLATINA):");
        String nivelStr = scanner.nextLine().trim().toUpperCase();

        try {
            NivelCliente nivel = NivelCliente.valueOf(nivelStr);
            CaixaAssinatura caixa = new CaixaAssinatura(nivel);
            caixa.mostrarConteudo();
        } catch (IllegalArgumentException e) {
            System.out.println("Nível inválido! Por favor, digite BRONZE, PRATA, OURO ou PLATINA.");
        }

        scanner.close();
    }
}
