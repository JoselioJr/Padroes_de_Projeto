public class Main {
    public static void main(String[] args) {
        notificacao = new EmailDecorator(notificacao);
        notificacao = new SMSDecorator(notificacao);
        notificacao = new WhatsAppDecorator(notificacao);

        System.out.println(notificacao.enviar("Olá, usuário!"));
    }
}
