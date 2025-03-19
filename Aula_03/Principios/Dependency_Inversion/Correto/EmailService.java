package Dependency_Inversion.Correto;

public class EmailService implements Notificador{
    // Implementação para envio por e-mail
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando E-mail: "+mensagem);
    }
}