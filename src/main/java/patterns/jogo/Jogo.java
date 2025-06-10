package patterns.jogo;

public class Jogo {
    private Tentativa tentativa;

    public Jogo(Tentativa tentativa) {
        this.tentativa = tentativa;
    }

    public void jogar(){
        if(this.tentativa.acertou()){
            System.out.println("Voce Ganhou");
        } else {
            System.out.println("Voce perdeu");
        }
    }
}
