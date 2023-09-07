package AppsMusicais;

import AppsMusicais.Cantores.Cantor;
import AppsMusicais.IReprodutor.IReproduce;

import java.util.ArrayList;
import java.util.List;

public class Deezer implements IReproduce {
    private List<Cantor> addCantor;

    public Deezer() {
        this.addCantor = new ArrayList<Cantor>();
    }

    @Override
    public void addMusics(String name, String namemsc, int position) {
        this.addCantor.add(new Cantor(name, namemsc, position));
    }

    @Override
    public void allMusicas() {
        for (Cantor c : this.addCantor) {
            System.out.println("Deezer play musica: " + c.getNameMusic()+ " " + c.getName()+ " " + c.getPositionMusic());
        }
    }

    @Override
    public String playMusic() {
        String p = "";
        for (Cantor c : this.addCantor) {
            p = c.getNameMusic();
        }
        return "Play musica: " + p;

    }

    @Override
    public String pauseMusic() {
        String p = "";
        for (Cantor c : this.addCantor) {
            p = c.getNameMusic();
        }
        return "Pause musica: " + p;
    }
}
