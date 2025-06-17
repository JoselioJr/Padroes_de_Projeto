public class LivroIterator implements Iterator {
    private Livro[] Livros;
    private int posicao = 0;

    public LivroIterator(Livro[] Livros) {
        this.Livros = Livros;
    }

    @Override
    public boolean hasNext() {
        return posicao < Livros.length && Livros[posicao] != null;
    }

    @Override
    public Livro next() {
        return Livros[posicao++];
    }
}