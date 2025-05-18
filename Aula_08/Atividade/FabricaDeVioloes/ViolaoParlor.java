public class ViolaoParlor extends Violao implements Cloneable {
    public ViolaoParlor(String subtipo) {
        tipo = "Violão " + subtipo;
        cordas = "6 cordas de aço";
        eletrico = false;

        switch (subtipo) {
            case "Zero":
                descricao = "Compacto, confortável para tocar por muito tempo.";
                break;
            case "Duplo Zero":
                descricao = "Boa sonoridade, ideal para fingerstyle.";
                break;
            case "Triplo Zero":
                descricao = "Timbre peculiar, tamanho intermediário.";
                break;
        }
    }
}
