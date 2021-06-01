package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
/*Nao gerenciado*/
public class AlterarUsuario3 {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class, 1L);
        em.detach(usuario);

        usuario.setNome("NovoErivan");
        em.merge(usuario);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
