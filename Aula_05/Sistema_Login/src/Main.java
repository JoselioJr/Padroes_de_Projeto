//Importação das classes
import models.LoginModel;
import view.LoginView;
import controllers.LoginController;
import controllers.Register;

public class Main {

    public static void main(String[] args) {
        //Chamada das classes
        LoginModel model = LoginModel.getInstance();
        LoginView view = new LoginView();
        Register register = new Register(model, view);
        LoginController controller = new LoginController(model, view);

        //Chamada dos métodos de registro e login
        register.regiterUser();
        controller.effectLogin();
    }
}