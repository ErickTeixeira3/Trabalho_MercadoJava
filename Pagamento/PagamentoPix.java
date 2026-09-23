package Pagamento;
public class PagamentoPix implements Pagamento{
    @Override
    public void pagar(double valor) {
        System.out.println("Pagando " + valor + " com pix");
    }
}
