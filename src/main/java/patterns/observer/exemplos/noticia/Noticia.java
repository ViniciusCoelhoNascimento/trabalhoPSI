package patterns.observer.exemplos.noticia;

import java.util.ArrayList;
import java.util.List;

public class Noticia implements Subject {
    private String titulo;
    private String conteudo;
    private List<Observador> observadores;

    public Noticia(String titulo, String conteudo) {
        this.conteudo = conteudo;
        this.titulo = titulo;
        this.observadores = new ArrayList<>();

    }


    @Override
    public void registrar(Observador observador) {
        this.observadores.add(observador);
       

    }

    @Override
    public void notificar() {
        for(Observador observador : this.observadores){
            observador.update();
        }

    }

    @Override
    public void desresgistrar(Observador observador) {
        this.observadores.remove(observador);

    }
}
