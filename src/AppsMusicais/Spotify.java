package AppsMusicais;

import AppsMusicais.Cantores.Cantor;
import AppsMusicais.IReprodutor.IReproduce;

import java.util.ArrayList;
import java.util.List;

public class Spotify implements IReproduce {
    private List<Cantor> cantorMusics;

    public Spotify() {
        this.cantorMusics = new ArrayList<Cantor>();
    }
    @Override
    public void addMusics(String name, String namemsc, int position) {
        this.cantorMusics.add(new Cantor(name, namemsc, position));
    }

    @Override
    public void allMusicas() {
        for (Cantor c : this.cantorMusics
             ) {
            System.out.println("Sportify music "  + c.getName() + " " + c.getNameMusic() + " " + c.getPositionMusic())  ;
        }
    }

    @Override
    public String playMusic() {
        return "PLay";
    }

    @Override
    public String pauseMusic() {
        String p = " ";
        for (Cantor c: this.cantorMusics) {
            p = c.getNameMusic();
        }
        return "Pausada: " + p;
    }
}
