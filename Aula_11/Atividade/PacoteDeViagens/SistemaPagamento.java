public class SistemaPagamento {
    public double calcularValor(double total, String formaPagamento, int parcelas) {
        switch (formaPagamento) {
            case "Pix":
                return total * 0.9;
            case "Boleto":
                return total * 0.95;
            case "Crédito":
                if (parcelas > 1) {
                    return total * Math.pow(1.0399, parcelas - 1);
                }
                return total;
            default:
                return total;
        }
    }
}
