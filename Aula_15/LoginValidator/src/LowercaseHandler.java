public class LowercaseHandler extends ValidationHandler {
    @Override
    protected void handle(String login, String password) throws Exception {
        if (!password.matches(".*[a-z].*")) {
            throw new Exception("A senha deve conter pelo menos uma letra minúscula!");
        }
    }
}