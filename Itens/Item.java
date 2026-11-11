package Itens;
public abstract class Item implements Prototype, Cloneable {
    private int id;
    private String nome;
    private double preco;
    private int quantidade;
    private String marca;

    public Item(int id, String nome, double preco, int quantidade, String marca) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.marca = marca;
    }

    @Override
    public Item clonar(){
        try {
            return (Item) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }


    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String toString(){
        return "Id: " + id + ", Nome: " + nome + ", Preço: " + preco + ", Quantidade: " + quantidade + ", Marca: " + marca;
    }
}