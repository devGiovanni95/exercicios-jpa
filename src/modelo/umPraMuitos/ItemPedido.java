package modelo.umPraMuitos;

import modelo.basico.Produto;

import javax.persistence.*;

@Entity
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int quantidade;

    @Column(nullable = false)
    private Double preco;

    @ManyToOne
    private Pedido pedido;

/*Definido por padrao mesmo sem colocar*/
    @ManyToOne(fetch = FetchType.EAGER)
    private Produto produto;

    public ItemPedido(){

    }

    public ItemPedido( Pedido pedido, Produto produto, int quantidade) {
        this.setPedido(pedido);
        this.setProduto(produto);
        this.setQuantidade(quantidade);
    }

    //    public ItemPedido(int quantidade, Pedido pedido, Produto produto) {
//        this.quantidade = quantidade;
//        this.pedido = pedido;
//        this.produto = produto;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
        if (produto != null && this.preco == null){
            this.setPreco(produto.getPreco());
        }
    }
}
