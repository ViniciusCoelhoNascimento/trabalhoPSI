package patterns.composite.exemplos.pastas;

public class Arquivo  implements Componente{
    private String nome;

    public Arquivo(String nome) {
        this.nome = nome;
    }

    @Override
    public String exibir() {
        return this.nome;

    }
}
