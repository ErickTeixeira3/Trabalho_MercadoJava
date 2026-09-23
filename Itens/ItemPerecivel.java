package Itens;
import java.util.Date;

public class ItemPerecivel extends Item {
    private Date validade;
    
    public ItemPerecivel(int id, String nome, double preco, Date validade) {
        super(id, nome, preco);
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
