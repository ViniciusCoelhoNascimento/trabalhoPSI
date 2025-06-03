package patterns.prova1.dezoito;

public class Aluno implements Nome {
    private String nome;


    public Aluno(String nome) {
        this.nome = nome;
    }
    @Override
    public String nome() {
        return nome;
    }

}