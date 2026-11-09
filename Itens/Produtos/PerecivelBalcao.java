package Itens.Produtos;
import Itens.ItemPerecivel;
import java.util.Date;


public class PerecivelBalcao extends ItemPerecivel {
    
    public PerecivelBalcao(int id, String nome, double preco, Date validade, int quantidade, String marca) {
        super(id, nome, preco, validade, quantidade, marca);
    }
    
}
