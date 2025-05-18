public abstract class Violao implements ViolaoPrototype {
    protected String tipo;      
    protected String descricao;
    protected String cordas;
    protected boolean eletrico;

    @Override
    public ViolaoPrototype clonar() {
        try {
            return (Violao) this.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Erro ao clonar violão", e);
        }
    }

    public void exibirInfo() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Cordas: " + cordas);
        System.out.println("Elétrico: " + (eletrico ? "Sim" : "Não"));
        System.out.println("---------------------------------");
    }
}
