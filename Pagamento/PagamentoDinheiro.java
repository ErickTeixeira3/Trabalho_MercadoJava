package Pagamento;
public class PagamentoDinheiro implements Pagamento{
    @Override
    public void pagar(double valor) {
        System.out.println("Pagando " + valor + " em dinheiro");
    }
}
