package Dependency_Inversion.Correto;

public class SMSService implements Notificador{
    // Implementação para envio por SMS
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando SMS: "+mensagem);
    }
}
