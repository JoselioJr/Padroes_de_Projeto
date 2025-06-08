public class Main {
    public static void main(String[] args) {
        Notificacao notificacao = new NotificacaoSimples();
        notificacao = new EmailDecorator(notificacao);
        notificacao = new SMSDecorator(notificacao);
        notificacao = new SlackDecorator(notificacao);
        notificacao = new WhatsAppDecorator(notificacao);

        System.out.println(notificacao.enviar("Mensagem importante!"));
    }
}