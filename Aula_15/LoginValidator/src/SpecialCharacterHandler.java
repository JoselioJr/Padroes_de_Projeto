public class SpecialCharacterHandler extends ValidationHandler {
    @Override
    protected void handle(String login, String password) throws Exception {
        if (!password.matches(".*[@#$%&*].*")) {
            throw new Exception("A senha deve conter pelo menos um caractere especial (@, #, $, %, &, *)!");
        }
    }
}