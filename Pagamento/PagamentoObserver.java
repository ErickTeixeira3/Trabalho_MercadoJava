package Pagamento;

public class PagamentoObserver implements Observer {
     @Override
     public void atualizar(String msg) {
         System.out.println(msg);
     }
 }