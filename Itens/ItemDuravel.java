package Itens;
public abstract class ItemDuravel extends Item {
    private int diasGarantia;

    protected ItemDuravel(int id, String nome, double preco, int diasGarantia, int quantidade, String marca) {
        super(id, nome, preco, quantidade, marca);
        this.diasGarantia = diasGarantia;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Dias de Garantia: " + diasGarantia;
    }


    // Getters e Setters
    public int getDiasGarantia() {
        return diasGarantia;
    }
    public void setDiasGarantia(int diasGarantia) {
        this.diasGarantia = diasGarantia;
    }
    
}
