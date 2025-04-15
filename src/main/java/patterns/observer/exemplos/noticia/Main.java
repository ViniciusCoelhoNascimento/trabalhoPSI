package patterns.observer.exemplos.noticia;

public class Main {
    public static void main(String[] args) {

        Observador usuario1 = new Usuario("Ana", "ana@mail.com");
        Observador usuario2 = new Usuario("Ze", "ze@mail.com");

        Subject noticia = new Noticia("Titulo da notícia", "conteúdo da Notícia");

        noticia.registrar(usuario1);
        noticia.registrar(usuario2);

        noticia.notificar(); // ambos usuarios recebem a notificacao de nova noticia


        noticia.desresgistrar(usuario2);


        noticia.notificar(); // somente usuario 1 recebe a notificacao de nova noticia
    }
}
