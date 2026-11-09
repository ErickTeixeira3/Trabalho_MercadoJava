package Itens.Fabricas;
import java.util.Date;

import Itens.ItemDuravel;
import Itens.ItemPerecivel;
import Itens.Produtos.PerecivelPrateleira;
import Itens.Produtos.DuravelPrateleira;

public class FabricaPrateleira implements FabricaItem {
    public ItemPerecivel criarPerecivel(int id, String nome, double preco, Date validade, int quantidade, String marca) {
        return new PerecivelPrateleira(id, nome, preco, validade, quantidade, marca);
    }
    public ItemDuravel criarDuravel(int id, String nome, double preco, int diasGarantia, int quantidade, String marca) {
        return new DuravelPrateleira(id, nome, preco, diasGarantia, quantidade, marca);
    }
}
