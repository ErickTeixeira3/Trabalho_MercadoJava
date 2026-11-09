package Itens;
import java.util.Date;

public abstract class ItemPerecivel extends Item {
    private Date validade;
    
    protected ItemPerecivel(int id, String nome, double preco, Date validade, int quantidade, String marca) {
        super(id, nome, preco, quantidade, marca);
        this.validade = validade;
    }

    @Override 
    public String toString() {
        return super.toString() + ", Validade: " + validade;
    }

    // tive que por pq não tava funcionando por ser date
    @Override
    public ItemPerecivel clonar() {
        ItemPerecivel clone = (ItemPerecivel) super.clonar();
        clone.validade = new Date(this.validade.getTime());
        return clone;
    }



    // Getters e Setters
    public Date getValidade() {
        return validade;
    }
    public void setValidade(Date validade) {
        this.validade = validade;
    }
    
}
