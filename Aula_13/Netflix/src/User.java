public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String title, Genre genre) {
        System.out.println("[NOTIFICAÇÃO] " + name + " foi notificado: Novo conteúdo \"" + title + "\" - Gênero: " + genre);
    }
}