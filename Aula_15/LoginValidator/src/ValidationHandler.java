public abstract class ValidationHandler {
    private ValidationHandler next;

    public ValidationHandler setNext(ValidationHandler next) {
        this.next = next;
        return next;
    }

    public void validate(String login, String password) throws Exception {
        handle(login, password);
        if (next != null) {
            next.validate(login, password);
        }
    }

    protected abstract void handle(String login, String password) throws Exception;
}