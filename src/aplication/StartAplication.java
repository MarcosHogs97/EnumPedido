package aplication;

import entities.Pedido;
import entities.StatusPedido;

import java.util.Calendar;
import java.util.Date;

public class StartAplication {

    public static void main(String[] args) {
        //Instanciar um Pedido (obj)
        Pedido pedido = new Pedido(777, StatusPedido.EM_PROCESSAMENTO);
        System.out.println(pedido);
        //Converter um objeto String em enum
        //Instancia de pedido2, receber um status de entregue.
        StatusPedido pedido2 = StatusPedido.ENTREGUE;
        String pedido4 = StatusPedido.EM_PROCESSAMENTO.getStatus();

        StatusPedido pedido3 = StatusPedido.valueOf("ENTREGANDO");

        System.out.println(pedido2);
        System.out.println(pedido3.getStatus());
        System.out.println(pedido4);
    }

}
