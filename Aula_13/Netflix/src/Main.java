public class Main {
    public static void main(String[] args) {
        StreamingPlatform netflix = new StreamingPlatform();

        User user1 = new User("Alice");
        User user2 = new User("Bob");
        User user3 = new User("Carlos");
        User user4 = new User("Diana");
        User user5 = new User("Eduardo");

        netflix.registerObserver(user1, Genre.ACTION);
        netflix.registerObserver(user1, Genre.COMEDY);

        netflix.registerObserver(user2, Genre.ANIME);

        netflix.registerObserver(user3, Genre.ACTION);
        netflix.registerObserver(user3, Genre.SCI_FI);

        netflix.registerObserver(user4, Genre.HORROR);
        netflix.registerObserver(user4, Genre.COMEDY);

        netflix.registerObserver(user5, Genre.SCI_FI);
        netflix.registerObserver(user5, Genre.ANIME);

        netflix.addNewContent("Missão Impossível", Genre.ACTION);
        netflix.addNewContent("Dragon Ball Super", Genre.ANIME);
        netflix.addNewContent("Interestelar", Genre.SCI_FI);
        netflix.addNewContent("Corra!", Genre.HORROR);
        netflix.addNewContent("Se Beber, Não Case", Genre.COMEDY);
    }
}