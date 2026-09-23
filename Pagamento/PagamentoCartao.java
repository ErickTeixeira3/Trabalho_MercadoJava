package Pagamento;
public class PagamentoCartao implements Pagamento{
    @Override
    public void pagar(double valor) {
        System.out.println("Pagando " + valor + " com cartão");
    }
}
