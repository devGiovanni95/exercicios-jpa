package modelo.umPraUm;

import javax.persistence.*;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private String nome;

//    /*Modo que e feito num paradigma de banco de dados*/
//    @Column(name = "assento_id")
//    private  Long assentoId;
    @OneToOne(cascade =  CascadeType.PERSIST) //faz com que -persista em colocar o assento que ante por meio do objeto nao era possive
    @JoinColumn(name = "assento_id", unique = true)
    private Assento assento;

    public Cliente(){

    }

    public Cliente(String nome, Assento assento) {
        this.nome = nome;
        this.assento = assento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Assento getAssento() {
        return assento;
    }

    public void setAssento(Assento assento) {
        this.assento = assento;
    }
}
