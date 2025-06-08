public class Pacote2 extends PacoteDecorator {
    public Pacote2(Assinatura assinatura) {
        super(assinatura);
    }

    @Override
    public String getDescricao() {
        return assinatura.getDescricao() + "\nPacote 2: Frete Grátis";
    }

    @Override
    public double getPreco() {
        return assinatura.getPreco() + 9.99;
    }
}
