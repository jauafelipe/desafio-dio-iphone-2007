package AppsMusicais.IReprodutor;

import java.util.List;

public interface IReproduce {

    void addMusics(String name, String namemsc, int position);

    void allMusicas();

    String playMusic();

    String pauseMusic();
}

