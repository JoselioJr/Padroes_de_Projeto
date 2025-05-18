public class Main {
    public static void main(String[] args) {
        ViolaoPrototype v1 = FabricaDeVioloes.criarViolao("classico");
        ViolaoPrototype v2 = FabricaDeVioloes.criarViolao("folk");
        ViolaoPrototype v3 = FabricaDeVioloes.criarViolao("flet");
        ViolaoPrototype v4 = FabricaDeVioloes.criarViolao("jumbo");
        ViolaoPrototype v5 = FabricaDeVioloes.criarViolao("7cordas");
        ViolaoPrototype v6 = FabricaDeVioloes.criarViolao("12cordas");
        ViolaoPrototype v7 = FabricaDeVioloes.criarViolao("zero");
        ViolaoPrototype v8 = FabricaDeVioloes.criarViolao("00");
        ViolaoPrototype v9 = FabricaDeVioloes.criarViolao("000");

        ((Violao) v1).exibirInfo();
        ((Violao) v2).exibirInfo();
        ((Violao) v3).exibirInfo();
        ((Violao) v4).exibirInfo();
        ((Violao) v5).exibirInfo();
        ((Violao) v6).exibirInfo();
        ((Violao) v7).exibirInfo();
        ((Violao) v8).exibirInfo();
        ((Violao) v9).exibirInfo();
    }
}
