package patterns.observer.exemplos.noticia;

public interface Subject {
    void registrar(Observador observdor);

    void notificar();

    void desresgistrar(Observador usuario2);
}
