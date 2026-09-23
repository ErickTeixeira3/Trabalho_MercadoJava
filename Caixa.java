import Itens.Item;
import Pagamento.Pagamento;
import java.util.ArrayList;
import java.util.List;

public class Caixa {
    private Pagamento pagamento;
    private List<Item> carrinho = new ArrayList<Item>();

    public void adicionarItem(Item item){
        carrinho.add(item);
    }
    
    public double calcularTotal(){
        double total = 0;
        for(Item item : carrinho){
            total += item.getPreco();
        }
        return total;
    }
    
    public void setPagamento(Pagamento pagamento){
        this.pagamento = pagamento;
    }
    public void processarCompra(){
        pagamento.pagar(calcularTotal());
    }    
}
