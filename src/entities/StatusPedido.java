package entities;

public enum StatusPedido {
    EM_EXPEDICAO("Em expedição"),
    EM_PROCESSAMENTO("Em Processamento"),
    ENTREGANDO("Entregando"),
    ENTREGUE("Entregue"),
    EXPEDIDO("Expedido"),
    PENDENTE_DE_PAGAMENTO("Pendente de pagamento"),
    PROCESSADO("processando");

    private String status;
    StatusPedido(String status){
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
