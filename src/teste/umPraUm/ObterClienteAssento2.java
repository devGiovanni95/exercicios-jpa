package teste.umPraUm;

import infra.DAO;
import modelo.umPraUm.Assento;
import modelo.umPraUm.Cliente;

public class ObterClienteAssento2 {
    public static void main(String[] args) {

        DAO<Cliente> daoCliente = new DAO<>(Cliente.class);

        Cliente cliente = daoCliente.obterPorId(2L);
        System.out.println(cliente.getAssento().getNome());

        daoCliente.fechar();

        DAO<Assento> daoAssento = new DAO<>(Assento.class);
        Assento assento = daoAssento.obterPorId(2L);

        System.out.println(cliente.getAssento().getCliente().getNome());

        daoAssento.fechar();
    }
}
