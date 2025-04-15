package patterns.composite.exemplos.pastas;

public class Teste {

    public static void main(String[] args) {
        Componente arquivo = new Arquivo("texto.doc");
        Diretorio pastaDeDocs = new Diretorio("Pasta de docs");
        Diretorio pastaimagens = new Diretorio("Pasta de imagens");
        pastaDeDocs.adicionar(arquivo);
        pastaDeDocs.adicionar(pastaimagens);

        System.out.println(pastaDeDocs.exibir());
    }
}
