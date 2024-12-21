package projecto.models;

public class Venda {
    private int id;
    private String cliente;
    private String produto;
    private int quantidade;
    private String totalPago;
    private String nifVenda;
    public Venda(int id, String cliente, String produto, int quantidade, String totalPago, String nifVenda){
        this.id = id;
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
        this.totalPago = totalPago;
        this.nifVenda = nifVenda;
    }


    public int getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public String getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getTotalPago() {
        return totalPago;
    }

    public String getNifVenda() {
        return nifVenda;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setTotalPago(String totalPago) {
        this.totalPago = totalPago;
    }

    public void setNifVenda(String nifVenda) {
        this.nifVenda = nifVenda;
    }
}
