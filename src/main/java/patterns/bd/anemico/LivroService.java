package patterns.bd.anemico;

import java.util.List;

public class LivroService {
    private LivroDao livroDao;

    public LivroService(LivroDao livroDao) {
        this.livroDao = livroDao;
    }

    public void cadastrarLivro(String titulo, String autor) {
        Livro livro = new Livro();
        livro.setTitulo(titulo);
        livro.setAutor(autor);
        this.livroDao.inserir(livro);
    }

    public List<Livro> listarLivros(){
        return livroDao.listarTodos();

    }
}
