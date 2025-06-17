public class LoginExistsHandler extends ValidationHandler {
    @Override
    protected void handle(String login, String password) throws Exception {
        if (!UserDatabase.isLoginRegistered(login)) {
            throw new Exception("Login não cadastrado!");
        }
    }
}