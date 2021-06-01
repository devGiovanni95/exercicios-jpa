package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario2 {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class, 1L);
        usuario.setNome("ErivanLopesAlterado");
        usuario.setEmail("erivanLopes@lanche.com.br");

        /*Mesmo tirando o merge que faz o update com o banco de dados teve uma alteração no banco de dados pois
        * como teve uma transaçao acionada de dados automaticamente o banco de daos fez essa nova alteração
        * no banco de dados mudando os dados
        * pois ele esta em um estado gerenciado*/
//        em.merge(usuario);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
