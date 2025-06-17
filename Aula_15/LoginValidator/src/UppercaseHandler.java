public class UppercaseHandler extends ValidationHandler {
    @Override
    protected void handle(String login, String password) throws Exception {
        if (!password.matches(".*[A-Z].*")) {
            throw new Exception("A senha deve conter pelo menos uma letra maiúscula!");
        }
    }
}