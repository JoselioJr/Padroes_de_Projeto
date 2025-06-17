public class ConsecutiveNumbersHandler extends ValidationHandler {
    @Override
    protected void handle(String login, String password) throws Exception {
        char[] chars = password.toCharArray();

        for (int i = 0; i < chars.length - 2; i++) {
            if (Character.isDigit(chars[i]) && Character.isDigit(chars[i + 1]) && Character.isDigit(chars[i + 2])) {
                int n1 = Character.getNumericValue(chars[i]);
                int n2 = Character.getNumericValue(chars[i + 1]);
                int n3 = Character.getNumericValue(chars[i + 2]);

                if ((n1 + 1 == n2 && n2 + 1 == n3) || (n1 - 1 == n2 && n2 - 1 == n3)) {
                    throw new Exception("A senha não pode conter 3 números consecutivos em sequência (Ex.: 123 ou 321)!");
                }
            }
        }
    }
}