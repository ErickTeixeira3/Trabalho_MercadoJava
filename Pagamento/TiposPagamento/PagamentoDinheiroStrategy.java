package Pagamento.TiposPagamento;
public class PagamentoDinheiroStrategy implements PagamentoStrategy{
    @Override
    public void pagar(double valor) {
        System.out.println("Pagando " + valor + " em dinheiro");
    }
}
