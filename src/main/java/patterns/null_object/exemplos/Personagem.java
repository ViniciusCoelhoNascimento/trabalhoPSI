package patterns.null_object.exemplos;

public class Personagem {
    private String nome;
    private int vida;
    private Arma arma;

    public Personagem(String nome) {
        this.nome = nome;
        this.vida = 100;
        this.arma = new Desarmado();
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public void atacar(Personagem alvo){
            alvo.vida = alvo.vida - this.arma.dano();

    }

    public int vida(){
        return this.vida;
    }
}
