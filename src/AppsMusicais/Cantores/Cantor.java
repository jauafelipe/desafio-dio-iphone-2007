package AppsMusicais.Cantores;

public class Cantor {
    private String name;
    private String nameMusic;
    private int positionMusic;

    public Cantor(String name, String nameMusic, int positionMusic) {
        this.name = name;
        this.nameMusic = nameMusic;
        this.positionMusic = positionMusic;
    }

    public String getName() {
        return name;
    }

    public String getNameMusic() {
        return nameMusic;
    }

    public int getPositionMusic() {
        return positionMusic;
    }

}
