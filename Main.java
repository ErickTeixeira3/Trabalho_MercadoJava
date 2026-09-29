import Itens.ItemFactory;
import Pagamento.Pagamento;
import Pagamento.PagamentoPix;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ItemFactory novoItem = new ItemFactory();

        Itens.Item item1 = novoItem.criarItem("perecivel", 1, "Carne", 20.0, new Date(), 0, 1);
        Itens.Item item2 = novoItem.criarItem("duravel", 2, "Geladeira", 1000.0, new Date(), 365, 1);

        Pagamento pagamento = new PagamentoPix();
        Caixa caixa = new Caixa(pagamento);

        caixa.adicionarItem(item1);
        caixa.adicionarItem(item2);

        try {
            caixa.processarCompra();
        } catch (CarrinhoVazioException e) {
            System.out.println("Erro ao processar a compra: " + e.getMessage());
        }


    }
}
