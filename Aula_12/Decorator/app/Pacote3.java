public class Pacote3 extends PacoteDecorator {
    public Pacote3(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public String getDescricao() {
        return assinatura.getDescricao() + "\nPacote 3: Caixa surpresa";
    }

    @Override
    public double getPreco() {
        return assinatura.getPreco() + 29.99;
    }
}
