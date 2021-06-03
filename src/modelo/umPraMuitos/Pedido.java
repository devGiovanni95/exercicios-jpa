package modelo.umPraMuitos;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Date data;

    /*Criando um ligacao bidirecional*//*Por padra ja e trazido esta opcao mesmo nao declarando*/

//    @OneToMany(mappedBy = "pedido", fetch = FetchType.LAZY)

    //usado para trazer de uma unica vez para que, nao de erro se o DAO fechar estiver acima do foreach
    @OneToMany(mappedBy = "pedido", fetch = FetchType.EAGER)
    private List<ItemPedido> itens;

    public Pedido() {
        this(new Date());
    }

    public Pedido(Date data) {
        super();
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }
}
