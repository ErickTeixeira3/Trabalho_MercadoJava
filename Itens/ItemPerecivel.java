package Itens;
import java.util.Date;

public class ItemPerecivel extends Item {
    private Date validade;
    
    public ItemPerecivel(int id, String nome, double preco, Date validade, int quantidade) {
        super(id, nome, preco, quantidade);
        this.validade = validade;
    }
    // Getters e Setters
    public Date getValidade() {
        return validade;
    }
    public void setValidade(Date validade) {
        this.validade = validade;
    }
    
}
