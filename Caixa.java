import Itens.Item;
import Pagamento.TiposPagamento.PagamentoStrategy;

import java.util.ArrayList;
import java.util.List;

public class Caixa {
    private PagamentoStrategy pagamento;
    private List<Item> carrinho = new ArrayList<Item>();


    public Caixa(PagamentoStrategy pagamento){
        this.pagamento = pagamento;
    }

    public void adicionarItem(Item item){
        carrinho.add(item);
    }
    
    public double calcularTotal(){
        double total = 0;
        for(Item item : carrinho){
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
    }
    
    public void processarCompra() throws CarrinhoVazioException {
        if(carrinho.isEmpty()){
            throw new CarrinhoVazioException("O carrinho está vazio!");
        }
        pagamento.pagar(calcularTotal());
    }    
}
