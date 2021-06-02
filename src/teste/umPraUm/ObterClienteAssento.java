package teste.umPraUm;

import infra.DAO;
import modelo.umPraUm.Cliente;

public class ObterClienteAssento {
    public static void main(String[] args) {

        DAO<Cliente> dao = new DAO<>(Cliente.class);

        Cliente cliente = dao.obterPorId(3L);
        System.out.println(cliente.getAssento().getNome());
        System.out.println(cliente.getAssento().getCliente().getNome());

        dao.fechar();
    }
}
