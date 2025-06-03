package patterns.trabalho;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(new NomeNaoVazio(
                new NomeNaoNulo(
                        new NomePadrao("ana")
                )
        )
        );
        System.out.println(pessoa.nome());


    }
}


