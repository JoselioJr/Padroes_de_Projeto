import java.util.*;

public class StreamingPlatform implements Subject {
    private Map<Genre, List<Observer>> observers;

    public StreamingPlatform() {
        observers = new HashMap<>();
        for (Genre genre : Genre.values()) {
            observers.put(genre, new ArrayList<>());
        }
    }

    @Override
    public void registerObserver(Observer o, Genre genre) {
        observers.get(genre).add(o);
    }

    @Override
    public void removeObserver(Observer o, Genre genre) {
        observers.get(genre).remove(o);
    }

    @Override
    public void notifyObservers(String title, Genre genre) {
        for (Observer o : observers.get(genre)) {
            o.update(title, genre);
        }
    }

    public void addNewContent(String title, Genre genre) {
        System.out.println("\n[PLATFORM] Novo conteúdo adicionado: \"" + title + "\" - Gênero: " + genre);
        notifyObservers(title, genre);
    }
}