package patterns.observer.exemplos.noticia;

public class Usuario implements Observador {
    private String nome;
    private String email;
    public Usuario(String nome, String mail) {
        this.email = email;
        this.nome = nome;

    }

    @Override
    public void update() {
        System.out.println("notificacao chegou");
    }
}
