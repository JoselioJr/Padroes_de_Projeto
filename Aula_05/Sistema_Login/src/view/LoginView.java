package view;

//Importação da classe Scanner para interação com o usuário
import java.util.Scanner;

public class LoginView {
    //Chamada do Scanner
    private Scanner scan = new Scanner(System.in);

    //Função que recebe o nome digitado
    public String getName(){
        System.out.print("Digite o seu nome: ");
        return scan.nextLine();
    }

    //Função que recebe a senha digotada
    public String getPassword(){
        System.out.print("Digite a sua senha: ");
        return scan.nextLine();
    }

    //Função que recebe o código digitado
    public String verifyCaptcha(String captcha){
        System.out.println("Digite o código de segurança: "+captcha);
        System.out.print("Código: ");
        return scan.nextLine();
    }

    //Método que retona se o login foi bem sucedido
    public void showSucces(){
        System.out.println("Login realizado com sucesso!");
    }

    //Método que retona se o login não foi bem sucedido
    public void showFailure(){
        System.out.println("Nome de usuário ou senha incorrestos!");
    }

    //Método que retona se a validação do Captcha não foi bem sucedido
    public void showCaptcharError(){
        System.out.println("Código de segurança incorreto!");
    }

    //Método que retona a mensagem de cadastro
    public void registerMessage(){
        System.out.println("----------CADASTRO----------");
    }

    //Método que retona a mensagem de login
    public void loginMessage(){
        System.out.println("----------LOGIN----------");
    }
}
