package br.com.lojaconstrucao.model;

public class Pagamento {
    private int id;
    private Pedido pedido;
    private double valorPago;

    public Pagamento(int id, Pedido pedido, double valorPago) {
        this.id = id;
        this.pedido = pedido;
        this.valorPago = valorPago;
    }

    public int getId() { return id; }
    public Pedido getPedido() { return pedido; }
    public double getValorPago() { return valorPago; }

    public boolean estaPago() {
        return valorPago >= pedido.calcularTotal();
    }
}
