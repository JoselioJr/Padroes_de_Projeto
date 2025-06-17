public class LivroCollection {
    private Livro[] livros;
    private int i = 0;

    public LivroCollection(int tamanho) {
        livros = new Livro[tamanho];
    }

    public void addLivro(Livro Livro) {
        if (i < livros.length) {
            livros[i++] = Livro;
        }
    }

    public Iterator createIterator() {
        return new LivroIterator(livros);
    }
}