import Itens.Fabricas.FabricaBalcao;
import Itens.Fabricas.FabricaItem;
import Itens.Fabricas.FabricaPrateleira;
import Itens.Item;
import Itens.ItemDuravel;
import Itens.ItemPerecivel;
import Pagamento.PagamentoObserver;
import Pagamento.TiposPagamento.PagamentoCartaoStrategy;
import Pagamento.TiposPagamento.PagamentoDinheiroStrategy;
import Pagamento.TiposPagamento.PagamentoPixStrategy;
import Pagamento.TiposPagamento.PagamentoStrategy;

import java.util.Date;


public class Main {
    public static void main(String[] args) {
        FabricaItem balcao = new FabricaBalcao();
        FabricaItem prateleira = new FabricaPrateleira();


        ItemPerecivel queijo = balcao.criarPerecivel(1, "Queijo", 10, new Date(), 10, "Tirol");
        ItemDuravel TV = balcao.criarDuravel(2, "TV", 1000.0, 365, 1, "Samsung");
        ItemPerecivel arroz = prateleira.criarPerecivel(3, "Arroz", 20, new Date(), 5, "Buriti");
        ItemDuravel boneca = prateleira.criarDuravel(4, "Boneca", 50, 30, 5, "Barbie");

        System.out.println(queijo);
        System.out.println(TV);
        System.out.println(arroz);
        System.out.println(boneca);

        ItemPerecivel queijo2 = queijo.clonar();
        queijo2.setId(5);
        queijo2.setMarca("Piracanjuba");
        queijo2.setPreco(12);
        queijo2.setValidade(new Date());

        ItemDuravel TV2 = TV.clonar();
        TV2.setId(6);
        TV2.setMarca("LG");
        TV2.setPreco(1200);

        System.out.println("Itens clonados");
        System.out.println(queijo);
        System.out.println(queijo2);
        System.out.println(TV);
        System.out.println(TV2);


        PagamentoCartaoStrategy pagamento = new PagamentoCartaoStrategy();
        PagamentoPixStrategy pagamentoPix = new PagamentoPixStrategy();

        pagamento.adicionarNotificavel(new PagamentoObserver());
        
        Caixa caixa = new Caixa(pagamento);
        Caixa caixaPix = new Caixa(pagamentoPix);

        caixa.adicionarItem(TV);
        caixa.adicionarItem(arroz);
        caixa.adicionarItem(boneca);

        caixaPix.adicionarItem(TV);
        caixaPix.adicionarItem(arroz);
        caixaPix.adicionarItem(boneca);

        try {
            caixa.processarCompra();
        } catch (CarrinhoVazioException e) {
            System.out.println("Erro ao processar a compra: " + e.getMessage());
        }

        try {
            caixaPix.processarCompra();
        } catch (CarrinhoVazioException e) {
            System.out.println("Erro ao processar a compra: " + e.getMessage());
        }

    }
}
