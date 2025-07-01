package patterns.trabalho.v1;

import java.util.Arrays;
import java.util.List;

public class Menu {
    private String titulo;
    private List<ItemMenu> itensDeMenu;

    public Menu(String titulo, ItemMenu... itens) {
        this.titulo = titulo;
        this.itensDeMenu = Arrays.asList(itens);
    }

    public void exibir(){
        // exibir todos os itens de menu
    }
}
