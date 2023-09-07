package ListaeTelefone;

import org.jetbrains.annotations.NotNull;

public class Telefone {
    private String name;
    private int number;

    public Telefone(String name, int num) {
        this.name=name;
        this.number=num;
    }
    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }



}
