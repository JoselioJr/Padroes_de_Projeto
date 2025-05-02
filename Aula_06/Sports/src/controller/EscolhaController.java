package controller;

import model.*;
import view.EscolhaView;

public class EscolhaController {
    private EscolhaView view;

    public EscolhaController(EscolhaView view) {
        this.view = view;
    }

    public void escolhaDeTime(){
        int opcao = view.getTime();
        IFabrica fabrica = null;

        switch (opcao) {
            case 1:
                fabrica = new Nike();
                break;
            case 2:
                fabrica = new Adidas();
                break;
            case 3:
                fabrica = new Puma();
                break;
            case 4:
                fabrica = new Umbro();
                break;
            case 5:
                fabrica = new Kappa();
                break;
            default:
                System.out.println("Time não encontrado!");
                break;
        }

        ICamisa camisa = fabrica.camisa();
        camisa.informacoesCamisa();
    }
}
