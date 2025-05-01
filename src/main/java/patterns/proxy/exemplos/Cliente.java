package patterns.proxy.exemplos;

public class Cliente {
    private int id;
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int id(){
        return this.id;
    }

    public String nome(){
        return  this.nome;
    }

    public void setId(int id) {
        this.id = id;
    }
}
