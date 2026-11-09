package Itens.Produtos;
import Itens.ItemPerecivel;
import java.util.Date;


public class PerecivelPrateleira extends ItemPerecivel {
    
    public PerecivelPrateleira(int id, String nome, double preco, Date validade, int quantidade, String marca) {
        super(id, nome, preco, validade, quantidade, marca);
    }
}
