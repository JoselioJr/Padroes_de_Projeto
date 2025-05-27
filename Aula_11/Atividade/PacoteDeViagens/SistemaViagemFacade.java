import java.util.List;

public class SistemaViagemFacade {
    SistemaPassagem passagem;
    SistemaHotel hotel;
    SistemaCarro carro;
    SistemaPagamento pagamento;

    public SistemaViagemFacade() {
        passagem = new SistemaPassagem();
        hotel = new SistemaHotel();
        carro = new SistemaCarro();
        pagamento = new SistemaPagamento();
    }

    public void comprarPacote(List<Comprador> compradores, String poltrona, String tipoHotel, String tipoCarro, String formaPagamento, int parcelas) {
        System.out.println("-- Compradores --");
        for (Comprador c : compradores) {
            System.out.println(c);
        }

        Passagem p = passagem.reservar(poltrona);
        Hotel h = hotel.reservar(tipoHotel);
        Carro car = carro.alugar(tipoCarro);

        double total = p.preco + h.precoPorPessoa * compradores.size() + car.preco;
        double totalFinal = pagamento.calcularValor(total, formaPagamento, parcelas);

        System.out.println("\n-- Dados da Compra --");
        System.out.println("Poltrona: " + p.poltrona + " (" + p.classe + ") - R$ " + String.format("%.2f", p.preco));
        System.out.println("Hotel: " + h.tipo + " - R$ " + String.format("%.2f", h.precoPorPessoa) + " por pessoa");
        System.out.println("Carro: " + car.tipo + " - R$ " + String.format("%.2f", car.preco));
        System.out.println("Forma de Pagamento: " + formaPagamento + (formaPagamento.equals("Crédito") ? " em " + parcelas + "x" : ""));

        System.out.println("\nValor total bruto: R$ " + String.format("%.2f", total));
        System.out.println("Valor final com desconto/acréscimo: R$ " + String.format("%.2f", totalFinal));
    }
}
