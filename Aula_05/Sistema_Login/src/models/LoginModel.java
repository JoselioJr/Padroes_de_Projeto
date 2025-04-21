package models;

//Importação da classe de listas dinâmicas
import java.util.ArrayList;

public class LoginModel {
    //Criação da instância e lista de usuários
    private static LoginModel instance;
    private ArrayList<UserModel> listUser = new ArrayList<UserModel>();

    //Construtor vazio
    private LoginModel(){}

    //Gerar uma nova instãncia
    public static LoginModel getInstance() {
        if (instance == null) {
            instance = new LoginModel();
        }
        return instance;
    }

    //Método para adicionar um novo usuário
    public void addUser(UserModel user) {
        listUser.add(user);
    }

    //Função para verificar se os dados do usuário estão corretos para login
    public boolean verifyLogin(String name, String password){
        for(int i = 0 ; i < listUser.size() ; i++){
            if (name.equalsIgnoreCase(listUser.get(i).getName()) && password.equals(listUser.get(i).getPassword())) {
                return true;
            }
        }
        return false;
    }

    //Função que gera o códgio Captcha
    public String captcha(int size){
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%&*";
        StringBuilder captcha = new StringBuilder();

        for(int i = 0 ; i < size ; i++){
            int index = (int) (Math.random() * chars.length());
            captcha.append(chars.charAt(index));
        }

        return captcha.toString();
    }
}