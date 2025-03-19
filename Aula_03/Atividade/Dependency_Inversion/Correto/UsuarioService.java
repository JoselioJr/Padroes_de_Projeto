package Dependency_Inversion.Correto;

public class UsuarioService {
    // Dependência abstrata
    private Notificador notificador;

    // Construtor
    public UsuarioService(Notificador notificador){
        this.notificador = notificador;
    }

    // Encapsulamento
    public Notificador getNotificador() {
        return notificador;
    }

    public void setNotificador(Notificador notificador) {
        this.notificador = notificador;
    }

    // Método de envio de mensagem
    public void notificarUsuario(){
        notificador.enviarMensagem("Bem-vindo ao sistema!");
    }
}