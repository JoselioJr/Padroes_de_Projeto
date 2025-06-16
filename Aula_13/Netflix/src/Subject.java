public interface Subject {
    void registerObserver(Observer o, Genre genre);
    void removeObserver(Observer o, Genre genre);
    void notifyObservers(String title, Genre genre);
}