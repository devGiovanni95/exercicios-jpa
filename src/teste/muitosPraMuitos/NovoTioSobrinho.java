package teste.muitosPraMuitos;

import infra.DAO;
import modelo.muitosPraMuitos.Sobrinho;
import modelo.muitosPraMuitos.Tio;

public class NovoTioSobrinho {

    public static void main(String[] args) {

        Tio tia1 = new Tio("Maria");
        Tio tio2 = new Tio("João");

        Sobrinho sobrinho1 = new Sobrinho("Junior");
        Sobrinho sobrinha2 = new Sobrinho("Ana");

        /*fazendo a relacao bi direcional
        * de um modo padrao */
        tia1.getSobrinhos().add(sobrinho1);
        sobrinho1.getTios().add(tia1);

        tia1.getSobrinhos().add(sobrinha2);
        sobrinha2.getTios().add(tia1);

        tio2.getSobrinhos().add(sobrinho1);
        sobrinho1.getTios().add(tio2);

        tio2.getSobrinhos().add(sobrinha2);
        sobrinha2.getTios().add(tio2);

        DAO<Object> dao = new DAO<>();
        dao.abritTransacao()
                .incluir(tia1)
                .incluir(tio2)
                .incluir(sobrinho1)
                .incluir(sobrinha2)
                .fecharTransacao()
                .fechar();
    }
}
