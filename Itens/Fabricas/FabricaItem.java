package Itens.Fabricas;
import java.util.Date;

import Itens.ItemDuravel;
import Itens.ItemPerecivel;

public interface FabricaItem {
    ItemPerecivel criarPerecivel(int id, String nome, double preco, Date validade, int quantidade, String marca);
    
    ItemDuravel criarDuravel(int id, String nome, double preco, int diasGarantia, int quantidade, String marca);
}
