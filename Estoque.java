import java.util.ArrayList;
import Itens.Item;

public class Estoque {
    public ArrayList<Item> itens;
    public Estoque(){
        this.itens = new ArrayList<Item>();
    }
    public void adicionarItem(Item item){
        this.itens.add(item);
    }
    public void removerItem(Item item){
        this.itens.remove(item);
    }
    public void listarItens(){
        for(Item item : this.itens){
            System.out.println(item.getNome());
        }
    }
    public Item buscarItem(int id){
        for(Item i : this.itens){
            if(i.getId() == id){
                return i;
            }
        }
        return null;
    }
}
