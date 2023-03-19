/*Github:https://github.com/joao-vcth/ad1-programacao-oo/tree/main/src*/
public class AD1_POO {

    public static void main(String[] args) {
        /*Criando objetos do tipo Processador*/
        Processador ryzen7600X = new Processador("Processador AMD Ryzen 5 7600X 16 núcleos 32 threads",1700.00 );
        System.out.println(ryzen7600X.getDescricao());
        System.out.println(ryzen7600X.getPreco());
        System.out.println(ryzen7600X.getIdentificador());
        System.out.println();
        Processador intel13600k = new Processador("Processador Intel Core i5-13600K 6 núcleos", 2300.00);
        System.out.println(intel13600k.getDescricao());
        System.out.println(intel13600k.getPreco());
        System.out.println(intel13600k.getIdentificador());
        System.out.println();
        System.out.println("--------------------------------------------------------");
        System.out.println();
        /*Criando objetos do tipo memória*/
        Memoria kingstonFury = new Memoria("Memoria Kingston Fury DDR5 8GB", 500.00, 8.00);
        System.out.println(kingstonFury.getDescricao());
        System.out.println(kingstonFury.getPreco());
        System.out.println(kingstonFury.getCapacidade());
        System.out.println(kingstonFury.getIdentificador());
        System.out.println();
        Memoria corsairVengeance = new Memoria("Corsair Vengeance Fury DDR5 8GB", 400.00, 8.00);
        System.out.println(corsairVengeance.getDescricao());
        System.out.println(corsairVengeance.getPreco());
        System.out.println(corsairVengeance.getCapacidade());
        System.out.println(corsairVengeance.getIdentificador());
        System.out.println();
        System.out.println("--------------------------------------------------------");
        System.out.println();
        /*Criando objetos do tipo Monitor*/
        Monitor monitorAOC = new Monitor("Monitor AOC 144hz 31.5 polegadas", 1700.00, 31.5);
        System.out.println(monitorAOC.getDescricao());
        System.out.println(monitorAOC.getPreco());
        System.out.println(monitorAOC.getPolegadas());
        System.out.println(monitorAOC.getIdentificador());
        System.out.println();
        Monitor monitorSamsung = new Monitor("Monitor Samsung 240hz 28 poelgadas", 2000.00, 28.00);
        System.out.println(monitorSamsung.getDescricao());
        System.out.println(monitorSamsung.getPreco());
        System.out.println(monitorSamsung.getPolegadas());
        System.out.println(monitorSamsung.getIdentificador());
        System.out.println();
        System.out.println("--------------------------------------------------------");
        System.out.println();
        /*Criando objetos do tipo Teclado*/
        Teclado tecladoCM = new Teclado("Teclado Mecanico RGB Cooler Master", 550.00);
        System.out.println(tecladoCM.getDescricao());
        System.out.println(tecladoCM.getPreco());
        System.out.println(tecladoCM.getIdentificador());
        System.out.println();
        Teclado tecladoCorsair = new Teclado("Teclado Mecanico Corsair", 650.00);
        System.out.println(tecladoCorsair.getDescricao());
        System.out.println(tecladoCorsair.getPreco());
        System.out.println(tecladoCorsair.getIdentificador());
        System.out.println();
        System.out.println("--------------------------------------------------------");
        System.out.println();
        /*Criando objetos do tipo Gabinete*/
        Gabinete gabineteFpsGamer = new Gabinete("Gabinete FPS Gamer", ryzen7600X, kingstonFury);
        gabineteFpsGamer.adcionaMemoria(kingstonFury);
        gabineteFpsGamer.adcionaMemoria(kingstonFury);
        gabineteFpsGamer.adcionaMemoria(kingstonFury);
        System.out.println(gabineteFpsGamer.getDescricao());
        gabineteFpsGamer.imprimeComponentes();
        gabineteFpsGamer.imprimePreco();
        System.out.println(gabineteFpsGamer.getIdentificador());
        System.out.println();
        Gabinete gabineteMobaGamer = new Gabinete("Gabinete Moba Gamer", intel13600k, corsairVengeance);
        gabineteMobaGamer.adcionaMemoria(corsairVengeance);
        System.out.println(gabineteMobaGamer.getDescricao());
        gabineteMobaGamer.imprimeComponentes();
        gabineteMobaGamer.imprimePreco();
        System.out.println(gabineteMobaGamer.getIdentificador());
        System.out.println();
        System.out.println("--------------------------------------------------------");
        System.out.println();
        /*Criando objetos do tipo Computador*/
        Computador computadorValorant = new Computador("Computador Valorant", gabineteFpsGamer, monitorAOC, tecladoCM);
        computadorValorant.imprimeInformacoes();
        computadorValorant.imprimePreco();
        System.out.println();
        Computador computadorDota = new Computador("Computador Dota", gabineteMobaGamer, monitorSamsung, tecladoCorsair);
        computadorDota.imprimeInformacoes();
        computadorDota.imprimePreco();
    }
}