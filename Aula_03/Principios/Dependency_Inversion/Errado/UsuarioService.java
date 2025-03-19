package Dependency_Inversion.Errado;

public class UsuarioService {
    // Dependência Direta
    private EmailService emailService = new EmailService();

    // Método de notificação ao usuário
    public void notificarUsuario(){
        emailService.enviarEmail("Bem-vindo ao sistema!");
    }
}
