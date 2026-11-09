package Itens.Fabricas;
import java.util.Date;

import Itens.ItemDuravel;
import Itens.ItemPerecivel;
import Itens.Produtos.PerecivelBalcao;
import Itens.Produtos.DuravelBalcao;

public class FabricaBalcao implements FabricaItem {
    public ItemPerecivel criarPerecivel(int id, String nome, double preco, Date validade, int quantidade, String marca) {
        return new PerecivelBalcao(id, nome, preco, validade, quantidade, marca);
    }
    public ItemDuravel criarDuravel(int id, String nome, double preco, int diasGarantia, int quantidade, String marca) {
        return new DuravelBalcao(id, nome, preco, diasGarantia, quantidade, marca);
    }
}