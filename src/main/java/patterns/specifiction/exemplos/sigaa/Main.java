package patterns.specifiction.exemplos.sigaa;

public class Main {

    public static void main(String[] args) {
        //Aluno willian = new Aluno("Willian", 8, 80);


        Aluno aluno = new AlunoBuilder()
                .comNome("Willian")
                .tirou(6)
                .comFrequencia(80).build();


        MediaSuperior6 mediaSuperior6 = new MediaSuperior6();

        FrequenciaSuperior75 frequenciaSuperior75 = new FrequenciaSuperior75();

        E regraComposta = new E(mediaSuperior6, frequenciaSuperior75);


        Sigaa sigaa = new Sigaa(regraComposta);


        boolean resultado = sigaa.estaAprovado(aluno);
        System.out.println(resultado);
    }
}
