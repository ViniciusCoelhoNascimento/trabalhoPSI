package patterns.trabalho.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RequerimentoValidado {
    private String avaliador;
    private Requerimento requerimento;
    private List<AtividadeValidada> atividadesValidadas;

    public RequerimentoValidado(String avaliador, Requerimento requerimento) {
        this.avaliador = avaliador;
        this.requerimento = requerimento;
        this.atividadesValidadas = new ArrayList<>();
    }

    public void validar() {
        Scanner scanner = new Scanner(System.in);

        // Para cada atividade declarada
        for(AtividadeDeclarada ad: requerimento.getAtividadesDeclaradas()) {
            System.out.println("Atividade declarada " + ad.nome() + " limite " + ad.limiteMaximo());

            System.out.println("É válida");
            boolean valida = scanner.nextLine().trim().equalsIgnoreCase("sim");

            int horasValidadas = 0;

            if (valida) {
                horasValidadas = Integer.parseInt(scanner.nextLine().trim());
            }
            this.adicionar(new AtividadeValidada(ad, horasValidadas));
        }



    }
    public void adicionar(AtividadeValidada atividadeValida){
        this.atividadesValidadas.add(atividadeValida);
    }

    public List<AtividadeValidada> getAtividadesValidadas() {
        return atividadesValidadas;
    }

    public int  total(){
        int t = 0;
        for(AtividadeValidada av : this.atividadesValidadas) {
            t+=av.horasValidadas();

        }
        return t;
    }
}

