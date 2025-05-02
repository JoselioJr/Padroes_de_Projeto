import controller.EscolhaController;
import view.EscolhaView;

public class Main {
    public static void main(String[] args) {
        EscolhaView view = new EscolhaView();
        EscolhaController controller = new EscolhaController(view);

        controller.escolhaDeTime();
    }
}
