package entities;

import java.util.Calendar;

public class Pedido {
    private Integer id;
    private String instante;
    private StatusPedido status;

    public Pedido(Integer id, StatusPedido status) {
        this.id = id;
        this.instante = getDateTime(Calendar.getInstance());
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInstante() {
        return instante;
    }

    public void setInstante(String instante) {
        this.instante = instante;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public static String getDateTime(Calendar calendar) {
        int dia = calendar.get(Calendar.DAY_OF_MONTH);
        int mes = calendar.get(Calendar.MONTH) + 1;
        int ano = calendar.get(Calendar.YEAR);
        int hora = calendar.get(Calendar.HOUR_OF_DAY);
        int minutos = calendar.get(Calendar.MINUTE);
        int segundo = calendar.get(Calendar.SECOND);

        return String.format("%d/%d/%d %d:%d:%d", dia, mes, ano, hora, minutos, segundo);
    }

    @Override
    public String toString() {
        return "Pedido ID = " + id + "\nHora = " + instante + "\nStatus = " + status;
    }
}