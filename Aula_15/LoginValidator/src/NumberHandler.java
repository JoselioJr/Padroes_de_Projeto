public class NumberHandler extends ValidationHandler {
    @Override
    protected void handle(String login, String password) throws Exception {
        if (!password.matches(".*\\d.*")) {
            throw new Exception("A senha deve conter pelo menos um número!");
        }
    }
}