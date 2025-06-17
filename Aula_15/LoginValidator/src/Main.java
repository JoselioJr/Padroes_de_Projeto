import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o login: ");
        String login = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String password = scanner.nextLine();

        ValidationHandler handlerChain = new LoginExistsHandler();
        handlerChain
            .setNext(new UppercaseHandler())
            .setNext(new LowercaseHandler())
            .setNext(new SpecialCharacterHandler())
            .setNext(new NumberHandler())
            .setNext(new ConsecutiveNumbersHandler())
            .setNext(new MinLengthHandler())
            .setNext(new MaxLengthHandler());

        try {
            handlerChain.validate(login, password);
            System.out.println("\nLogin e senha válidos!");
        } catch (Exception e) {
            System.out.println("Erro de validação: " + e.getMessage());
        }

        scanner.close();
    }
}