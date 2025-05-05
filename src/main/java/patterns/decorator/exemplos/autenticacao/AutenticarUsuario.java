package patterns.decorator.exemplos.autenticacao;

public class AutenticarUsuario {
    private Item item;

    public AutenticarUsuario(Item item) {
        this.item = item;
    }

    public void cancelarItem(){
        System.out.println("Entre a senha:");
          this.item.cancelarItem();
    }
}
