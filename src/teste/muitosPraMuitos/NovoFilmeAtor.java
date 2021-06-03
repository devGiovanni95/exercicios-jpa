package teste.muitosPraMuitos;

import infra.DAO;
import modelo.muitosPraMuitos.Ator;
import modelo.muitosPraMuitos.Filme;

public class NovoFilmeAtor {

    public static void main(String[] args) {

        Filme filmeA = new Filme("Star Wars Ep 4", 8.1);
        Filme filmeB = new Filme("O Fugitivo", 8.9);

        Ator atorA = new Ator("Harrison Ford");
        Ator atrizB = new Ator("Carrie Fisher");

        filmeA.adionarAtor(atorA);
        filmeA.adionarAtor(atrizB);

        filmeB.adionarAtor(atorA);

        DAO<Filme> dao = new DAO<Filme>();
        dao.incluirAtomico(filmeA);
        /*como colocamos para ter o efeito CascadeType = Persist
        * npo momento que incluimos o filmeA ele adicionou os atores
        *  que por sua vez incluiu o filmeB pois tem atores iguai*/
//        dao.fechar();
    }
}
