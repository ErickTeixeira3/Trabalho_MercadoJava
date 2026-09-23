package Itens;
public class ItemDuravel extends Item {
    private int diasGarantia;

    public ItemDuravel(int id, String nome, double preco, int diasGarantia, int quantidade) {
        super(id, nome, preco, quantidade);
        this.diasGarantia = diasGarantia;
    }
    // Getters e Setters
    public int getDiasGarantia() {
        return diasGarantia;
    }
    public void setDiasGarantia(int diasGarantia) {
        this.diasGarantia = diasGarantia;
    }
    
}
