import java.util.Arrays;
import java.util.List;

public class UserDatabase {
    private static final List<String> validLogins = Arrays.asList("user1", "admin", "testuser");

    public static boolean isLoginRegistered(String login) {
        return validLogins.contains(login);
    }
}