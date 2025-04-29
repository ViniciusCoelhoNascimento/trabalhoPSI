package patterns.flyweight.exemplos.musica;

import java.util.List;
//import org.jfugue.player.Player;

public class Piano {
    public void tocar(List<Nota> composicao){


        String musica = "";

        for(Nota n : composicao){
            musica+= n.simbolo();
            musica+= " ";

            System.out.println(musica);


       //     Player p =new Player();
        //    p.play(musica);
        }

    }
}
