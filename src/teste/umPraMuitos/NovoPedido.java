package teste.umPraMuitos;

import infra.DAO;
import modelo.basico.Produto;
import modelo.umPraMuitos.ItemPedido;
import modelo.umPraMuitos.Pedido;

public class NovoPedido {

    public static void main(String[] args) {

        DAO<Object> dao = new DAO<>();

        Produto produto = new Produto("Geladeira", 2789.99);
        Pedido pedido = new Pedido();
        ItemPedido item = new ItemPedido(pedido, produto, 10);

        dao.abritTransacao()
                .incluir(produto)
                .incluir(pedido)
                .incluir(item)
                .fecharTransacao()
                .fechar();


    }
}
