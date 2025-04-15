package patterns.specifiction.exemplos.filtros;

public class Pessoa {
    private String nome;
    private String sexo;
    private String estadocivil;
    private String cidade;
    private int idade;

    public Pessoa(String nome, String sexo, String estadocivil, String cidade, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.estadocivil = estadocivil;
        this.cidade = cidade;
        this.idade = idade;
    }

    public String nome() {
        return nome;
    }

    public String sexo() {
        return sexo;
    }

    public String estadocivil() {
        return estadocivil;
    }

    public String cidade() {
        return cidade;
    }

    public int idade() {
        return idade;
    }
}
