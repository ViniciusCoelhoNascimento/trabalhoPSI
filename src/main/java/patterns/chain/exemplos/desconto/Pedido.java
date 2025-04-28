package patterns.chain.exemplos.desconto;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Item> itens;

    public Pedido() {
        this.itens = new ArrayList<>();
    }

    public void adicionar(Item item) {
        itens.add(item);
    }

    public int quantidadeDeItens() {
        return itens.size();
    }

    public double total(){
        double total = 0.0;

        for(Item item : this.itens){
            total+= item.preco();
        }
        return total;
    }
}
