package modelo.heranca;

import javax.persistence.*;

/*neste caso so vai criar uma tabela para as duas opcoes variando dentro da tabela aluno se é AL / AB*/


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo", length = 2, discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("AL")
public class Aluno1 {

    @Id
    private Long matricula;

    private String nome;

    public Aluno1() {
    }

    public Aluno1(Long matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
