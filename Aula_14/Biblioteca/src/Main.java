public class Main {
    public static void main(String[] args) {
        LivroCollection library = new LivroCollection(5);

        library.addLivro(new Livro("Dom Casmurro", "Machado de Assis"));
        library.addLivro(new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry"));
        library.addLivro(new Livro("Harry Potter", "J.K. Rowling"));
        library.addLivro(new Livro("O Hobbit", "J.R.R. Tolkien"));

        Iterator iterator = library.createIterator();

        System.out.println("Lista de Livros na Biblioteca:");
        
        while (iterator.hasNext()) {
            Livro livro = iterator.next();
            System.out.println("- " + livro.getTitulo() + " (Autor: " + livro.getAutor() + ")");
        }
    }
}