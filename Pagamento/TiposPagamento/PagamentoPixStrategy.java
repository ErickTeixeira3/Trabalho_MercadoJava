package Pagamento.TiposPagamento;
public class PagamentoPixStrategy implements PagamentoStrategy{
    double taxa = 0.02;

    @Override
    public void pagar(double valor) {
        System.out.println("Pagando " + (valor + valor*taxa) + " com pix");
    }
}
