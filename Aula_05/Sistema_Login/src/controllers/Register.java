package controllers;

//Importação das classes
import models.LoginModel;
import models.UserModel;
import view.LoginView;

public class Register {
    //Atributos
    private LoginModel login;
    private LoginView view;

    //Construtor
    public Register(LoginModel login, LoginView view) {
        this.login = login;
        this.view = view;
    }

    //Método para registrar um novo usuário
    public void regiterUser(){
        view.registerMessage();
        UserModel usuario = new UserModel(view.getName(), view.getPassword());

        login.addUser(usuario);
    }
}
