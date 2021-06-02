package teste.umPraUm;

import infra.DAO;
import modelo.umPraUm.Assento;
import modelo.umPraUm.Cliente;

public class NovoClienteAssento1 {

    public static void main(String[] args) {

        Assento assento = new Assento("7C");
        Cliente cliente = new Cliente("carlos", assento);

        DAO<Object> dao = new DAO<>();

        /*Inserimos primeiro o assento pois se nao tiver o assento a
        tabela cliente nao conseguira associar a pessoa com um assento
         pelo fato de na tabela cliente possuir um a chave estrangeira
         que é o id do assento, (se executarmos ao contrario dara um
         erro por nao existir o id estrangeiro de assentos)*/
        dao.abritTransacao()
                .incluir(assento)
                .incluir(cliente)
                .fecharTransacao()
                .fechar();
    }
}
