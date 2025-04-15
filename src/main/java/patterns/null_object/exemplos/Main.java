package patterns.null_object.exemplos;

public class Main {

    public static void main(String[] args) {
        Personagem batman = new Personagem("Batman");
        Personagem coringa = new Personagem("Coringa");

        System.out.println("Batman" + batman.vida());

        System.out.println("Coringa" + coringa.vida());

        Arma machado = new Faca();

        batman.setArma(machado);

        batman.atacar(coringa);

        System.out.println("Coringa" + coringa.vida());

    }
}
