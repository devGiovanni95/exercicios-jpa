package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NovoUsuario {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
        EntityManager em = emf.createEntityManager();

        Usuario novoUsuario = new Usuario("Rafaela", "rafaela@lanche.com.br");
//        novoUsuario.setId(1L);

        em.getTransaction().begin();
        em.persist(novoUsuario);
        em.getTransaction().commit();

        System.out.println("OI id gerado foi: " + novoUsuario.getId() + " Para o usuario: "+ novoUsuario.getNome());

        em.close();
        emf.close();
    }
}
