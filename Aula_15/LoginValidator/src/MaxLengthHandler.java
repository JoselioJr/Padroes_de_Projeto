public class MaxLengthHandler extends ValidationHandler {
    @Override
    protected void handle(String login, String password) throws Exception {
        if (password.length() > 16) {
            throw new Exception("A senha deve ter no máximo 16 caracteres!");
        }
    }
}