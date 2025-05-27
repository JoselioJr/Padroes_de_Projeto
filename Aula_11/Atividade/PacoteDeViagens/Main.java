import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Comprador> compradores = Arrays.asList(
                new Comprador("Alice", "123.456.789-00"),
                new Comprador("Bob", "987.654.321-00")
        );

        SistemaViagemFacade sistema = new SistemaViagemFacade();
        sistema.comprarPacote(compradores, "2A", "Executivo", "Luxo", "Crédito", 3);
    }
}
