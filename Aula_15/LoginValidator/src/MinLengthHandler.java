public class MinLengthHandler extends ValidationHandler {
    @Override
    protected void handle(String login, String password) throws Exception {
        if (password.length() < 8) {
            throw new Exception("A senha deve ter no mínimo 8 caracteres!");
        }
    }
}