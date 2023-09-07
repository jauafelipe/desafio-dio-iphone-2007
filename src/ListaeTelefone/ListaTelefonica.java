package ListaeTelefone;

import java.util.ArrayList;
import java.util.List;

public class ListaTelefonica implements IListTelefone{
    List<Telefone> telefoneList;
    public ListaTelefonica() {
        this.telefoneList = new ArrayList<Telefone>();
    }

    @Override
    public void addContacts(String name, int number) {
        this.telefoneList.add(new Telefone(name, number));
    }

    @Override
    public void allList() {
        for (Telefone t: this.telefoneList
             ) {
            System.out.println("telefone:" + t.getName() + " " + t.getNumber());
        }
    }
}
