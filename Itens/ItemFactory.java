package Itens;
import java.util.Date;

public class ItemFactory {
    public Item criarItem(String tipo, int id, String nome, double preco, Date validade, int diasGarantia) {
        if (tipo.equals("perecivel")) {
            return new ItemPerecivel(id, nome, preco, validade);
        } else {
            return new ItemDuravel(id, nome, preco, diasGarantia);
        }
    }
}