public class Main {
    public static void main(String[] args) {
        /* Criando objeto do tipo 'Processador' */
        Processador ryzen5600x = new Processador("Processador AMD Ryzen 5 5600X 6 núcleos e 12 threads", 850.00);
        System.out.println(ryzen5600x.getDescricao());
        System.out.println(ryzen5600x.getPreco());
        System.out.println(ryzen5600x.getIdentificador());

        System.out.println("-------------------------------------------------------\n");

        Processador inteli5 = new Processador("Processador Intel i5 13500 6 nucleos", 750.00);
        System.out.println(inteli5.getDescricao());
        System.out.println(inteli5.getPreco());
        System.out.println(inteli5.getIdentificador());

        System.out.println("-------------------------------------------------------\n");
        /*Criando objetos do tipo 'Memoria'*/
        Memoria kingstonFury = new Memoria("Memoria Kingston Fury 8GB 3200mhz", 350.00, 8.00);
        System.out.println(kingstonFury.getDescricao());
        System.out.println(kingstonFury.getPreco());
        System.out.println(kingstonFury.getIdentificador());

        Memoria corsairVengeance = new Memoria("Memoria Corsair Vengeance Fury 8GB 3200mhz", 300.00, 8.00);
        System.out.println(corsairVengeance.getDescricao());
        System.out.println(corsairVengeance.getPreco());
        System.out.println(corsairVengeance.getIdentificador());

        System.out.println("-------------------------------------------------------\n");
        /*Criando objetos do tipo 'Gabinete'*/
        Gabinete gabineteValorantGamer = new Gabinete("Gabinete Valorant Gamer", ryzen5600x, kingstonFury);
        gabineteValorantGamer.adcionaMemoria(kingstonFury);
        gabineteValorantGamer.adcionaMemoria(kingstonFury);
        gabineteValorantGamer.adcionaMemoria(kingstonFury);
        System.out.println(gabineteValorantGamer.imprimePreco());
        System.out.println("\n");
        gabineteValorantGamer.imprimeComponentes();
        System.out.println(gabineteValorantGamer.getIdentificador());

        Gabinete gabineteGamerDota = new Gabinete("Gabinete Dota Gamer", inteli5, corsairVengeance);
        gabineteGamerDota.adcionaMemoria(corsairVengeance);
        gabineteGamerDota.adcionaMemoria(corsairVengeance);
        gabineteGamerDota.adcionaMemoria(corsairVengeance);
        System.out.println(gabineteGamerDota.imprimePreco());
        System.out.println("\n");
        gabineteGamerDota.imprimeComponentes();
        System.out.println(gabineteGamerDota.getIdentificador());

        System.out.println("-------------------------------------------------------\n");
        /*Criando objetos do tipo 'Monitor'*/
        Monitor monitorGamerAOC = new Monitor("Monitor Gamer AOC 144hz 31.5 polegadas", 1500.00, 31.5);
        System.out.println(monitorGamerAOC.getDescricao());
        System.out.println(monitorGamerAOC.getPreco());
        System.out.println(monitorGamerAOC.getPolegadas());
        System.out.println(monitorGamerAOC.getIdentificador());

        Monitor monitorGamerSamsung = new Monitor("Monitor Gamer Samsung 28 polegadas 240hz", 2000.00, 28.0);
        System.out.println(monitorGamerSamsung.getDescricao());
        System.out.println(monitorGamerSamsung.getPreco());
        System.out.println(monitorGamerSamsung.getPolegadas());
        System.out.println(monitorGamerSamsung.getIdentificador());

        System.out.println("-------------------------------------------------------\n");
        /* Contruindo objeto do tipo 'Teclado' */
        Teclado tecladoGamer = new Teclado("Teclado HyperX Alloy RGB", 400.00);
        System.out.println(tecladoGamer.getDescricao());
        System.out.println(tecladoGamer.getPreco());
        System.out.println(tecladoGamer.getIdentificador());

        Teclado tecladoMecanico = new Teclado("Teclado mecânico Cooler Master", 300.00);
        System.out.println(tecladoMecanico.getDescricao());
        System.out.println(tecladoMecanico.getPreco());
        System.out.println(tecladoMecanico.getIdentificador());

        System.out.println("-------------------------------------------------------\n");
        /* Contruindo objeto do tipo 'Computador' */
        Computador computadorValorantGamer = new Computador("Computador Gamer Valorant", gabineteValorantGamer, monitorGamerAOC, tecladoGamer);
        System.out.println(computadorValorantGamer.getDescricao());
        System.out.println(computadorValorantGamer.getIdentificador());
        System.out.println(computadorValorantGamer.imprimePreco());
        computadorValorantGamer.imprimeInformacoes();

        System.out.println("-------------------------------------------------------\n");

        Computador computadorGamerDota = new Computador("Computador Gamer Dota", gabineteGamerDota, monitorGamerSamsung, tecladoMecanico);
        System.out.println(computadorGamerDota.getDescricao());
        System.out.println(computadorGamerDota.getIdentificador());
        System.out.println(computadorGamerDota.imprimePreco());
        computadorGamerDota.imprimeInformacoes();
    }
}