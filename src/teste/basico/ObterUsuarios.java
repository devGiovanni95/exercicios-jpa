package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class ObterUsuarios {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

//        String jpql = "select u from Usuario u";
//        TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
//      /*consulta com tipo <Usuario>  */
////        Usuario usuario = em.find(Usuario.class , 7L);
////        System.out.println(usuario.getNome());
//        query.setMaxResults(6);
//
//        List<Usuario> usuarios = query.getResultList();
        List<Usuario> usuarios = em
                .createQuery("select u from Usuario u", Usuario.class)
                .setMaxResults(5).getResultList();

        for (Usuario usuario: usuarios){
            System.out.println("ID: " + usuario.getId() + " E-mail: " + usuario.getEmail());
        }

        em.close();
        emf.close();
    }
}
