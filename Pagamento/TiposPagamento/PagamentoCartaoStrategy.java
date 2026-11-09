package Pagamento.TiposPagamento;

import Pagamento.Observer;
import java.util.ArrayList;
import java.util.List;

public class PagamentoCartaoStrategy implements PagamentoStrategy{
    double taxa = 0.05;
    double limiteCartao = 1000.0; 

    private List<Observer> notificaveis = new ArrayList<>();

    //para implementar estoque, emissor de NF, etc
    public void adicionarNotificavel(Observer notificavel) {
        notificaveis.add(notificavel);
    }

    public void notificar(String msg) {
        for (Observer notificavel : notificaveis) {
            notificavel.atualizar(msg);
        }
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Pagando " + (valor + valor*taxa) + " com cartão");

        if (valor > limiteCartao) {
            notificar("Pagamento recusado: valor excede o limite do cartão");
        } else {
            notificar("Pagamento aprovado");
        }
    }  

}
