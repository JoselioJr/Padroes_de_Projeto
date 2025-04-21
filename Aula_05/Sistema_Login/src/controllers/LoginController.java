package controllers;

//Importação das classes
import models.LoginModel;
import view.LoginView;

public class LoginController {
    //Atributos
    private LoginModel model;
    private LoginView view;

    //Construtor
    public LoginController(LoginModel model, LoginView view) {
        this.model = model;
        this.view = view;
    }

    //Método para efetuar o login
    public void effectLogin(){
        view.loginMessage();

        String name = view.getName();
        String password = view.getPassword();
        String captcha = model.captcha(6);
        String verify = view.verifyCaptcha(captcha);

        if (!captcha.equals(verify)) {
            view.showCaptcharError();
        }else if(model.verifyLogin(name, password)){
            view.showSucces();
        } else view.showFailure();
    }
}
