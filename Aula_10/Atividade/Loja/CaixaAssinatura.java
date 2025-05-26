import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class CaixaAssinatura {
    private final NivelCliente nivel;
    private final List<Item> itens = new ArrayList<>();
    private final Random random = new Random();

    public CaixaAssinatura(NivelCliente nivel) {
        this.nivel = nivel;
        gerarItens();
    }

    private void gerarItens() {
        Item[] todosItens = Item.values();
        int quantidade = nivel.getLimiteItens();
        for (int i = 0; i < quantidade; i++) {
            int indiceAleatorio = random.nextInt(todosItens.length);
            itens.add(todosItens[indiceAleatorio]);
        }
    }

    public void mostrarConteudo() {
        System.out.println("Nível do cliente: " + nivel);
        System.out.println("Itens na caixa:");
        Map<Item, Integer> contagemItens = new HashMap<>();
        for (Item item : itens) {
            contagemItens.put(item, contagemItens.getOrDefault(item, 0) + 1);
        }
        double total = 0.0;
        for (Map.Entry<Item, Integer> entrada : contagemItens.entrySet()) {
            Item item = entrada.getKey();
            int quantidade = entrada.getValue();
            double subtotal = quantidade * item.getPreco();
            System.out.printf("- %dx %s (R$ %.2f) => Subtotal: R$ %.2f%n", 
                quantidade, item.getNome(), item.getPreco(), subtotal);
            total += subtotal;
        }
        System.out.printf("Valor total da caixa: R$ %.2f%n", total);
    }
}
